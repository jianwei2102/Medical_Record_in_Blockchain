package Classes;

public class Permission {
    private final String patientID;
    private final String doctorID;

    public Permission(String patientID, String doctorID) {
        this.patientID = patientID;
        this.doctorID = doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }
}
