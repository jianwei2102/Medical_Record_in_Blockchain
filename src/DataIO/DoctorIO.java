package DataIO;

import Classes.Doctor;
import static DataIO.DataIO.allDoctor;
import bcd.RSAKeyPair;
import java.util.Base64;

public class DoctorIO {
    public static Doctor checkDoctor(String doctorID){ 
        Doctor found = null;
        for (Doctor d : allDoctor){
            found = doctorID.equals(d.getDoctorID()) ? d : null;
            break;
        }
       return found;
    }
    
    // addNewDoctor
//        DataIO.allDoctor.add(new Doctor("1","1","1","1","1","1"));
//        creaeteKeyPair(id)
//        DataIO.writeToFile();
    
    // assume validation on ID has been performed before this function, so it wont override the key, then gg
    public static void createKeyPair(String doctorID) {
        RSAKeyPair.create();

        byte[] publicKey = RSAKeyPair.getPublicKey().getEncoded();
        byte[] privateKey = RSAKeyPair.getPrivateKey().getEncoded();

        System.out.println("Public Key = " + Base64.getEncoder().encodeToString(publicKey));
        System.out.println("Private Key = " + Base64.getEncoder().encodeToString(privateKey));
        
        RSAKeyPair.put(publicKey, "MyKeyPair/"+doctorID+"-PublicKey");
        RSAKeyPair.put(privateKey, "MyKeyPair/"+doctorID+"-PrivateKey");
    }
}
