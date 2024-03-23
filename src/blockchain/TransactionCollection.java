package blockchain;

import java.io.Serializable;

public class TransactionCollection implements Serializable{
    private static final long serialVersionUID = 1L; // DK if require
    
    private final String doctorID;
    private final String patientID;
    private final String category;
    private final String encryptedHealthRecord;
    private final String signatureMessage;
    
//    @Override
//    public String toString(){
//        return "TransactionCollection[tranxLst="+getTranxList()+"]";
//    }

    public TransactionCollection(String patientID,  String doctorID, String category,
            String encryptedHealthRecord, String signatureMessage) {
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.category = category;
        this.encryptedHealthRecord = encryptedHealthRecord;
        this.signatureMessage = signatureMessage;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPatientID() {
        return patientID;
    }
    
    public String getDoctorID() {
        return doctorID;
    }

    public String getCategory() {
        return category;
    }

    public String getEncryptedHealthRecord() {
        return encryptedHealthRecord;
    }

    public String getSignatureMessage() {
        return signatureMessage;
    }
}
