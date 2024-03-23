package blockchain;

import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;

public class Hasher {
    public static String hash(String input, String algorithm) 
    { 
        String hashCode = ""; 
        try { 
            MessageDigest md = MessageDigest.getInstance(algorithm); 
            md.update( input.getBytes() ); 
            //digesting... 
            byte[] hashBytes = md.digest(); 
            //convert the byte[] to String 
            //1) 
//            hashCode = Base64.getEncoder().encodeToString(hashBytes); 
            //2) hex format output - recommended! 
            hashCode = Hex.encodeHexString(hashBytes); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return hashCode; 
    }
    
    public static String sha256(String input) 
    {
        return hash(input, "SHA-256");
    }
}
