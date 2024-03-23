package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class Hospitalization {    
    private final String dateOfHospitalization;
    private final String reasonForHospitalization;
    private final String dischargeSummary;
    private final String date;
    private final String time;
    private final String addedBy;
    private final String doctorPubKey;
    
    // Constructor
    public Hospitalization(String dateOfHospitalization, String reasonForHospitalization, 
            String dischargeSummary, String date, String time, 
            String doctorID, String doctorPubKey) {
        this.dateOfHospitalization = dateOfHospitalization;
        this.reasonForHospitalization = reasonForHospitalization;
        this.dischargeSummary = dischargeSummary;
        this.date = date;
        this.time = time;
        this.addedBy = doctorID;
        this.doctorPubKey = doctorPubKey;
    }
    
    public Hospitalization(String dateOfHospitalization, String reasonForHospitalization, 
            String dischargeSummary, String doctorID) throws Exception {
        this.dateOfHospitalization = dateOfHospitalization;
        this.reasonForHospitalization = reasonForHospitalization;
        this.dischargeSummary = dischargeSummary;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString();
        this.addedBy = doctorID;
        this.doctorPubKey = RSAKeyAccess.getReadablePublicKey("MyKeyPair/"+doctorID+"-PublicKey");
    }

    public String getDateOfHospitalization() {
        return dateOfHospitalization;
    }

    public String getReasonForHospitalization() {
        return reasonForHospitalization;
    }

    public String getDischargeSummary() {
        return dischargeSummary;
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
                "\"dateOfHospitalization\":\"" + dateOfHospitalization + "\", " +
                "\"reasonForHospitalization\":\"" + reasonForHospitalization + "\", " +
                "\"dischargeSummary\":\"" + dischargeSummary + "\", " +
                "\"date\":\"" + date + "\", " +
                "\"time\":\"" + time + "\", " +
                "\"addedBy\":\"" + addedBy + "\", " +
                "\"doctorPubKey\":\"" + doctorPubKey + "\"" +
                "}";
    }
}
