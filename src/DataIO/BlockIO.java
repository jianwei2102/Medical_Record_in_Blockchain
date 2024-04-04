package DataIO;

import Classes.*;
import blockchain.Block;
import blockchain.Verification;
import blockchain.Blockchain;
import blockchain.TransactionCollection;
import com.google.gson.Gson;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class BlockIO implements Serializable {
    public static ArrayList<Verification> allVerification = new ArrayList<>();
    private static final String masterFolder = "master";
    private static final String chainFile = masterFolder + "/chain.bin";
    
    public static void addNewBlock(String patientID, String doctorID, String category,
            String encryptedRecord, String signatureMessage) {
        Blockchain bc = Blockchain.getInstance();
        
        // If the blockchain doesn't exist
        if(!new File(masterFolder).exists()){
           new File(masterFolder).mkdir();
           // Create genesis block/ first block
           bc.genesis();
        }
        
        // Create New Block
        String previousHash = bc.get().getLast().getHeader().getCurrentHash();
        int previousIndex = bc.get().getLast().getHeader().getIndex();
        Block newBlock = new Block(previousHash, previousIndex);
        
        // Insert Transaction
        TransactionCollection tc = new TransactionCollection(patientID,doctorID,
                category, encryptedRecord,signatureMessage);
        newBlock.setTranxList(tc);
        
        // Add to Blockchain
        bc.nextBlock(newBlock);
        bc.distribute();
        
        allVerification.add(new Verification(doctorID, patientID, newBlock.getHeader().getCurrentHash(), 
                encryptedRecord, signatureMessage));
    }
    
    public static void readFromBlockchain() throws Exception {
        // Retrieve Blockchain data
        Blockchain bc = Blockchain.getInstance();
        LinkedList<Block> blockchain = bc.get();
        
        // Handle health record
        HealthRecordIO hrIO = HealthRecordIO.getInstance();
        
        // Loop through all the Block
        for (Block block : blockchain){
            // Skip the genesis block
            if(block.getHeader().getIndex() != 0) {
                String encryptedRecord = block.getTranxList().getEncryptedHealthRecord();
                String patientID = block.getTranxList().getPatientID();
                Patient p = PatientIO.checkPatient(patientID);
                // Check if the patient exists
                if (p != null) {
                    // Decrypt the encrypted record
                    String record = hrIO.decryptRecord(encryptedRecord);
                    
                    // Determine the health record category and add to patient health record
                    switch (block.getTranxList().getCategory()) {
                        case "BloodTest":
                            BloodTest bt = new Gson().fromJson(record, BloodTest.class);
                            p.getMyHealthRecord().getBloodTests().add(bt);
                            break;
                        case "Hospitalization":
                            Hospitalization hp = new Gson().fromJson(record, Hospitalization.class);
                            p.getMyHealthRecord().getHospitalizations().add(hp);
                            break;
                        case "MedicalHistory":
                            MedicalHistory mh = new Gson().fromJson(record, MedicalHistory.class);
                            p.getMyHealthRecord().getMedicalHistories().add(mh);
                            break;
                        case "MedicalInformation":
                            MedicalInformation mi = new Gson().fromJson(record, MedicalInformation.class);
                            p.getMyHealthRecord().getMedicalInformations().add(mi);
                            break;
                        case "UrineTest":
                            UrineTest ut = new Gson().fromJson(record, UrineTest.class);
                            p.getMyHealthRecord().getUrineTests().add(ut);
                            break;
                        case "Vaccination":
                            Vaccination vc = new Gson().fromJson(record, Vaccination.class);
                            p.getMyHealthRecord().getVaccinations().add(vc);
                            break;
                        case "VitalSign":
                            VitalSign vs = new Gson().fromJson(record, VitalSign.class);
                            p.getMyHealthRecord().getVitalSigns().add(vs);
                            break;
                        default:
                    }
                }
                
                // Add to all veridication
                allVerification.add(new Verification(block.getTranxList().getDoctorID(), patientID, 
                        block.getHeader().getCurrentHash(), encryptedRecord, block.getTranxList().getSignatureMessage()));
            }
        }
    }
}
