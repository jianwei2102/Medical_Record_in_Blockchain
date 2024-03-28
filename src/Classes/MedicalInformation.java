package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class MedicalInformation {
    private final String prescriptionMedications;
    private final String dosages; //e.g., "10 mg" or simply 10 if int
    private final String frequencyOfUse; //e.g., "Twice daily" or 2
    private final String mealRequirement; //e.g., "Before Meal" or "After Meal"
    private final String treatmentGoal;
    private final String date;
    private final String time;
    private final String addedBy;
    private final String doctorPubKey;
    
    // Constructor for Gson - Java object
    public MedicalInformation(String prescriptionMedications, String dosages, 
            String frequencyOfUse, String mealRequirement, String treatmentGoal, 
            String date, String time, String doctorID, String doctorPubKey) {
        this.prescriptionMedications = prescriptionMedications;
        this.dosages = dosages;
        this.frequencyOfUse = frequencyOfUse;
        this.mealRequirement = mealRequirement;
        this.treatmentGoal = treatmentGoal;
        this.date = date;
        this.time = time;
        this.addedBy = doctorID;
        this.doctorPubKey = doctorPubKey;
    }
    
    // Constructor for new record
    public MedicalInformation(String prescriptionMedications, String dosages, 
            String frequencyOfUse, String mealRequirement, String treatmentGoal, 
            String doctorID) throws Exception {
        this.prescriptionMedications = prescriptionMedications;
        this.dosages = dosages;
        this.frequencyOfUse = frequencyOfUse;
        this.mealRequirement = mealRequirement;
        this.treatmentGoal = treatmentGoal;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString();
        this.addedBy = doctorID;
        this.doctorPubKey = RSAKeyAccess.getReadablePublicKey("MyKeyPair/"+doctorID+"-PublicKey");
    }

    public String getPrescriptionMedications() {
        return prescriptionMedications;
    }

    public String getDosages() {
        return dosages;
    }

    public String getFrequencyOfUse() {
        return frequencyOfUse;
    }

    public String getMealRequirement() {
        return mealRequirement;
    }

    public String getTreatmentGoal() {
        return treatmentGoal;
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
                "\"prescriptionMedications\":\"" + prescriptionMedications + "\", " +
                "\"dosages\":\"" + dosages + "\", " +
                "\"frequencyOfUse\":\"" + frequencyOfUse + "\", " +
                "\"mealRequirement\":\"" + mealRequirement + "\", " +
                "\"treatmentGoal\":\"" + treatmentGoal + "\", " +
                "\"date\":\"" + date + "\", " +
                "\"time\":\"" + time + "\", " +
                "\"addedBy\":\"" + addedBy + "\", " +
                "\"doctorPubKey\":\"" + doctorPubKey + "\"" +
                "}";
    }
}
