package blockchain;

public class Verification {
    private final String doctorID;
    private final String patientID;
    private final String blockHash;
    private final String encryptedHealthRecord;
    private final String signatureMessage;

    public Verification(String doctorID, String patientID, String blockHash, 
            String encryptedHealthRecord, String signatureMessage) {
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.blockHash = blockHash;
        this.encryptedHealthRecord = encryptedHealthRecord;
        this.signatureMessage = signatureMessage;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public String getEncryptedHealthRecord() {
        return encryptedHealthRecord;
    }

    public String getSignatureMessage() {
        return signatureMessage;
    }
    
    
}
