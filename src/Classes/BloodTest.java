package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class BloodTest {
    private final double whiteBloodCellCount; // 4500 to 11000
    private final double redBloodCellCount; // 4.5 to 5.9
    private final double hemoglobinLevel; // 12.1 to 17.2
    private final double hematocritLevel; // 36 to 54
    private final double plateletCount; // 150000 to 450000
    private final double glucoseLevel; // 3.9 to 5.6
    private final double creatinineLevel; // 2.5 to 8.2
    private final double bloodUreaNitrogenLevel; // 2.5 to 7.1
    private final double calciumLevel; // 2.1 to 2.6
    private final double potassiumLevel; // 3.5 to 5.0
    private final double sodiumLevel; // 135 to 145
    private final double cholesterolLevel; // 5.0 to 6.5
    private final double triglyceridesLevel; // 1.69 to 5.65
    private final double aspartateAminotransferaseLevel; // 0.17 to 0.67
    private final double alanineAminotransferaseLevel; // 5 to 56
    private final double alkalinePhosphataseLevel; // 0.73 to 2.45
    private final double bilirubinLevel; // 3.4 to 20.5
    private final double thyroidStimulatingHormoneLevel; // 0.4 to 4.0
    private final double triiodothyronineLevel; // 0.9 to 2.8
    private final double thyroxineLevel; // 4.5 to 11.2
    private final String date;
    private final String time;
    private final String addedBy;
    private final String doctorPubKey;
    
    // Constructor for Gson - Java object
    public BloodTest(double whiteBloodCellCount, double redBloodCellCount, double hemoglobinLevel, 
            double hematocritLevel, double plateletCount, double glucoseLevel, double creatinineLevel, 
            double bloodUreaNitrogenLevel, double calciumLevel, double potassiumLevel, double sodiumLevel,
            double cholesterolLevel, double triglyceridesLevel, double aspartateAminotransferaseLevel, 
            double alanineAminotransferaseLevel, double alkalinePhosphataseLevel, double bilirubinLevel, 
            double thyroidStimulatingHormoneLevel, double triiodothyronineLevel, double thyroxineLevel, 
            String date, String time, String doctorID, String doctorPubKey) {
        this.whiteBloodCellCount = whiteBloodCellCount;
        this.redBloodCellCount = redBloodCellCount;
        this.hemoglobinLevel = hemoglobinLevel;
        this.hematocritLevel = hematocritLevel;
        this.plateletCount = plateletCount;
        this.glucoseLevel = glucoseLevel;
        this.creatinineLevel = creatinineLevel;
        this.bloodUreaNitrogenLevel = bloodUreaNitrogenLevel;
        this.calciumLevel = calciumLevel;
        this.potassiumLevel = potassiumLevel;
        this.sodiumLevel = sodiumLevel;
        this.cholesterolLevel = cholesterolLevel;
        this.triglyceridesLevel = triglyceridesLevel;
        this.aspartateAminotransferaseLevel = aspartateAminotransferaseLevel;
        this.alanineAminotransferaseLevel = alanineAminotransferaseLevel;
        this.alkalinePhosphataseLevel = alkalinePhosphataseLevel;
        this.bilirubinLevel = bilirubinLevel;
        this.thyroidStimulatingHormoneLevel = thyroidStimulatingHormoneLevel;
        this.triiodothyronineLevel = triiodothyronineLevel;
        this.thyroxineLevel = thyroxineLevel;
        this.date = date;
        this.time = time;
        this.addedBy = doctorID;
        this.doctorPubKey = doctorPubKey;
    }
    
    // Constructor for new record
    public BloodTest(double whiteBloodCellCount, double redBloodCellCount, double hemoglobinLevel, 
            double hematocritLevel, double plateletCount, double glucoseLevel, double creatinineLevel, 
            double bloodUreaNitrogenLevel, double calciumLevel, double potassiumLevel, double sodiumLevel,
            double cholesterolLevel, double triglyceridesLevel, double aspartateAminotransferaseLevel, 
            double alanineAminotransferaseLevel, double alkalinePhosphataseLevel, double bilirubinLevel, 
            double thyroidStimulatingHormoneLevel, double triiodothyronineLevel, double thyroxineLevel, 
            String doctorID) throws Exception {
        this.whiteBloodCellCount = whiteBloodCellCount;
        this.redBloodCellCount = redBloodCellCount;
        this.hemoglobinLevel = hemoglobinLevel;
        this.hematocritLevel = hematocritLevel;
        this.plateletCount = plateletCount;
        this.glucoseLevel = glucoseLevel;
        this.creatinineLevel = creatinineLevel;
        this.bloodUreaNitrogenLevel = bloodUreaNitrogenLevel;
        this.calciumLevel = calciumLevel;
        this.potassiumLevel = potassiumLevel;
        this.sodiumLevel = sodiumLevel;
        this.cholesterolLevel = cholesterolLevel;
        this.triglyceridesLevel = triglyceridesLevel;
        this.aspartateAminotransferaseLevel = aspartateAminotransferaseLevel;
        this.alanineAminotransferaseLevel = alanineAminotransferaseLevel;
        this.alkalinePhosphataseLevel = alkalinePhosphataseLevel;
        this.bilirubinLevel = bilirubinLevel;
        this.thyroidStimulatingHormoneLevel = thyroidStimulatingHormoneLevel;
        this.triiodothyronineLevel = triiodothyronineLevel;
        this.thyroxineLevel = thyroxineLevel;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString();
        this.addedBy = doctorID;
        this.doctorPubKey = RSAKeyAccess.getReadablePublicKey("MyKeyPair/"+doctorID+"-PublicKey");
    }

    public double getWhiteBloodCellCount() {
        return whiteBloodCellCount;
    }

    public double getRedBloodCellCount() {
        return redBloodCellCount;
    }

    public double getHemoglobinLevel() {
        return hemoglobinLevel;
    }

    public double getHematocritLevel() {
        return hematocritLevel;
    }

    public double getPlateletCount() {
        return plateletCount;
    }

    public double getGlucoseLevel() {
        return glucoseLevel;
    }

    public double getCreatinineLevel() {
        return creatinineLevel;
    }

    public double getBloodUreaNitrogenLevel() {
        return bloodUreaNitrogenLevel;
    }

    public double getCalciumLevel() {
        return calciumLevel;
    }

    public double getPotassiumLevel() {
        return potassiumLevel;
    }

    public double getSodiumLevel() {
        return sodiumLevel;
    }

    public double getCholesterolLevel() {
        return cholesterolLevel;
    }

    public double getTriglyceridesLevel() {
        return triglyceridesLevel;
    }

    public double getAspartateAminotransferaseLevel() {
        return aspartateAminotransferaseLevel;
    }

    public double getAlanineAminotransferaseLevel() {
        return alanineAminotransferaseLevel;
    }

    public double getAlkalinePhosphataseLevel() {
        return alkalinePhosphataseLevel;
    }

    public double getBilirubinLevel() {
        return bilirubinLevel;
    }

    public double getThyroidStimulatingHormoneLevel() {
        return thyroidStimulatingHormoneLevel;
    }

    public double getTriiodothyronineLevel() {
        return triiodothyronineLevel;
    }

    public double getThyroxineLevel() {
        return thyroxineLevel;
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
                "\"whiteBloodCellCount\":" + whiteBloodCellCount + ", " +
                "\"redBloodCellCount\":" + redBloodCellCount + ", " +
                "\"hemoglobinLevel\":" + hemoglobinLevel + ", " +
                "\"hematocritLevel\":" + hematocritLevel + ", " +
                "\"plateletCount\":" + plateletCount + ", " +
                "\"glucoseLevel\":" + glucoseLevel + ", " +
                "\"creatinineLevel\":" + creatinineLevel + ", " +
                "\"bloodUreaNitrogenLevel\":" + bloodUreaNitrogenLevel + ", " +
                "\"calciumLevel\":" + calciumLevel + ", " +
                "\"potassiumLevel\":" + potassiumLevel + ", " +
                "\"sodiumLevel\":" + sodiumLevel + ", " +
                "\"cholesterolLevel\":" + cholesterolLevel + ", " +
                "\"triglyceridesLevel\":" + triglyceridesLevel + ", " +
                "\"aspartateAminotransferaseLevel\":" + aspartateAminotransferaseLevel + ", " +
                "\"alanineAminotransferaseLevel\":" + alanineAminotransferaseLevel + ", " +
                "\"alkalinePhosphataseLevel\":" + alkalinePhosphataseLevel + ", " +
                "\"bilirubinLevel\":" + bilirubinLevel + ", " +
                "\"thyroidStimulatingHormoneLevel\":" + thyroidStimulatingHormoneLevel + ", " +
                "\"triiodothyronineLevel\":" + triiodothyronineLevel + ", " +
                "\"thyroxineLevel\":" + thyroxineLevel + ", " +
                "\"date\":\"" + date + "\", " +
                "\"time\":\"" + time + "\", " +
                "\"addedBy\":\"" + addedBy + "\", " +
                "\"doctorPubKey\":\"" + doctorPubKey + "\"" +
                "}";
    }
}
