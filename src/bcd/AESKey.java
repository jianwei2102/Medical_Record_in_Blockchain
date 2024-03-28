package bcd;

import java.io.*;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;

public class AESKey {
    static AESKey _instance;
    private static final String algorithm = "AES";
    private static final String fileName = "encryption.txt";
    private final SecretKey aesKey;
    
    private AESKey() {
        // Check if the file exists
        File file = new File(fileName);
        if (file.exists()) {
            // If the file exists, read the AES key from it
            this.aesKey = readAESKeyFromFile();
        } else {
            // If the file doesn't exist, create a new AES key and write it to the file
            this.aesKey = generateAESKey();
            writeAESKeyToFile(this.aesKey);
        }
    }
    
    static public AESKey getInstance() {
        if (_instance == null) {
            _instance = new AESKey();
        }
        return _instance;
    }

    public SecretKey getAesKey() {
        return aesKey;
//        To read in String -- to remove
//        Base64.getEncoder().encodeToString(aesKey.getEncoded())
    }
    
    private static SecretKey generateAESKey() {
        try {
            // Create a KeyGenerator object for AES
            KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
            
            // Initialize the KeyGenerator with the desired key size (128, 192, or 256 bits)
            keyGen.init(256); // Example: 256-bit AES key
            
            // Q - Not sure if need secureRandom (from tutorial) - GPT said not necessary
//          kg.init(keySize, new SecureRandom());

            // Generate and return the AES key
            return keyGen.generateKey();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Invalid algorithm...");
        }
        return null;
    }
    
    private static void writeAESKeyToFile(SecretKey aesKey) {
        // Write the AES key to the file
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(Base64.getEncoder().encodeToString(aesKey.getEncoded()));
        } catch (FileNotFoundException ex) {
            System.out.println("Read file error...");
        }
    }

    private static SecretKey readAESKeyFromFile() {
        // Read the AES key from the file
        try (Scanner encryptionTxt = new Scanner(new File(fileName))) {
            String encodedKey = encryptionTxt.nextLine();
            byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
            return new javax.crypto.spec.SecretKeySpec(decodedKey, "AES");
        } catch (FileNotFoundException ex) {
            System.out.println("Read file error...");
        }
        return null;
    }
}
