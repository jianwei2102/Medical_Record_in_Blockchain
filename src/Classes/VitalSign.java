package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class VitalSign {
    private final int bloodPressure; // 60 to 120
    private final int heartRate; // 60 to 100
    private final int respiratoryRate; // 12 to 18
    private final double temperature; // 36.1 to 37.2
    private final double height;
    private final double weight;
    private final double bodyMassIndex; // weight / (height / 100)^2
    private final String date;
    private final String time;
    private final String addedBy;
    private final String doctorPubKey;
    
    // Constructor for Gson - Java object
    public VitalSign(int bloodPressure, int heartRate, int respiratoryRate, 
            double temperature, double height, double weight, double bodyMassIndex, 
            String date, String time, String doctorID, String doctorPubKey) {
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.respiratoryRate = respiratoryRate;
        this.temperature = temperature;
        this.height = height;
        this.weight = weight;
        this.bodyMassIndex = bodyMassIndex;
        this.date = date;
        this.time = time;
        this.addedBy = doctorID;
        this.doctorPubKey = doctorPubKey;
    }
    
    // Constructor for new record
    public VitalSign(int bloodPressure, int heartRate, int respiratoryRate, 
            double temperature, double height, double weight, double bodyMassIndex, 
            String doctorID) throws Exception {
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
        this.respiratoryRate = respiratoryRate;
        this.temperature = temperature;
        this.height = height;
        this.weight = weight;
        this.bodyMassIndex = bodyMassIndex;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString();
        this.addedBy = doctorID;
        this.doctorPubKey = RSAKeyAccess.getReadablePublicKey("MyKeyPair/"+doctorID+"-PublicKey");
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBodyMassIndex() {
        return bodyMassIndex;
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
                "\"bloodPressure\":" + bloodPressure + ", " +
                "\"heartRate\":" + heartRate + ", " +
                "\"respiratoryRate\":" + respiratoryRate + ", " +
                "\"temperature\":" + temperature + ", " +
                "\"height\":" + height + ", " +
                "\"weight\":" + weight + ", " +
                "\"bodyMassIndex\":" + bodyMassIndex + ", " +
                "\"date\":\"" + date + "\", " +
                "\"time\":\"" + time + "\", " +
                "\"addedBy\":\"" + addedBy + "\", " +
                "\"doctorPubKey\":\"" + doctorPubKey + "\"" +
                "}";
    }
}
