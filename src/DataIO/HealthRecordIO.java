package DataIO;

import bcd.AESKey;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;

public class HealthRecordIO {
    private final Cipher cipher;
    private static final String ALGORITHM = "AES";
    private final AESKey aesKey; //
    
    public HealthRecordIO() throws Exception {
        cipher = Cipher.getInstance(ALGORITHM);
        aesKey =  new AESKey();
    }
    
    public String encryptRecord(String healthRecord) throws Exception {
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
    
    public String decryptRecord(String cipherText) throws Exception {
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
}
