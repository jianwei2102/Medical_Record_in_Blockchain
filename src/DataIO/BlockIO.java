package DataIO;

import Classes.MedicalHistory;
import Classes.Patient;
import blockchain.Block;
import blockchain.Blockchain;
import blockchain.TransactionCollection;
import com.google.gson.Gson;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class BlockIO implements Serializable {
    // Add to blockchain
    private static final String masterFolder = "master";
    private static final String chainFile = masterFolder + "/chain.bin";
    
    // New -> Genesis -> direct add
    public static void addNewBlock(String patientID, String doctorID, String category,
            String encryptedRecord, String signatureMessage) {
        Blockchain bc = Blockchain.getInstance();
        if(!new File(masterFolder).exists()){
           new File(masterFolder).mkdir();
           /* Create genesis block/ first block */
           bc.genesis();
        }
        String previousHash = bc.get().getLast().getHeader().getCurrentHash();
        int previousIndex = bc.get().getLast().getHeader().getIndex();
        Block newBlock = new Block(previousHash, previousIndex);

        TransactionCollection tc = new TransactionCollection(patientID,doctorID,
                category, encryptedRecord,signatureMessage);
        newBlock.setTranxList(tc);
        bc.nextBlock(newBlock);
        bc.distribute();
    }
    
    public static void readFromBlockchain() throws Exception {
        Blockchain bc = Blockchain.getInstance();
        LinkedList<Block> blockchain = bc.get(); // Retrieve blockchain data
        
        HealthRecordIO hrIO = new HealthRecordIO();
        for (Block block : blockchain ){
            if(block.getHeader().getIndex() != 0) {
                String patientID = block.getTranxList().getPatientID();
                System.out.println(block.getTranxList().getCategory());
                
                Patient p = PatientIO.checkPatient(patientID);
                // check if exist
                
                if(block.getTranxList().getCategory().equals("MedicalHistory")){
                    // decrypt
                    String record = hrIO.decryptRecord(block.getTranxList().getEncryptedHealthRecord());
//                    System.out.println(record);
                    
                    // Use Gson to deserialize the JSON string into a Java object
                    MedicalHistory mh = new Gson().fromJson(record, MedicalHistory.class);
                    p.getMyHealthRecord().getMedicalHistories().add(mh);
//                    ArrayList<MedicalHistory> medicalHistories = p.getMyHealthRecord().getMedicalHistories();
//                    for (MedicalHistory mh1 : medicalHistories) {
//                        System.out.println(mh1);
//                    }
                }
            }
        }
        
        // logic
        // switch case
        // "category"
        // eg if the categoriy is BloodTest,
        // Add to PatientIO.checkUsername(IC).getBloodTests.add(new BloodTest(..Data));
    }
    
    // Read transaction - for validate
    // To read all transaction
    
}
