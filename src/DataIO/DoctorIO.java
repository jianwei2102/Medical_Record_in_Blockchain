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
            if (doctorID.equals(d.getDoctorID())) {
                return d;
            }
        }
       return found;
    }

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
