package DataIO;

import bcd.AESKey;
import bcd.DigitalSignature;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;

public class HealthRecordIO {
    static HealthRecordIO _instance;
    private static final String ALGORITHM = "AES";
    private static Cipher cipher;
    private static AESKey aesKey;
    
    
    private HealthRecordIO() throws Exception {
        cipher = Cipher.getInstance(ALGORITHM);
        aesKey = AESKey.getInstance();
    }
    
    static public HealthRecordIO getInstance() throws Exception {
        if (_instance == null) {
            _instance = new HealthRecordIO();
        }
        return _instance;
    }
    
    public static String encryptRecord(String healthRecord) throws Exception {
        // get AES Key
        Key key = aesKey.getAesKey();
        
        // init
        cipher.init(Cipher.ENCRYPT_MODE, key);
        // encrypt
        byte[] cipherBytes = cipher.doFinal(healthRecord.getBytes());
        // convert to string
        String cipherText = Base64.getEncoder().encodeToString(cipherBytes);
        return cipherText;
    }
    
    public static String decryptRecord(String cipherText) throws Exception {
        // get AES Key
        Key key = aesKey.getAesKey();
        
        // init
        cipher.init(Cipher.DECRYPT_MODE, key);
        // convert to bytes[]
        byte[] cipherBytes = Base64.getDecoder().decode(cipherText);
        // decrypt
        byte[] dataBytes = cipher.doFinal(cipherBytes);
        return new String(dataBytes);
    }
    
    public static String signTransaction(String encrypted) {
        byte[] signed = DigitalSignature.getSignature(encrypted, "944342414321");
        // Convert the byte array to a Base64 encoded string
        String signedMsg = Base64.getEncoder().encodeToString(signed);
        return signedMsg;
    }
    
    public static boolean verifySignature(String encrypted, String signedMsg, String doctorID) {
        byte[] signedByte =Base64.getDecoder().decode(signedMsg);
        boolean validationResult = DigitalSignature.isTextAndSignatureValid(encrypted, signedByte, doctorID);
        return validationResult;
    }
}
