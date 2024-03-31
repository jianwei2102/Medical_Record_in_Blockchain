package DataIO;

import Classes.Doctor;
import Classes.Validation;
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
    
    public static Validation validateName(String name) {
        Validation v = new Validation(true, "", "");
        if (name.isEmpty()) {
            v.setValid(false);
            v.setMessage("Add your name");
            v.setMessageType("Missing Value");
        }
        else if (!name.matches("^[a-zA-Z]+$")) {
            v.setValid(false);
            v.setMessage("Enter your name using letters only");
            v.setMessageType("Invalid Input");
        }
        return v;
    }
    
    public static Validation validateHospitalName(String hospitalName) {
        Validation v = new Validation(true, "", "");
        if (hospitalName.isEmpty()) {
            v.setValid(false);
            v.setMessage("Add your hospital name");
            v.setMessageType("Missing Value");
        }
        else if (!hospitalName.matches("^[a-zA-Z]+$")) {
            v.setValid(false);
            v.setMessage("Enter your hospital name using letters only");
            v.setMessageType("Invalid Input");
        }
        return v;
    }
}
