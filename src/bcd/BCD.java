package bcd;

import Classes.*;
import DataIO.BlockIO;
import DataIO.DataIO;
import DataIO.DoctorIO;
import DataIO.HealthRecordIO;
import DataIO.PatientIO;
import DataIO.PermissionIO;
import blockchain.Block;
import blockchain.Blockchain;
import com.google.gson.GsonBuilder;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Base64;
import java.util.LinkedList;
import java.util.Scanner; // Import the Scanner class to read text files
import javax.crypto.SecretKey;

public class BCD {

    public static void main(String[] args) throws Exception {

        DataIO.readFromFile();
//  Test add and read to file - Working
//        DataIO.allPatient.add(new Patient("1","1","1","1","1","1","1"));
//        DataIO.allDoctor.add(new Doctor("1","1","1","1","1","1"));
//        DataIO.writeToFile();
        
       // UI/UX
//        Credential
//        Officer - admin;admin;3
//        Patient - 111213141234;patient;1
//        Docotr -  944342414321;doctor;2

//        loginPage = new LoginPage();
//        loginPage.setVisible(true);
  


// AES key - generate if no, and read if exist - Woriking
//        AESKey test = new AESKey();
//        SecretKey aesKey = test.getAesKey();
//        String secretKeyString = Base64.getEncoder().encodeToString(aesKey.getEncoded());
//        System.out.println( "Secret Key = "+ secretKeyString );


// Generate Doc pub-pri key - Working
//DoctorIO.testCreateKey("0123"); - pass the doc ic

// Read from blockchain - Done, tested on medical history
//Blockchain bc = Blockchain.getInstance();
//bc.distribute();
BlockIO.readFromBlockchain();


// Decrypt from blockchain - done
// Encrypt health record - done



// -- start of add (Select all from this section ctrl + /
// Add new medical record (Pending verify the permission from patient)
// Create responsive Content class -> encrypt it after toString() -> sign transaction -> add to block
    MedicalHistory mH = new MedicalHistory("Peanuts", "Lisinopril", "Asthma", "Appendectomy", "Stroke and Heart disease","944342414321");
//    System.out.println(mH.toString());
    String mHRecord = mH.toString();
    HealthRecordIO hrIO = new HealthRecordIO();
    String encrypted = hrIO.encryptRecord(mHRecord);
//    System.out.println(encrypted);
//    String decrypted = hrIO.decryptRecord(encrypted);
//    System.out.println(decrypted);


// Digital signature 
// Question do we want to put doctor id in the transaction
    DigitalSignature dsig = new DigitalSignature();
    byte[] signed = dsig.getSignature(encrypted, "944342414321");
//    // Convert the byte array to a Base64 encoded string
    String signedMsg = Base64.getEncoder().encodeToString(signed);
//
//    // Print the Base64 encoded string
//    System.out.println(signedMsg);
//    
    
//// verify the sign - Done
//    // convert back before valify
//    byte[] signed2 =Base64.getDecoder().decode(signedMsg);
//    // Test true false (Add string after encrypted
//    boolean validationResult = dsig.isTextAndSignatureValid(encrypted, signed2, "0123");
//    System.out.println(validationResult);
//    
    
//// Add to blockchain - Working, but pending encrypte
// BlockIO.addNewBlock("111213141234","444342414321","MedicalHistory",encrypted, signedMsg);    
 // -- End to add


// Permission - Done
//PermissionIO.addNewPermission("123", "123");

//boolean permission = PermissionIO.checkPermission("1", "2");
//System.out.println(permission);
    }
}
