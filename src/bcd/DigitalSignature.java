package bcd;

import java.security.Signature;
import java.security.PublicKey;
import java.security.PrivateKey;

public class DigitalSignature {
    static DigitalSignature _instance;
    private static final String ALGORITHM = "SHA256WithRSA";
    private static Signature sig;
    
    // Constructor
    private DigitalSignature() {
        try {
            sig = Signature.getInstance(ALGORITHM);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static public DigitalSignature getInstance() throws Exception {
        if (_instance == null) {
            _instance = new DigitalSignature();
        }
        return _instance;
    }
    
    // Digitally sign the encrypted Health Record before add to block
    public byte[] getSignature(String encryptedRecord, String doctorID){
        try {
            PrivateKey doctorPrivateKey = RSAKeyAccess.getPrivateKey("MyKeyPair/"+doctorID+"-PrivateKey");
            sig.initSign(doctorPrivateKey);
            sig.update(encryptedRecord.getBytes());
            return sig.sign();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Check if the Medical Records is digitally signed by authentic doctor 
    public boolean isTextAndSignatureValid(String encryptedRecord, byte[] signature, String doctorID) {
        try {
            PublicKey doctorPublicKey = RSAKeyAccess.getPublicKey("MyKeyPair/"+doctorID+"-PublicKey");
            sig.initVerify(doctorPublicKey);
            sig.update(encryptedRecord.getBytes());
            return sig.verify(signature);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
