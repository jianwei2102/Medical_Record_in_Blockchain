package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class Vaccination {
    private final String dateOfVaccination;
    private final String typesOfImmunizations; // live attenuated, inactivated, toxoid, viral vector, DNA & RNA
    private final double dosesAdministered; // 1, 2, 3
    private final String date; // < Not sure if require
    private final String time;
    private final String addedBy;
    private final String doctorPubKey;
    
    // Constructor
    public Vaccination(String dateOfVaccination, String typesOfImmunizations, 
            double dosesAdministered, String date, String time, String doctorID, 
            String doctorPubKey) {
        this.dateOfVaccination = dateOfVaccination;
        this.typesOfImmunizations = typesOfImmunizations;
        this.dosesAdministered = dosesAdministered;
        this.date = date;
        this.time = time;
        this.addedBy = doctorID;
        this.doctorPubKey = doctorPubKey;
    }
    
    public Vaccination(String dateOfVaccination, String typesOfImmunizations, 
            double dosesAdministered, String doctorID) throws Exception {
        this.dateOfVaccination = dateOfVaccination;
        this.typesOfImmunizations = typesOfImmunizations;
        this.dosesAdministered = dosesAdministered;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString();
        this.addedBy = doctorID;
        this.doctorPubKey = RSAKeyAccess.getReadablePublicKey("MyKeyPair/"+doctorID+"-PublicKey");
    }

    public String getDateOfVaccination() {
        return dateOfVaccination;
    }

    public String getTypesOfImmunizations() {
        return typesOfImmunizations;
    }

    public double getDosesAdministered() {
        return dosesAdministered;
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
                "\"dateOfVaccination\":\"" + dateOfVaccination + "\", " +
                "\"typesOfImmunizations\":\"" + typesOfImmunizations + "\", " +
                "\"dosesAdministered\":" + dosesAdministered + ", " +
                "\"date\":\"" + date + "\", " +
                "\"time\":\"" + time + "\", " +
                "\"addedBy\":\"" + addedBy + "\", " +
                "\"doctorPubKey\":\"" + doctorPubKey + "\"" +
                "}";
    }
}
