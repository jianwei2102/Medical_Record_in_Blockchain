package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class BloodTest {
    private final double whiteBloodCellCount;
    private final double redBloodCellCount;
    private final double hemoglobinLevel;
    private final double hematocritLevel;
    private final double plateletCount;
    private final double glucoseLevel;
    private final double creatinineLevel;
    private final double bloodUreaNitrogenLevel;
    private final double calciumLevel;
    private final double potassiumLevel;
    private final double sodiumLevel;
    private final double cholesterolLevel;
    private final double triglyceridesLevel;
    private final double aspartateAminotransferaseLevel;
    private final double alanineAminotransferaseLevel;
    private final double alkalinePhosphataseLevel;
    private final double bilirubinLevel;
    private final double thyroidStimulatingHormoneLevel;
    private final double triiodothyronineLevel;
    private final double thyroxineLevel;
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
