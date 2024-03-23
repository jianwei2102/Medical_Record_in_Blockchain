package Classes;

import java.util.ArrayList;

public class HealthRecord {
// private int patientID; - not require anymore (as this store under PatientIO.checkUsername(ID).getMyHealthRecord() )
// private int doctorID; - inside the content already
    
// Unsure this 'content', 'category'
//private String category;
//private String content; // Call its own class -> to string. eg. VitalSign.toSting() < ?; Ans: Yes, use to encrypt
    
    // To add -> BloodTest newTest = new BloodTest(...); this.bloodTests.add(newTest);
    private final ArrayList<UrineTest> urineTests;
    private final ArrayList<BloodTest> bloodTests;
    private final ArrayList<VitalSign> vitalSigns;
    private final ArrayList<Vaccination> vaccinations;
    private final ArrayList<Hospitalization> hospitalizations;
    private final ArrayList<MedicalHistory> medicalHistories;
    private final ArrayList<MedicalInformation> medicalInformations;

    
    // inside the content also
//    private final String diagnosis;
//    private final String consultationNotes;
//    private final LocalDate date;
//    private final LocalTime time;

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
