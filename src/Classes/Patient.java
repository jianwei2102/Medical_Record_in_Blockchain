package Classes;

public class Patient {
    // Need final? modifiable?
    private String patientID;
    private String name;
    private String dob;
    private String gender;
    private String address;
    private String contact;
    private String emergencyContact;
    
    private final HealthRecord myHealthRecord;

    public Patient(String patientID, String name, String dob, String gender, 
            String address, String contact, String emergencyContact) {
        this.patientID = patientID;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.contact = contact;
        this.emergencyContact = emergencyContact;
        this.myHealthRecord = new HealthRecord();
    }


    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public HealthRecord getMyHealthRecord() {
        return myHealthRecord;
    }
}
