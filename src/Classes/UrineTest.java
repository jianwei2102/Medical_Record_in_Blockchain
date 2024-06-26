package Classes;

import bcd.RSAKeyAccess;
import java.time.LocalDate;
import java.time.LocalTime;

public class UrineTest {
    private final String urineColor;
    private final String urineClarity;
    private final double urineSpecificGravity;
    private final double urinePH;
    private final String urineProtein;
    private final String urineGlucose;
    private final String urineKetones;
    private final String urineBilirubin;
    private final String urineBlood;
    private final String urineLeukocytes;
    private final String urineNitrites;
    private final double urineCreatinine;
    private final String urineAlbumin;
    private final String urineMicroalbumin;
    private final double urineOsmolality;
    private final double urinePotassium;
    private final double urineSodium;
    private final double urineCalcium;
    private final double urineMagnesium;
    private final double urineUricAcid;
    private final String date;
    private final String time;
    private final String addedBy;
    private final String doctorPubKey;
    
    // Constructor for Gson - Java object
    public UrineTest(String urineColor, String urineClarity, double urineSpecificGravity, 
            double urinePH, String urineProtein, String urineGlucose, String urineKetones, 
            String urineBilirubin, String urineBlood, String urineLeukocytes, String urineNitrites, 
            double urineCreatinine, String urineAlbumin, String urineMicroalbumin, double urineOsmolality, 
            double urinePotassium, double urineSodium, double urineCalcium, double urineMagnesium, 
            double urineUricAcid, String date, String time, String doctorID, String doctorPubKey) {
        this.urineColor = urineColor;
        this.urineClarity = urineClarity;
        this.urineSpecificGravity = urineSpecificGravity;
        this.urinePH = urinePH;
        this.urineProtein = urineProtein;
        this.urineGlucose = urineGlucose;
        this.urineKetones = urineKetones;
        this.urineBilirubin = urineBilirubin;
        this.urineBlood = urineBlood;
        this.urineLeukocytes = urineLeukocytes;
        this.urineNitrites = urineNitrites;
        this.urineCreatinine = urineCreatinine;
        this.urineAlbumin = urineAlbumin;
        this.urineMicroalbumin = urineMicroalbumin;
        this.urineOsmolality = urineOsmolality;
        this.urinePotassium = urinePotassium;
        this.urineSodium = urineSodium;
        this.urineCalcium = urineCalcium;
        this.urineMagnesium = urineMagnesium;
        this.urineUricAcid = urineUricAcid;
        this.date = date;
        this.time = time;
        this.addedBy = doctorID;
        this.doctorPubKey = doctorPubKey;
    }
    
    // Constructor for new record
    public UrineTest(String urineColor, String urineClarity, double urineSpecificGravity, 
            double urinePH, String urineProtein, String urineGlucose, String urineKetones, 
            String urineBilirubin, String urineBlood, String urineLeukocytes, String urineNitrites, 
            double urineCreatinine, String urineAlbumin, String urineMicroalbumin, double urineOsmolality, 
            double urinePotassium, double urineSodium, double urineCalcium, double urineMagnesium, 
            double urineUricAcid, String doctorID) throws Exception {
        this.urineColor = urineColor;
        this.urineClarity = urineClarity;
        this.urineSpecificGravity = urineSpecificGravity;
        this.urinePH = urinePH;
        this.urineProtein = urineProtein;
        this.urineGlucose = urineGlucose;
        this.urineKetones = urineKetones;
        this.urineBilirubin = urineBilirubin;
        this.urineBlood = urineBlood;
        this.urineLeukocytes = urineLeukocytes;
        this.urineNitrites = urineNitrites;
        this.urineCreatinine = urineCreatinine;
        this.urineAlbumin = urineAlbumin;
        this.urineMicroalbumin = urineMicroalbumin;
        this.urineOsmolality = urineOsmolality;
        this.urinePotassium = urinePotassium;
        this.urineSodium = urineSodium;
        this.urineCalcium = urineCalcium;
        this.urineMagnesium = urineMagnesium;
        this.urineUricAcid = urineUricAcid;
        this.date = LocalDate.now().toString();
        this.time = LocalTime.now().toString();
        this.addedBy = doctorID;
        this.doctorPubKey = RSAKeyAccess.getReadablePublicKey("MyKeyPair/"+doctorID+"-PublicKey");
    }

    public String getUrineColor() {
        return urineColor;
    }

    public String getUrineClarity() {
        return urineClarity;
    }

    public double getUrineSpecificGravity() {
        return urineSpecificGravity;
    }

    public double getUrinePH() {
        return urinePH;
    }

    public String getUrineProtein() {
        return urineProtein;
    }

    public String getUrineGlucose() {
        return urineGlucose;
    }

    public String getUrineKetones() {
        return urineKetones;
    }

    public String getUrineBilirubin() {
        return urineBilirubin;
    }

    public String getUrineBlood() {
        return urineBlood;
    }

    public String getUrineLeukocytes() {
        return urineLeukocytes;
    }

    public String getUrineNitrites() {
        return urineNitrites;
    }

    public double getUrineCreatinine() {
        return urineCreatinine;
    }

    public String getUrineAlbumin() {
        return urineAlbumin;
    }

    public String getUrineMicroalbumin() {
        return urineMicroalbumin;
    }

    public double getUrineOsmolality() {
        return urineOsmolality;
    }

    public double getUrinePotassium() {
        return urinePotassium;
    }

    public double getUrineSodium() {
        return urineSodium;
    }

    public double getUrineCalcium() {
        return urineCalcium;
    }

    public double getUrineMagnesium() {
        return urineMagnesium;
    }

    public double getUrineUricAcid() {
        return urineUricAcid;
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
                "\"urineColor\":\"" + urineColor + "\", " +
                "\"urineClarity\":\"" + urineClarity + "\", " +
                "\"urineSpecificGravity\":" + urineSpecificGravity + ", " +
                "\"urinePH\":" + urinePH + ", " +
                "\"urineProtein\":\"" + urineProtein + "\", " +
                "\"urineGlucose\":\"" + urineGlucose + "\", " +
                "\"urineKetones\":\"" + urineKetones + "\", " +
                "\"urineBilirubin\":\"" + urineBilirubin + "\", " +
                "\"urineBlood\":\"" + urineBlood + "\", " +
                "\"urineLeukocytes\":\"" + urineLeukocytes + "\", " +
                "\"urineNitrites\":\"" + urineNitrites + "\", " +
                "\"urineCreatinine\":" + urineCreatinine + ", " +
                "\"urineAlbumin\":\"" + urineAlbumin + "\", " +
                "\"urineMicroalbumin\":\"" + urineMicroalbumin + "\", " +
                "\"urineOsmolality\":" + urineOsmolality + ", " +
                "\"urinePotassium\":" + urinePotassium + ", " +
                "\"urineSodium\":" + urineSodium + ", " +
                "\"urineCalcium\":" + urineCalcium + ", " +
                "\"urineMagnesium\":" + urineMagnesium + ", " +
                "\"urineUricAcid\":" + urineUricAcid + ", " +
                "\"date\":\"" + date + "\", " +
                "\"time\":\"" + time + "\", " +
                "\"addedBy\":\"" + addedBy + "\", " +
                "\"doctorPubKey\":\"" + doctorPubKey + "\"" +
                "}";
    }
}
