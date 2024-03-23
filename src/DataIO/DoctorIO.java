package DataIO;

import bcd.RSAKeyPair;
import java.util.Base64;

public class DoctorIO {
    // function checkUsername -> IC
    
    // addNewDoctor
    
    // assume validation has been performed before this function, so it wont override the key, then gg
    public static void testCreateKey(String doctorID) {
        RSAKeyPair.create();

        byte[] publicKey = RSAKeyPair.getPublicKey().getEncoded();
        byte[] privateKey = RSAKeyPair.getPrivateKey().getEncoded();

        System.out.println("Public Key = " + Base64.getEncoder().encodeToString(publicKey));
        System.out.println("Private Key = " + Base64.getEncoder().encodeToString(privateKey));
        
        RSAKeyPair.put(publicKey, "MyKeyPair/"+doctorID+"-PublicKey");
        RSAKeyPair.put(privateKey, "MyKeyPair/"+doctorID+"-PrivateKey");
    }
}
