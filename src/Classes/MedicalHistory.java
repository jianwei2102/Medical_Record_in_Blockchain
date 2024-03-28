package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class MedicalHistory {
    private final String allergy;
    private final String medication;
    private final String chronicCondition;
    private final String pastSurgicalHistory;
    private final String familyMedicalHistory;
    private final String date;
    private final String time;
    private final String addedBy;
    private final String doctorPubKey;

    // Constructor for Gson - Java object
    public MedicalHistory(String allergy, String medication, String chronicCondition,
                        String pastSurgicalHistory, String familyMedicalHistory, 
                        String doctorID, String date, String time, String doctorPubKey) {
        this.allergy = allergy;
        this.medication = medication;
        this.chronicCondition = chronicCondition;
        this.pastSurgicalHistory = pastSurgicalHistory;
        this.familyMedicalHistory = familyMedicalHistory;
        this.date = date;
        this.time = time;
        this.addedBy = doctorID;
        this.doctorPubKey = doctorPubKey;
    }
    
     // Constructor for new record
    public MedicalHistory(String allergy, String medication, String chronicCondition, 
            String pastSurgicalHistory, String familyMedicalHistory, String doctorID) throws Exception {
        this.allergy = allergy;
        this.medication = medication;
        this.chronicCondition = chronicCondition;
        this.pastSurgicalHistory = pastSurgicalHistory;
        this.familyMedicalHistory = familyMedicalHistory;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString();
        this.addedBy = doctorID;
        this.doctorPubKey = RSAKeyAccess.getReadablePublicKey("MyKeyPair/"+doctorID+"-PublicKey");
    }

    public String getAllergy() {
        return allergy;
    }

    public String getMedication() {
        return medication;
    }

    public String getChronicCondition() {
        return chronicCondition;
    }

    public String getPastSurgicalHistory() {
        return pastSurgicalHistory;
    }

    public String getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getDoctorPubKey() {
        return doctorPubKey;
    }

    @Override
    public String toString() {
        return "{" +
                "\"allergy\":\"" + allergy + "\", " +
                "\"medication\":\"" + medication + "\", " +
                "\"chronicCondition\":\"" + chronicCondition + "\", " +
                "\"pastSurgicalHistory\":\"" + pastSurgicalHistory + "\", " +
                "\"familyMedicalHistory\":\"" + familyMedicalHistory + "\", " +
                "\"date\":\"" + date + "\", " +
                "\"time\":\"" + time + "\", " +
                "\"addedBy\":\"" + addedBy + "\", " +
                "\"doctorPubKey\":\"" + doctorPubKey + "\"" +
                "}";
    }
}