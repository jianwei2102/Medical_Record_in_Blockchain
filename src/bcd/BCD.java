package bcd;

import Classes.MedicalHistory; // To remove
import Classes.Patient;
import Classes.Doctor;
import DataIO.DataIO;
import DataIO.BlockIO;
import DataIO.DoctorIO;
import DataIO.PermissionIO; // To remove
import DataIO.HealthRecordIO; // To remove
import UIUX.Login;
// Import ALL UIUX here
import blockchain.Blockchain; // to remove

public class BCD {
    public static Login login;
    
    public static Doctor loginDoctor = null;
    public static Patient loginPatient = null;
    
    public static void main(String[] args) throws Exception {
        // Read data from off-chain data to memory
        DataIO.readFromFile();
        // Read data from on-chain data to memory
//        BlockIO.readFromBlockchain();

//        Credential
//        Officer - admin;admin;3
//        Patient - 111213141234;patient;1
//        Docotr -  944342414321;doctor;2

        login = new Login();
        login.setVisible(true);


// Display blockchain data in terminal  -- To remove
//        Blockchain bc = Blockchain.getInstance();
//        bc.distribute();


// -- Adding new health reccord
// boolean permission = PermissionIO.checkPermission("1", "2");
// if (permission) {}
//
//// Create responsive Content class -> encrypt it after toString() -> sign transaction -> add to block
//    MedicalHistory mH = new MedicalHistory("Peanuts", "Lisinopril", "Asthma", "Appendectomy", "Stroke and Heart disease","944342414321");
//    String mHRecord = mH.toString();
////    System.out.println(mHRecord);
//    String encrypted = HealthRecordIO.encryptRecord(mHRecord);
////    System.out.println(encrypted);
//    String decrypted = HealthRecordIO.decryptRecord(encrypted);
////    System.out.println(decrypted);
//   
////// Add to blockchain - Working, but pending encrypte
// String signedMsg = HealthRecordIO.signTransaction(encrypted);
// BlockIO.addNewBlock("111213141234","444342414321","MedicalHistory",encrypted, signedMsg);
    }
}
