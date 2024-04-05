package blockchain;

import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class Blockchain {
    static Blockchain _instance;
    static LinkedList<Block> db = new LinkedList<>();
    private final String chainFile = "master" + "/chain.bin";

    private Blockchain() {
    }
    
    static public Blockchain getInstance() {
        if (_instance == null) {
            _instance = new Blockchain();
        }
        return _instance;
    }
    
    public void genesis() {
        Block genesis = new Block("0", -1);
        db.add(genesis);
        persist();
    }
    
    public void nextBlock(Block newBlock) {
        db = get();
        db.add(newBlock);
        persist();
    }
    
    public LinkedList<Block> get() {
        try {
            // Check if the file exists
            File file = new File(this.chainFile);

            if (!file.exists()) {
                file.createNewFile();
                genesis();
            } 
            
            try (FileInputStream fin = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fin)) {
                return (LinkedList<Block>) in.readObject();
            } catch (Exception e) {
                return null;
            }
            
        } catch (IOException ex) {
            return null;
        }
    }
    
    private void persist() {
        try( FileOutputStream fout = new FileOutputStream( this.chainFile );
            ObjectOutputStream out = new ObjectOutputStream( fout );
                ) {
            out.writeObject(db);
            System.out.println(">> Master file is updated!");
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
    
    public void distribute() {
        String chain = new GsonBuilder().setPrettyPrinting().create().toJson(get());
        System.out.println(chain);
    }
}
