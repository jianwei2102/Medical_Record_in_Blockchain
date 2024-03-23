package bcd;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class RSAKeyPair {
    private final String ALGORITHM = "RSA";
    private KeyPairGenerator keygen;
    private java.security.KeyPair keyPair;
    private static PublicKey publicKey;
    private static PrivateKey privateKey;

    public static PublicKey getPublicKey() {
        return publicKey;
    }

    public static PrivateKey getPrivateKey() {
        return privateKey;
    }
    
    private RSAKeyPair() {
        try {
            keygen = KeyPairGenerator.getInstance(ALGORITHM);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void create() {
        RSAKeyPair keyMaker = new RSAKeyPair();
        keyMaker.keyPair = keyMaker.keygen.genKeyPair();

        publicKey = keyMaker.keyPair.getPublic();
        privateKey = keyMaker.keyPair.getPrivate();
    }
    
    public static void put(byte[] keyBytes, String path) {
        File f = new File(path);
        f.getParentFile().mkdirs();
        try {
            Files.write(Paths.get(path), keyBytes, StandardOpenOption.CREATE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
