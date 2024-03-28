package blockchain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Block implements Serializable {
    Header header;
    TransactionCollection tranxList = null;

    public Block(String previousHash, int previousIndex) {
        header = new Header();
        header.setTimestamp(new Timestamp(System.currentTimeMillis()).getTime());
        header.setPreviousHash(previousHash);
        header.setIndex(previousIndex+1);
        String info = String.join("+", Integer.toString(header.getIndex()), Long.toString(header.getTimestamp()), header.getPreviousHash());
        String blockHash = Hasher.sha256(info);
        header.setCurrentHash(blockHash);
    }

    public Header getHeader() {
        return header;
    }

    public void setTranxList(TransactionCollection tranxList) {
        this.tranxList = tranxList;
    }

    public TransactionCollection getTranxList() {
        return tranxList;
    }
    
    @Override
    public String toString() {
        return "Block: [header=Header [index="+header.getIndex()+", previousHash=" + header.getPreviousHash() + 
                ", currentHash=" + header.getCurrentHash() + ", timestamp = " + header.getTimestamp() + "]"
                + "\n, content [encrpytedRecord="+ this.tranxList.toString()+"]]";
    }
}
