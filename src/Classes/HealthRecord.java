package Classes;

import java.util.ArrayList;

public class HealthRecord {
    // Explaination -- to remove
    // private int patientID; - not require anymore (as this store under PatientIO.checkUsername(ID).getMyHealthRecord() )
    // private int doctorID; - inside the content already

    // To add -> BloodTest newTest = new BloodTest(...); this.bloodTests.add(newTest);
    private final ArrayList<UrineTest> urineTests;
    private final ArrayList<BloodTest> bloodTests;
    private final ArrayList<VitalSign> vitalSigns;
    private final ArrayList<Vaccination> vaccinations;
    private final ArrayList<Hospitalization> hospitalizations;
    private final ArrayList<MedicalHistory> medicalHistories;
    private final ArrayList<MedicalInformation> medicalInformations;

    
    // inside the content also
//    private final String diagnosis; - Doesnt exist
//    private final String consultationNotes; - Doesnt exist
//    private final String date;
//    private final String time;

    public HealthRecord() {
        this.bloodTests = new ArrayList<>();
        this.hospitalizations = new ArrayList<>();
        this.urineTests = new ArrayList<>();
        this.medicalHistories = new ArrayList<>();
        this.medicalInformations = new ArrayList<>();
        this.vaccinations = new ArrayList<>();
        this.vitalSigns = new ArrayList<>();
    }

    public ArrayList<BloodTest> getBloodTests() {
        return bloodTests;
    }

    public ArrayList<Hospitalization> getHospitalizations() {
        return hospitalizations;
    }

    public ArrayList<UrineTest> getUrineTests() {
        return urineTests;
    }

    public ArrayList<MedicalHistory> getMedicalHistories() {
        return medicalHistories;
    }

    public ArrayList<MedicalInformation> getMedicalInformations() {
        return medicalInformations;
    }

    public ArrayList<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public ArrayList<VitalSign> getVitalSigns() {
        return vitalSigns;
    }    
}
