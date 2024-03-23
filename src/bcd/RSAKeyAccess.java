package bcd;

import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class RSAKeyAccess {
    public static PublicKey getPublicKey(String path) throws Exception {
        byte[] keyBytes = Files.readAllBytes(Paths.get(path));
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        return KeyFactory.getInstance("RSA").generatePublic(spec);
    }
    
    public static PrivateKey getPrivateKey(String path) throws Exception {
        byte[] keyBytes = Files.readAllBytes(Paths.get(path));
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        return KeyFactory.getInstance("RSA").generatePrivate(spec);
    }
    
    public static String getReadablePublicKey(String path) throws Exception {
        PublicKey pubKey = RSAKeyAccess.getPublicKey(path);
        return Base64.getEncoder().encodeToString(pubKey.getEncoded());
    }
    
    public static String getReadablePrivateKey(String path) throws Exception {
        PrivateKey priKey = RSAKeyAccess.getPrivateKey(path);
        return Base64.getEncoder().encodeToString(priKey.getEncoded());
    }
}
