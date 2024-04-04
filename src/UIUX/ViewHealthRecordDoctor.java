/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIUX;

import Classes.BloodTest;
import Classes.HealthRecord;
import Classes.Hospitalization;
import Classes.MedicalHistory;
import Classes.MedicalInformation;
import Classes.Patient;
import Classes.UrineTest;
import Classes.Vaccination;
import Classes.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author xiuha
 */
public class ViewHealthRecordDoctor extends javax.swing.JFrame {

    /**
     * Creates new form ViewHealthRecord
     */
    public ArrayList<VitalSign> vitalSigns;
    public ArrayList<MedicalHistory> medicalHistories;
    public ArrayList<BloodTest> bloodTests;
    public ArrayList<UrineTest> urineTests;
    public ArrayList<MedicalInformation> medicalInformations;
    public ArrayList<Hospitalization> hospitalizations;
    public ArrayList<Vaccination> vaccinations;
    
    public ViewHealthRecordDoctor() {
        initComponents();
        
        // Insert all the patient in combo box for doctor to select
        for (Patient p : DataIO.DataIO.allPatient) {
            patientCom.addItem(p.getPatientID());
        }
    }
    
    private void displayVitalSign(int index) {
        if (index == -1) {
            VitalSignsTimestampTextField.setText("");
            VitalSignsRecordedByTextField.setText("");
            BloodPressureTextField.setText("");
            HeartRateTextField.setText("");
            RespiratoryRateTextField.setText("");
            TemperatureTextField.setText("");
            HeightTextField.setText("");
            WeightTextField.setText("");
            BodyMassIndexTextField.setText("");
            return;
        }
        
        VitalSign vitalSign = vitalSigns.get(index);
        VitalSignsTimestampTextField.setText(vitalSign.getDate() + " | " + vitalSign.getTime());
        VitalSignsRecordedByTextField.setText(vitalSign.getAddedBy());
        BloodPressureTextField.setText(Integer.toString(vitalSign.getBloodPressure()));
        HeartRateTextField.setText(Integer.toString(vitalSign.getHeartRate()));
        RespiratoryRateTextField.setText(Integer.toString(vitalSign.getRespiratoryRate()));
        TemperatureTextField.setText(Double.toString(vitalSign.getTemperature()));
        HeightTextField.setText(Double.toString(vitalSign.getHeight()));
        WeightTextField.setText(Double.toString(vitalSign.getWeight()));
        BodyMassIndexTextField.setText(Double.toString(vitalSign.getBodyMassIndex()));
    }
    
    private void displayMedicalHistory(int index) {
        if (index == -1) {
            MedicalHistoryTimestampTextField.setText("");
            MedicalHistoryRecordedByTextField.setText("");
            AllergyTextField.setText("");
            ChronicConditionTextField.setText("");
            FamilyMedicalHistoryTextField.setText("");
            MedicationTextField.setText("");
            PastSurgicalHistoryTextField.setText("");
            return;
        }
        
        MedicalHistory medicalHistory = medicalHistories.get(index);
        MedicalHistoryTimestampTextField.setText(medicalHistory.getDate() + " | " + medicalHistory.getTime());
        MedicalHistoryRecordedByTextField.setText(medicalHistory.getAddedBy());
        AllergyTextField.setText(medicalHistory.getAllergy());
        ChronicConditionTextField.setText(medicalHistory.getChronicCondition());
        FamilyMedicalHistoryTextField.setText(medicalHistory.getFamilyMedicalHistory());
        MedicationTextField.setText(medicalHistory.getMedication());
        PastSurgicalHistoryTextField.setText(medicalHistory.getPastSurgicalHistory());   
    }
    
    private void displayBloodTest(int index) {
        if (index == -1) {
            BloodTestTimestampTextField.setText("");
            BloodTestRecordedByTextField.setText("");
            WhiteBloodCellCountTextField.setText("");
            RedBloodCellCountTextField.setText("");
            HemoglobinLevelTextField.setText("");
            HematocritLevelTextField.setText("");
            PlateletCountTextField.setText("");
            FastingBloodGlucoseLevelTextField.setText("");
            CreatinineLevelTextField.setText("");
            BloodUreaNitrogenLevelTextField.setText("");
            CalciumLevelTextField.setText("");
            PotassiumLevelTextField.setText("");
            SodiumLevelTextField.setText("");
            CholesterolLevelTextField.setText("");
            TriglyceridesLevelTextField.setText("");
            AspartateAminotransferaseLevelTextField.setText("");
            AlanineAminotransferaseLevelTextField.setText("");
            AlkalinePhosphataseLevelTextField.setText("");
            BilirubinLevelTextField.setText("");
            ThyroidStimulatingHormoneLevelTextField.setText("");
            TriiodothyronineLevelTextField.setText("");
            ThyroxineLevelTextField.setText("");
            return;
        }
        
        BloodTest bloodTest = bloodTests.get(index);
        BloodTestTimestampTextField.setText(bloodTest.getDate() + " | " + bloodTest.getTime());
        BloodTestRecordedByTextField.setText(bloodTest.getAddedBy());
        WhiteBloodCellCountTextField.setText(Double.toString(bloodTest.getWhiteBloodCellCount()));
        RedBloodCellCountTextField.setText(Double.toString(bloodTest.getRedBloodCellCount()));
        HemoglobinLevelTextField.setText(Double.toString(bloodTest.getHemoglobinLevel()));
        HematocritLevelTextField.setText(Double.toString(bloodTest.getHematocritLevel()));
        PlateletCountTextField.setText(Double.toString(bloodTest.getPlateletCount()));
        FastingBloodGlucoseLevelTextField.setText(Double.toString(bloodTest.getGlucoseLevel()));
        CreatinineLevelTextField.setText(Double.toString(bloodTest.getCreatinineLevel()));
        BloodUreaNitrogenLevelTextField.setText(Double.toString(bloodTest.getBloodUreaNitrogenLevel()));
        CalciumLevelTextField.setText(Double.toString(bloodTest.getCalciumLevel()));
        PotassiumLevelTextField.setText(Double.toString(bloodTest.getPotassiumLevel()));
        SodiumLevelTextField.setText(Double.toString(bloodTest.getSodiumLevel()));
        CholesterolLevelTextField.setText(Double.toString(bloodTest.getCholesterolLevel()));
        TriglyceridesLevelTextField.setText(Double.toString(bloodTest.getTriglyceridesLevel()));
        AspartateAminotransferaseLevelTextField.setText(Double.toString(bloodTest.getAspartateAminotransferaseLevel()));
        AlanineAminotransferaseLevelTextField.setText(Double.toString(bloodTest.getAlanineAminotransferaseLevel()));
        AlkalinePhosphataseLevelTextField.setText(Double.toString(bloodTest.getAlkalinePhosphataseLevel()));
        BilirubinLevelTextField.setText(Double.toString(bloodTest.getBilirubinLevel()));
        ThyroidStimulatingHormoneLevelTextField.setText(Double.toString(bloodTest.getThyroidStimulatingHormoneLevel()));
        TriiodothyronineLevelTextField.setText(Double.toString(bloodTest.getTriiodothyronineLevel()));
        ThyroxineLevelTextField.setText(Double.toString(bloodTest.getThyroxineLevel()));
    }
    
    private void displayUrineTest(int index) {
        if (index == -1) {
            UrineTestTimestampTextField.setText("");
            UrineTestRecordedByTextField.setText("");
            UrineClarityTextField.setText("");
            UrineColorTextField.setText("");
            UrinepHTextField.setText("");
            UrineSpecificGravityTextField.setText("");
            UrineBilirubinTextField.setText("");
            UrineBloodTextField.setText("");
            UrineGlucoseTextField.setText("");
            UrineKetonesTextField.setText("");
            UrineLeukocytesTextField.setText("");
            UrineNitritesTextField.setText("");
            UrineProteinTextField.setText("");
            UrineAlbuminTextField.setText("");
            UrineCalciumTextField.setText("");
            UrineCreatinineTextField.setText("");
            UrineMagnesiumTextField.setText("");
            UrineMicroalbuminTextField.setText("");
            UrineOsmolalityTextField.setText("");
            UrinePotassiumTextField.setText("");
            UrineSodiumTextField.setText("");
            UrineUricAcidTextField.setText("");
            return;
        }
        
        UrineTest urineTest = urineTests.get(index);
        UrineTestTimestampTextField.setText(urineTest.getDate() + " | " + urineTest.getTime());
        UrineTestRecordedByTextField.setText(urineTest.getAddedBy());
        UrineClarityTextField.setText(urineTest.getUrineClarity());
        UrineColorTextField.setText(urineTest.getUrineColor());
        UrinepHTextField.setText(Double.toString(urineTest.getUrinePH()));
        UrineSpecificGravityTextField.setText(Double.toString(urineTest.getUrineSpecificGravity()));
        UrineBilirubinTextField.setText(urineTest.getUrineBilirubin());
        UrineBloodTextField.setText(urineTest.getUrineBlood());
        UrineGlucoseTextField.setText(urineTest.getUrineGlucose());
        UrineKetonesTextField.setText(urineTest.getUrineKetones());
        UrineLeukocytesTextField.setText(urineTest.getUrineLeukocytes());
        UrineNitritesTextField.setText(urineTest.getUrineNitrites());
        UrineProteinTextField.setText(urineTest.getUrineProtein());
        UrineAlbuminTextField.setText(urineTest.getUrineAlbumin());
        UrineCalciumTextField.setText(Double.toString(urineTest.getUrineCalcium()));
        UrineCreatinineTextField.setText(Double.toString(urineTest.getUrineCreatinine()));
        UrineMagnesiumTextField.setText(Double.toString(urineTest.getUrineMagnesium()));
        UrineMicroalbuminTextField.setText(urineTest.getUrineMicroalbumin());
        UrineOsmolalityTextField.setText(Double.toString(urineTest.getUrineOsmolality()));
        UrinePotassiumTextField.setText(Double.toString(urineTest.getUrinePotassium()));
        UrineSodiumTextField.setText(Double.toString(urineTest.getUrineSodium()));
        UrineUricAcidTextField.setText(Double.toString(urineTest.getUrineUricAcid()));
    }
    
    private void displayMedicalInformation(int index) {
        if (index == -1) {
            MedicalInfoTimestampTextField.setText("");
            MedicalInfoRecordedByTextField.setText("");
            PrescriptionMedicationsTextArea.setText("");
            DosagesTextField.setText("");
            FrequencyOfUseTextField.setText("");
            MealRequirementTextField.setText("");
            TreatmentGoalTextField.setText("");
            return;
        }
        
        MedicalInformation medicalInformation = medicalInformations.get(index);
        MedicalInfoTimestampTextField.setText(medicalInformation.getDate() + " | " + medicalInformation.getTime());
        MedicalInfoRecordedByTextField.setText(medicalInformation.getAddedBy());
        PrescriptionMedicationsTextArea.setText(medicalInformation.getPrescriptionMedications());
        DosagesTextField.setText(medicalInformation.getDosages());
        FrequencyOfUseTextField.setText(medicalInformation.getFrequencyOfUse());
        MealRequirementTextField.setText(medicalInformation.getMealRequirement());
        TreatmentGoalTextField.setText(medicalInformation.getTreatmentGoal());
    }
    
    private void displayHospitalization(int index) {
        if (index == -1) {
            HospitalizationTimestampTextField.setText("");
            HospitalizationRecordedByTextField.setText("");
            DateOfHospitalizationTextField.setText("");
            ReasonTextArea.setText("");
            DischargeSummaryTextArea.setText("");
            return;
        }
        
        Hospitalization hospitalization = hospitalizations.get(index);
        HospitalizationTimestampTextField.setText(hospitalization.getDate() + " | " + hospitalization.getTime());
        HospitalizationRecordedByTextField.setText(hospitalization.getAddedBy());
        DateOfHospitalizationTextField.setText(hospitalization.getDateOfHospitalization());
        ReasonTextArea.setText(hospitalization.getReasonForHospitalization());
        DischargeSummaryTextArea.setText(hospitalization.getDischargeSummary());
    }
    
    private void displayVaccination(int index) {
        if (index == -1) {
            VaccinationTimestampTextField.setText("");
            VaccinationRecordedByTextField.setText("");
            DateOfVaccinationTextField.setText("");
            TypesOfImmunizationsTextField.setText("");
            DosesAdministeredTextField.setText("");
            return;
        }
        
        Vaccination vaccination = vaccinations.get(index);
        VaccinationTimestampTextField.setText(vaccination.getDate() + " | " + vaccination.getTime());
        VaccinationRecordedByTextField.setText(vaccination.getAddedBy());
        DateOfVaccinationTextField.setText(vaccination.getDateOfVaccination());
        TypesOfImmunizationsTextField.setText(vaccination.getTypesOfImmunizations());
        DosesAdministeredTextField.setText(Double.toString(vaccination.getDosesAdministered()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HealthRecordLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        HealthRecordTabbedPane = new javax.swing.JTabbedPane();
        VitalSignsPanel = new javax.swing.JPanel();
        VitalSignsTimestampLabel = new javax.swing.JLabel();
        VitalSignsTimestampTextField = new javax.swing.JTextField();
        VitalSignsRecordedByLabel = new javax.swing.JLabel();
        VitalSignsRecordedByTextField = new javax.swing.JTextField();
        BloodPressureLabel = new javax.swing.JLabel();
        BloodPressureTextField = new javax.swing.JTextField();
        BloodPressureUnitLabel = new javax.swing.JLabel();
        HeartRateLabel = new javax.swing.JLabel();
        HeartRateTextField = new javax.swing.JTextField();
        HeartRateUnitLabel = new javax.swing.JLabel();
        RespiratoryRateLabel = new javax.swing.JLabel();
        RespiratoryRateUnitLabel = new javax.swing.JLabel();
        TemperatureLabel = new javax.swing.JLabel();
        TemperatureUnitLabel = new javax.swing.JLabel();
        HeightLabel = new javax.swing.JLabel();
        HeightTextField = new javax.swing.JTextField();
        HeightUnitLabel = new javax.swing.JLabel();
        WeightLabel = new javax.swing.JLabel();
        WeightTextField = new javax.swing.JTextField();
        WeightUnitLabel = new javax.swing.JLabel();
        BodyMassIndexLabel = new javax.swing.JLabel();
        BodyMassIndexTextField = new javax.swing.JTextField();
        BodyMassIndexUUnitLabel = new javax.swing.JLabel();
        vitalSignsCom = new javax.swing.JComboBox<>();
        RespiratoryRateTextField = new javax.swing.JTextField();
        TemperatureTextField = new javax.swing.JTextField();
        MedicalHistoryPanel = new javax.swing.JPanel();
        MedicalHistoryTimestampLabel = new javax.swing.JLabel();
        MedicalHistoryTimestampTextField = new javax.swing.JTextField();
        MedicalHistoryRecordedByLabel = new javax.swing.JLabel();
        MedicalHistoryRecordedByTextField = new javax.swing.JTextField();
        AllergyLabel = new javax.swing.JLabel();
        AllergyTextField = new javax.swing.JTextField();
        ChronicConditionLabel = new javax.swing.JLabel();
        ChronicConditionTextField = new javax.swing.JTextField();
        FamilyMedicalHistoryLabel = new javax.swing.JLabel();
        FamilyMedicalHistoryTextField = new javax.swing.JTextField();
        MedicationLabel = new javax.swing.JLabel();
        MedicationTextField = new javax.swing.JTextField();
        PastSurgicalHistoryLabel = new javax.swing.JLabel();
        PastSurgicalHistoryTextField = new javax.swing.JTextField();
        medicalHistoryCom = new javax.swing.JComboBox<>();
        BloodTestPanel = new javax.swing.JPanel();
        BloodTestTimestampLabel = new javax.swing.JLabel();
        BloodTestTimestampTextField = new javax.swing.JTextField();
        BloodTestRecordedByLabel = new javax.swing.JLabel();
        BloodTestRecordedByTextField = new javax.swing.JTextField();
        BloodTestTabbedPane = new javax.swing.JTabbedPane();
        CompleteBloodCountPanel = new javax.swing.JPanel();
        WhiteBloodCellCountLabel = new javax.swing.JLabel();
        WhiteBloodCellCountTextField = new javax.swing.JTextField();
        WhiteBloodCellCountUnitLabel = new javax.swing.JLabel();
        RedBloodCellCountLabel = new javax.swing.JLabel();
        RedBloodCellCountTextField = new javax.swing.JTextField();
        RedBloodCellCountUnitLabel = new javax.swing.JLabel();
        HemoglobinLevelLabel = new javax.swing.JLabel();
        HemoglobinLevelTextField = new javax.swing.JTextField();
        HemoglobinLevelUnitLabel = new javax.swing.JLabel();
        HematocritLevelLabel = new javax.swing.JLabel();
        HematocritLevelTextField = new javax.swing.JTextField();
        HematocritLevelUnitLabel = new javax.swing.JLabel();
        PlateletCountLabel = new javax.swing.JLabel();
        PlateletCountTextField = new javax.swing.JTextField();
        PlateletCountUnitLabel = new javax.swing.JLabel();
        BasicMetabolicPanelPanel = new javax.swing.JPanel();
        FastingBloodGlucoseLevelLabel = new javax.swing.JLabel();
        FastingBloodGlucoseLevelTextField = new javax.swing.JTextField();
        FastingBloodGlucoseLevelUnitLabel = new javax.swing.JLabel();
        CreatinineLevelLabel = new javax.swing.JLabel();
        CreatinineLevelTextField = new javax.swing.JTextField();
        CreatinineLevelUnitLabel = new javax.swing.JLabel();
        BloodUreaNitrogenLevelLabel = new javax.swing.JLabel();
        BloodUreaNitrogenLevelTextField = new javax.swing.JTextField();
        BloodUreaNitrogenLevelUnitLabel = new javax.swing.JLabel();
        CalciumLevelLabel = new javax.swing.JLabel();
        CalciumLevelTextField = new javax.swing.JTextField();
        CalciumLevelUnitLabel = new javax.swing.JLabel();
        PotassiumLevelLabel = new javax.swing.JLabel();
        PotassiumLevelTextField = new javax.swing.JTextField();
        PotassiumLevelUnitLabel = new javax.swing.JLabel();
        SodiumLevelLabel = new javax.swing.JLabel();
        SodiumLevelTextField = new javax.swing.JTextField();
        SodiumLevelUnitLabel = new javax.swing.JLabel();
        LipidPanelPanel = new javax.swing.JPanel();
        CholesterolLevelLabel = new javax.swing.JLabel();
        CholesterolLevelTextField = new javax.swing.JTextField();
        CholesterolLevelUnitLabel = new javax.swing.JLabel();
        TriglyceridesLevelLabel = new javax.swing.JLabel();
        TriglyceridesLevelTextField = new javax.swing.JTextField();
        TriglyceridesLevelUnitLabel = new javax.swing.JLabel();
        LiverFunctionTestsPanel = new javax.swing.JPanel();
        AspartateAminotransferaseLevelLabel = new javax.swing.JLabel();
        AspartateAminotransferaseLevelTextField = new javax.swing.JTextField();
        AspartateAminotransferaseLevelUnitLabel = new javax.swing.JLabel();
        AlanineAminotransferaseLevelLabel = new javax.swing.JLabel();
        AlanineAminotransferaseLevelTextField = new javax.swing.JTextField();
        AlanineAminotransferaseLevelUnitLabel = new javax.swing.JLabel();
        AlkalinePhosphataseLevelLabel = new javax.swing.JLabel();
        AlkalinePhosphataseLevelTextField = new javax.swing.JTextField();
        AlkalinePhosphataseLevelUnitLabel = new javax.swing.JLabel();
        BilirubinLevelLabel = new javax.swing.JLabel();
        BilirubinLevelTextField = new javax.swing.JTextField();
        BilirubinLevelUnitLabel = new javax.swing.JLabel();
        ThyroidFunctionTestsPanel = new javax.swing.JPanel();
        ThyroidStimulatingHormoneLevelLabel = new javax.swing.JLabel();
        ThyroidStimulatingHormoneLevelTextField = new javax.swing.JTextField();
        ThyroidStimulatingHormoneLevelUnitLabel = new javax.swing.JLabel();
        TriiodothyronineLevelLabel = new javax.swing.JLabel();
        TriiodothyronineLevelTextField = new javax.swing.JTextField();
        TriiodothyronineLevelUnitLabel = new javax.swing.JLabel();
        ThyroxineLevelLabel = new javax.swing.JLabel();
        ThyroxineLevelTextField = new javax.swing.JTextField();
        ThyroxineLevelUnitLabel = new javax.swing.JLabel();
        bloodTestCom = new javax.swing.JComboBox<>();
        UrineTestPanel = new javax.swing.JPanel();
        UrineTestTimestampLabel = new javax.swing.JLabel();
        UrineTestTimestampTextField = new javax.swing.JTextField();
        UrineTestRecordedByLabel = new javax.swing.JLabel();
        UrineTestRecordedByTextField = new javax.swing.JTextField();
        UrineTestTabbedPane = new javax.swing.JTabbedPane();
        UrineAppearanceAndCompositionPanel = new javax.swing.JPanel();
        UrineClarityLabel = new javax.swing.JLabel();
        UrineClarityTextField = new javax.swing.JTextField();
        UrineColorLabel = new javax.swing.JLabel();
        UrineColorTextField = new javax.swing.JTextField();
        UrinepHLabel = new javax.swing.JLabel();
        UrinepHTextField = new javax.swing.JTextField();
        UrinepHUnitLabel = new javax.swing.JLabel();
        UrineSpecificGravityLabel = new javax.swing.JLabel();
        UrineSpecificGravityTextField = new javax.swing.JTextField();
        UrineChemicalAnalysisPanel = new javax.swing.JPanel();
        UrineBilirubinLabel = new javax.swing.JLabel();
        UrineBilirubinTextField = new javax.swing.JTextField();
        UrineBilirubinUnitLabel = new javax.swing.JLabel();
        UrineBloodLabel = new javax.swing.JLabel();
        UrineBloodTextField = new javax.swing.JTextField();
        UrineBloodUnitLabel = new javax.swing.JLabel();
        UrineGlucoseLabel = new javax.swing.JLabel();
        UrineGlucoseTextField = new javax.swing.JTextField();
        UrineGlucoseUnitLabel = new javax.swing.JLabel();
        UrineKetonesLabel = new javax.swing.JLabel();
        UrineKetonesTextField = new javax.swing.JTextField();
        UrineKetonesUnitLabel = new javax.swing.JLabel();
        UrineLeukocytesLabel = new javax.swing.JLabel();
        UrineLeukocytesTextField = new javax.swing.JTextField();
        UrineLeukocytesUnitLabel = new javax.swing.JLabel();
        UrineNitritesLabel = new javax.swing.JLabel();
        UrineNitritesTextField = new javax.swing.JTextField();
        UrineProteinLabel = new javax.swing.JLabel();
        UrineProteinTextField = new javax.swing.JTextField();
        UrineProteinUnitLabel = new javax.swing.JLabel();
        UrineBiochemistryPanel = new javax.swing.JPanel();
        UrineAlbuminLabel = new javax.swing.JLabel();
        UrineAlbuminTextField = new javax.swing.JTextField();
        UrineAlbuminUnitLabel = new javax.swing.JLabel();
        UrineCalciumLabel = new javax.swing.JLabel();
        UrineCalciumTextField = new javax.swing.JTextField();
        UrineCalciumUnitLabel = new javax.swing.JLabel();
        UrineCreatinineLabel = new javax.swing.JLabel();
        UrineCreatinineTextField = new javax.swing.JTextField();
        UrineCreatinineUnitLabel = new javax.swing.JLabel();
        UrineMagnesiumLabel = new javax.swing.JLabel();
        UrineMagnesiumTextField = new javax.swing.JTextField();
        UrineMagnesiumUnitLabel = new javax.swing.JLabel();
        UrineMicroalbuminLabel = new javax.swing.JLabel();
        UrineMicroalbuminTextField = new javax.swing.JTextField();
        UrineMicroalbuminUnitLabel = new javax.swing.JLabel();
        UrineOsmolalityLabel = new javax.swing.JLabel();
        UrineOsmolalityTextField = new javax.swing.JTextField();
        UrineOsmolalityUnitLabel = new javax.swing.JLabel();
        UrinePotassiumLabel = new javax.swing.JLabel();
        UrinePotassiumTextField = new javax.swing.JTextField();
        UrinePotassiumUnitLabel = new javax.swing.JLabel();
        UrineSodiumLabel = new javax.swing.JLabel();
        UrineSodiumTextField = new javax.swing.JTextField();
        UrineSodiumUnitLabel = new javax.swing.JLabel();
        UrineUricAcidLabel = new javax.swing.JLabel();
        UrineUricAcidTextField = new javax.swing.JTextField();
        UrineUricAcidUnitLabel = new javax.swing.JLabel();
        urineTestCom = new javax.swing.JComboBox<>();
        MedicalInfoPanel = new javax.swing.JPanel();
        MedicalInfoTimestampLabel = new javax.swing.JLabel();
        MedicalInfoTimestampTextField = new javax.swing.JTextField();
        MedicalInfoRecordedByLabel = new javax.swing.JLabel();
        MedicalInfoRecordedByTextField = new javax.swing.JTextField();
        PrescriptionMedicationsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrescriptionMedicationsTextArea = new javax.swing.JTextArea();
        DosagesLabel = new javax.swing.JLabel();
        DosagesTextField = new javax.swing.JTextField();
        FrequencyOfUseLabel = new javax.swing.JLabel();
        FrequencyOfUseTextField = new javax.swing.JTextField();
        FrequencyOfUseUnitLabel = new javax.swing.JLabel();
        MealRequirementLabel = new javax.swing.JLabel();
        MealRequirementTextField = new javax.swing.JTextField();
        TreatmentGoalLabel = new javax.swing.JLabel();
        TreatmentGoalTextField = new javax.swing.JTextField();
        medicalInfoCom = new javax.swing.JComboBox<>();
        HospitalizationPanel = new javax.swing.JPanel();
        HospitalizationTimestampLabel = new javax.swing.JLabel();
        HospitalizationTimestampTextField = new javax.swing.JTextField();
        HospitalizationRecordedByLabel = new javax.swing.JLabel();
        HospitalizationRecordedByTextField = new javax.swing.JTextField();
        DateOfHospitalizationLabel = new javax.swing.JLabel();
        DateOfHospitalizationTextField = new javax.swing.JTextField();
        ReasonLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReasonTextArea = new javax.swing.JTextArea();
        DischargeSummaryLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DischargeSummaryTextArea = new javax.swing.JTextArea();
        hospitalizationCom = new javax.swing.JComboBox<>();
        VaccinationPanel = new javax.swing.JPanel();
        VaccinationTimestampLabel = new javax.swing.JLabel();
        VaccinationTimestampTextField = new javax.swing.JTextField();
        VaccinationRecordedByLabel = new javax.swing.JLabel();
        VaccinationRecordedByTextField = new javax.swing.JTextField();
        DateOfVaccinationLabel = new javax.swing.JLabel();
        DateOfVaccinationTextField = new javax.swing.JTextField();
        TypesOfImmunizationsLabel = new javax.swing.JLabel();
        TypesOfImmunizationsTextField = new javax.swing.JTextField();
        DosesAdministeredLabel = new javax.swing.JLabel();
        DosesAdministeredTextField = new javax.swing.JTextField();
        vaccinationCom = new javax.swing.JComboBox<>();
        patientCom = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HealthRecordLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        HealthRecordLabel.setText("Health Record");

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        HealthRecordTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        VitalSignsTimestampLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VitalSignsTimestampLabel.setText("Timestamp");

        VitalSignsTimestampTextField.setEditable(false);
        VitalSignsTimestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        VitalSignsRecordedByLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VitalSignsRecordedByLabel.setText("Recorded by");

        VitalSignsRecordedByTextField.setEditable(false);
        VitalSignsRecordedByTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BloodPressureLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressureLabel.setText("Blood Pressure");

        BloodPressureTextField.setEditable(false);
        BloodPressureTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressureTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        BloodPressureUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodPressureUnitLabel.setText("mmHg");

        HeartRateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HeartRateLabel.setText("Heart Rate");

        HeartRateTextField.setEditable(false);
        HeartRateTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HeartRateTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        HeartRateUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HeartRateUnitLabel.setText("BPM");

        RespiratoryRateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RespiratoryRateLabel.setText("Respiratory Rate");

        RespiratoryRateUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RespiratoryRateUnitLabel.setText("BPM");

        TemperatureLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TemperatureLabel.setText("Temperature");

        TemperatureUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TemperatureUnitLabel.setText("°C");

        HeightLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HeightLabel.setText("Height");

        HeightTextField.setEditable(false);
        HeightTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HeightTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        HeightUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HeightUnitLabel.setText("cm");

        WeightLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WeightLabel.setText("Weight");

        WeightTextField.setEditable(false);
        WeightTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WeightTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        WeightUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WeightUnitLabel.setText("kg");

        BodyMassIndexLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BodyMassIndexLabel.setText("Body Mass Index");

        BodyMassIndexTextField.setEditable(false);
        BodyMassIndexTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BodyMassIndexTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        BodyMassIndexUUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BodyMassIndexUUnitLabel.setText("kg/m2");

        vitalSignsCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalSignsComActionPerformed(evt);
            }
        });

        RespiratoryRateTextField.setEditable(false);
        RespiratoryRateTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RespiratoryRateTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        TemperatureTextField.setEditable(false);
        TemperatureTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TemperatureTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        javax.swing.GroupLayout VitalSignsPanelLayout = new javax.swing.GroupLayout(VitalSignsPanel);
        VitalSignsPanel.setLayout(VitalSignsPanelLayout);
        VitalSignsPanelLayout.setHorizontalGroup(
            VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                        .addComponent(VitalSignsTimestampLabel)
                        .addGap(18, 18, 18)
                        .addComponent(VitalSignsTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BloodPressureLabel)
                            .addComponent(HeartRateLabel))
                        .addGap(32, 32, 32)
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HeartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BloodPressureUnitLabel)
                            .addComponent(HeartRateUnitLabel)))
                    .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RespiratoryRateLabel)
                            .addComponent(TemperatureLabel))
                        .addGap(18, 18, 18)
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(RespiratoryRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(TemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RespiratoryRateUnitLabel)
                            .addComponent(TemperatureUnitLabel))))
                .addGap(18, 18, 18)
                .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                        .addComponent(VitalSignsRecordedByLabel)
                        .addGap(18, 18, 18)
                        .addComponent(VitalSignsRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vitalSignsCom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BodyMassIndexLabel)
                            .addComponent(WeightLabel)
                            .addComponent(HeightLabel))
                        .addGap(18, 18, 18)
                        .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(HeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HeightUnitLabel))
                            .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(BodyMassIndexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BodyMassIndexUUnitLabel))
                            .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                                .addComponent(WeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WeightUnitLabel)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        VitalSignsPanelLayout.setVerticalGroup(
            VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VitalSignsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VitalSignsTimestampLabel)
                    .addComponent(VitalSignsTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VitalSignsRecordedByLabel)
                    .addComponent(VitalSignsRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vitalSignsCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodPressureLabel)
                    .addComponent(BloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodPressureUnitLabel)
                    .addComponent(HeightLabel)
                    .addComponent(HeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeightUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeartRateLabel)
                    .addComponent(WeightLabel)
                    .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HeartRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HeartRateUnitLabel)
                        .addComponent(WeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WeightUnitLabel)))
                .addGap(18, 18, 18)
                .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RespiratoryRateLabel)
                    .addComponent(RespiratoryRateUnitLabel)
                    .addComponent(BodyMassIndexLabel)
                    .addComponent(BodyMassIndexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BodyMassIndexUUnitLabel)
                    .addComponent(RespiratoryRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VitalSignsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TemperatureLabel)
                    .addComponent(TemperatureUnitLabel)
                    .addComponent(TemperatureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        HealthRecordTabbedPane.addTab("Vital Signs", VitalSignsPanel);

        MedicalHistoryTimestampLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MedicalHistoryTimestampLabel.setText("Timestamp");

        MedicalHistoryTimestampTextField.setEditable(false);
        MedicalHistoryTimestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MedicalHistoryRecordedByLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MedicalHistoryRecordedByLabel.setText("Recorded by");

        MedicalHistoryRecordedByTextField.setEditable(false);
        MedicalHistoryRecordedByTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AllergyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AllergyLabel.setText("Allergy");

        AllergyTextField.setEditable(false);
        AllergyTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ChronicConditionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChronicConditionLabel.setText("Chronic Condition");

        ChronicConditionTextField.setEditable(false);
        ChronicConditionTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FamilyMedicalHistoryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FamilyMedicalHistoryLabel.setText("Family Medical History");

        FamilyMedicalHistoryTextField.setEditable(false);
        FamilyMedicalHistoryTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MedicationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MedicationLabel.setText("Medication");

        MedicationTextField.setEditable(false);
        MedicationTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PastSurgicalHistoryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PastSurgicalHistoryLabel.setText("Past Surgical History");

        PastSurgicalHistoryTextField.setEditable(false);
        PastSurgicalHistoryTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        medicalHistoryCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalHistoryComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MedicalHistoryPanelLayout = new javax.swing.GroupLayout(MedicalHistoryPanel);
        MedicalHistoryPanel.setLayout(MedicalHistoryPanelLayout);
        MedicalHistoryPanelLayout.setHorizontalGroup(
            MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalHistoryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicalHistoryPanelLayout.createSequentialGroup()
                        .addComponent(ChronicConditionLabel)
                        .addGap(55, 55, 55)
                        .addComponent(ChronicConditionTextField))
                    .addGroup(MedicalHistoryPanelLayout.createSequentialGroup()
                        .addComponent(AllergyLabel)
                        .addGap(143, 143, 143)
                        .addComponent(AllergyTextField))
                    .addGroup(MedicalHistoryPanelLayout.createSequentialGroup()
                        .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FamilyMedicalHistoryLabel)
                            .addComponent(MedicationLabel))
                        .addGap(18, 18, 18)
                        .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicationTextField)
                            .addComponent(FamilyMedicalHistoryTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalHistoryPanelLayout.createSequentialGroup()
                        .addComponent(MedicalHistoryTimestampLabel)
                        .addGap(18, 18, 18)
                        .addComponent(MedicalHistoryTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MedicalHistoryRecordedByLabel)
                        .addGap(18, 18, 18)
                        .addComponent(MedicalHistoryRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicalHistoryCom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(MedicalHistoryPanelLayout.createSequentialGroup()
                        .addComponent(PastSurgicalHistoryLabel)
                        .addGap(31, 31, 31)
                        .addComponent(PastSurgicalHistoryTextField)))
                .addContainerGap())
        );
        MedicalHistoryPanelLayout.setVerticalGroup(
            MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalHistoryPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedicalHistoryTimestampLabel)
                    .addComponent(MedicalHistoryTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedicalHistoryRecordedByLabel)
                    .addComponent(MedicalHistoryRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicalHistoryCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AllergyLabel)
                    .addComponent(AllergyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChronicConditionLabel)
                    .addComponent(ChronicConditionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FamilyMedicalHistoryLabel)
                    .addComponent(FamilyMedicalHistoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedicationLabel)
                    .addComponent(MedicationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PastSurgicalHistoryLabel)
                    .addComponent(PastSurgicalHistoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        HealthRecordTabbedPane.addTab("Medical History", MedicalHistoryPanel);

        BloodTestTimestampLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodTestTimestampLabel.setText("Timestamp");

        BloodTestTimestampTextField.setEditable(false);
        BloodTestTimestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BloodTestRecordedByLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodTestRecordedByLabel.setText("Recorded by");

        BloodTestRecordedByTextField.setEditable(false);
        BloodTestRecordedByTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        BloodTestTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        WhiteBloodCellCountLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WhiteBloodCellCountLabel.setText("White Blood Cell Count");

        WhiteBloodCellCountTextField.setEditable(false);
        WhiteBloodCellCountTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WhiteBloodCellCountTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        WhiteBloodCellCountUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WhiteBloodCellCountUnitLabel.setText("/μL");

        RedBloodCellCountLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RedBloodCellCountLabel.setText("Red Blood Cell Count");

        RedBloodCellCountTextField.setEditable(false);
        RedBloodCellCountTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RedBloodCellCountTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        RedBloodCellCountUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RedBloodCellCountUnitLabel.setText("million/μL");

        HemoglobinLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HemoglobinLevelLabel.setText("Hemoglobin Level");

        HemoglobinLevelTextField.setEditable(false);
        HemoglobinLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HemoglobinLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        HemoglobinLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HemoglobinLevelUnitLabel.setText("g/dL");

        HematocritLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HematocritLevelLabel.setText("Hematocrit Level");

        HematocritLevelTextField.setEditable(false);
        HematocritLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HematocritLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        HematocritLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HematocritLevelUnitLabel.setText("%");

        PlateletCountLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PlateletCountLabel.setText("Platelet Count");

        PlateletCountTextField.setEditable(false);
        PlateletCountTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PlateletCountTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        PlateletCountUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PlateletCountUnitLabel.setText("/μL");

        javax.swing.GroupLayout CompleteBloodCountPanelLayout = new javax.swing.GroupLayout(CompleteBloodCountPanel);
        CompleteBloodCountPanel.setLayout(CompleteBloodCountPanelLayout);
        CompleteBloodCountPanelLayout.setHorizontalGroup(
            CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompleteBloodCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CompleteBloodCountPanelLayout.createSequentialGroup()
                        .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(CompleteBloodCountPanelLayout.createSequentialGroup()
                                .addComponent(HemoglobinLevelLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HemoglobinLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CompleteBloodCountPanelLayout.createSequentialGroup()
                                .addComponent(HematocritLevelLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HematocritLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CompleteBloodCountPanelLayout.createSequentialGroup()
                                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CompleteBloodCountPanelLayout.createSequentialGroup()
                                        .addComponent(WhiteBloodCellCountLabel)
                                        .addGap(18, 18, 18))
                                    .addGroup(CompleteBloodCountPanelLayout.createSequentialGroup()
                                        .addComponent(RedBloodCellCountLabel)
                                        .addGap(34, 34, 34)))
                                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(WhiteBloodCellCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RedBloodCellCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RedBloodCellCountUnitLabel)
                            .addComponent(HematocritLevelUnitLabel)
                            .addComponent(HemoglobinLevelUnitLabel)
                            .addComponent(WhiteBloodCellCountUnitLabel)))
                    .addGroup(CompleteBloodCountPanelLayout.createSequentialGroup()
                        .addComponent(PlateletCountLabel)
                        .addGap(90, 90, 90)
                        .addComponent(PlateletCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlateletCountUnitLabel)))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        CompleteBloodCountPanelLayout.setVerticalGroup(
            CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompleteBloodCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WhiteBloodCellCountLabel)
                    .addComponent(WhiteBloodCellCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WhiteBloodCellCountUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedBloodCellCountLabel)
                    .addComponent(RedBloodCellCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedBloodCellCountUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HemoglobinLevelLabel)
                    .addComponent(HemoglobinLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HemoglobinLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HematocritLevelLabel)
                    .addComponent(HematocritLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HematocritLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(CompleteBloodCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlateletCountLabel)
                    .addComponent(PlateletCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlateletCountUnitLabel))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        BloodTestTabbedPane.addTab("Complete Blood Count", CompleteBloodCountPanel);

        FastingBloodGlucoseLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FastingBloodGlucoseLevelLabel.setText("Fasting Blood Glucose Level");

        FastingBloodGlucoseLevelTextField.setEditable(false);
        FastingBloodGlucoseLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FastingBloodGlucoseLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        FastingBloodGlucoseLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FastingBloodGlucoseLevelUnitLabel.setText("mmol/L");

        CreatinineLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreatinineLevelLabel.setText("Creatinine Level");

        CreatinineLevelTextField.setEditable(false);
        CreatinineLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreatinineLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        CreatinineLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CreatinineLevelUnitLabel.setText("mmol/L");

        BloodUreaNitrogenLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodUreaNitrogenLevelLabel.setText("Blood Urea Nitrogen Level");

        BloodUreaNitrogenLevelTextField.setEditable(false);
        BloodUreaNitrogenLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodUreaNitrogenLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        BloodUreaNitrogenLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BloodUreaNitrogenLevelUnitLabel.setText("mmol/L");

        CalciumLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CalciumLevelLabel.setText("Calcium Level");

        CalciumLevelTextField.setEditable(false);
        CalciumLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CalciumLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        CalciumLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CalciumLevelUnitLabel.setText("mmol/L");

        PotassiumLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PotassiumLevelLabel.setText("Potassium Level");

        PotassiumLevelTextField.setEditable(false);
        PotassiumLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PotassiumLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        PotassiumLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PotassiumLevelUnitLabel.setText("mmol/L");

        SodiumLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SodiumLevelLabel.setText("Sodium Level");

        SodiumLevelTextField.setEditable(false);
        SodiumLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SodiumLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        SodiumLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SodiumLevelUnitLabel.setText("mmol/L");

        javax.swing.GroupLayout BasicMetabolicPanelPanelLayout = new javax.swing.GroupLayout(BasicMetabolicPanelPanel);
        BasicMetabolicPanelPanel.setLayout(BasicMetabolicPanelPanelLayout);
        BasicMetabolicPanelPanelLayout.setHorizontalGroup(
            BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicMetabolicPanelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BasicMetabolicPanelPanelLayout.createSequentialGroup()
                        .addComponent(SodiumLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SodiumLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicMetabolicPanelPanelLayout.createSequentialGroup()
                        .addComponent(PotassiumLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PotassiumLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicMetabolicPanelPanelLayout.createSequentialGroup()
                        .addComponent(CalciumLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CalciumLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicMetabolicPanelPanelLayout.createSequentialGroup()
                        .addComponent(CreatinineLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreatinineLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicMetabolicPanelPanelLayout.createSequentialGroup()
                        .addComponent(BloodUreaNitrogenLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BloodUreaNitrogenLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasicMetabolicPanelPanelLayout.createSequentialGroup()
                        .addComponent(FastingBloodGlucoseLevelLabel)
                        .addGap(18, 18, 18)
                        .addComponent(FastingBloodGlucoseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FastingBloodGlucoseLevelUnitLabel)
                    .addComponent(CreatinineLevelUnitLabel)
                    .addComponent(BloodUreaNitrogenLevelUnitLabel)
                    .addComponent(CalciumLevelUnitLabel)
                    .addComponent(PotassiumLevelUnitLabel)
                    .addComponent(SodiumLevelUnitLabel))
                .addGap(218, 393, Short.MAX_VALUE))
        );
        BasicMetabolicPanelPanelLayout.setVerticalGroup(
            BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasicMetabolicPanelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FastingBloodGlucoseLevelLabel)
                    .addComponent(FastingBloodGlucoseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FastingBloodGlucoseLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreatinineLevelLabel)
                    .addComponent(CreatinineLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreatinineLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodUreaNitrogenLevelLabel)
                    .addComponent(BloodUreaNitrogenLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodUreaNitrogenLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalciumLevelLabel)
                    .addComponent(CalciumLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalciumLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PotassiumLevelLabel)
                    .addComponent(PotassiumLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PotassiumLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(BasicMetabolicPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SodiumLevelLabel)
                    .addComponent(SodiumLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SodiumLevelUnitLabel))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        BloodTestTabbedPane.addTab("Basic Metabolic Panel", BasicMetabolicPanelPanel);

        CholesterolLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CholesterolLevelLabel.setText("Cholesterol Level");

        CholesterolLevelTextField.setEditable(false);
        CholesterolLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CholesterolLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        CholesterolLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CholesterolLevelUnitLabel.setText("mmol/L");

        TriglyceridesLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TriglyceridesLevelLabel.setText("Triglycerides Level");

        TriglyceridesLevelTextField.setEditable(false);
        TriglyceridesLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TriglyceridesLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        TriglyceridesLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TriglyceridesLevelUnitLabel.setText("mmol/L");

        javax.swing.GroupLayout LipidPanelPanelLayout = new javax.swing.GroupLayout(LipidPanelPanel);
        LipidPanelPanel.setLayout(LipidPanelPanelLayout);
        LipidPanelPanelLayout.setHorizontalGroup(
            LipidPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LipidPanelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LipidPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LipidPanelPanelLayout.createSequentialGroup()
                        .addComponent(CholesterolLevelLabel)
                        .addGap(32, 32, 32)
                        .addComponent(CholesterolLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CholesterolLevelUnitLabel))
                    .addGroup(LipidPanelPanelLayout.createSequentialGroup()
                        .addComponent(TriglyceridesLevelLabel)
                        .addGap(18, 18, 18)
                        .addComponent(TriglyceridesLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TriglyceridesLevelUnitLabel)))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        LipidPanelPanelLayout.setVerticalGroup(
            LipidPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LipidPanelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LipidPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CholesterolLevelLabel)
                    .addComponent(CholesterolLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CholesterolLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(LipidPanelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TriglyceridesLevelLabel)
                    .addComponent(TriglyceridesLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TriglyceridesLevelUnitLabel))
                .addContainerGap(259, Short.MAX_VALUE))
        );

        BloodTestTabbedPane.addTab("Lipid Panel", LipidPanelPanel);

        AspartateAminotransferaseLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AspartateAminotransferaseLevelLabel.setText("Aspartate Aminotransferase Level");

        AspartateAminotransferaseLevelTextField.setEditable(false);
        AspartateAminotransferaseLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AspartateAminotransferaseLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        AspartateAminotransferaseLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AspartateAminotransferaseLevelUnitLabel.setText("µkat/L");

        AlanineAminotransferaseLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlanineAminotransferaseLevelLabel.setText("Alanine Aminotransferase Level");

        AlanineAminotransferaseLevelTextField.setEditable(false);
        AlanineAminotransferaseLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlanineAminotransferaseLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        AlanineAminotransferaseLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlanineAminotransferaseLevelUnitLabel.setText("U/L");

        AlkalinePhosphataseLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlkalinePhosphataseLevelLabel.setText("Alkaline Phosphatase Level");

        AlkalinePhosphataseLevelTextField.setEditable(false);
        AlkalinePhosphataseLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlkalinePhosphataseLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        AlkalinePhosphataseLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AlkalinePhosphataseLevelUnitLabel.setText("µkat/L");

        BilirubinLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BilirubinLevelLabel.setText("Bilirubin Level");

        BilirubinLevelTextField.setEditable(false);
        BilirubinLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BilirubinLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        BilirubinLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BilirubinLevelUnitLabel.setText("µmol/L");

        javax.swing.GroupLayout LiverFunctionTestsPanelLayout = new javax.swing.GroupLayout(LiverFunctionTestsPanel);
        LiverFunctionTestsPanel.setLayout(LiverFunctionTestsPanelLayout);
        LiverFunctionTestsPanelLayout.setHorizontalGroup(
            LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LiverFunctionTestsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LiverFunctionTestsPanelLayout.createSequentialGroup()
                        .addComponent(BilirubinLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BilirubinLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LiverFunctionTestsPanelLayout.createSequentialGroup()
                        .addComponent(AlkalinePhosphataseLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AlkalinePhosphataseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LiverFunctionTestsPanelLayout.createSequentialGroup()
                        .addComponent(AlanineAminotransferaseLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AlanineAminotransferaseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LiverFunctionTestsPanelLayout.createSequentialGroup()
                        .addComponent(AspartateAminotransferaseLevelLabel)
                        .addGap(18, 18, 18)
                        .addComponent(AspartateAminotransferaseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AspartateAminotransferaseLevelUnitLabel)
                    .addComponent(AlanineAminotransferaseLevelUnitLabel)
                    .addComponent(AlkalinePhosphataseLevelUnitLabel)
                    .addComponent(BilirubinLevelUnitLabel))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        LiverFunctionTestsPanelLayout.setVerticalGroup(
            LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LiverFunctionTestsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AspartateAminotransferaseLevelLabel)
                    .addComponent(AspartateAminotransferaseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AspartateAminotransferaseLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlanineAminotransferaseLevelLabel)
                    .addComponent(AlanineAminotransferaseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlanineAminotransferaseLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlkalinePhosphataseLevelLabel)
                    .addComponent(AlkalinePhosphataseLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AlkalinePhosphataseLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(LiverFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BilirubinLevelLabel)
                    .addComponent(BilirubinLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilirubinLevelUnitLabel))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        BloodTestTabbedPane.addTab("Liver Function Tests", LiverFunctionTestsPanel);

        ThyroidStimulatingHormoneLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThyroidStimulatingHormoneLevelLabel.setText("Thyroid Stimulating Hormone Level");

        ThyroidStimulatingHormoneLevelTextField.setEditable(false);
        ThyroidStimulatingHormoneLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThyroidStimulatingHormoneLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        ThyroidStimulatingHormoneLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThyroidStimulatingHormoneLevelUnitLabel.setText("mU/L");

        TriiodothyronineLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TriiodothyronineLevelLabel.setText("Triiodothyronine Level");

        TriiodothyronineLevelTextField.setEditable(false);
        TriiodothyronineLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TriiodothyronineLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        TriiodothyronineLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TriiodothyronineLevelUnitLabel.setText("nmol/L");

        ThyroxineLevelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThyroxineLevelLabel.setText("Thyroxine Level");

        ThyroxineLevelTextField.setEditable(false);
        ThyroxineLevelTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThyroxineLevelTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        ThyroxineLevelUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThyroxineLevelUnitLabel.setText("mcg/dL");

        javax.swing.GroupLayout ThyroidFunctionTestsPanelLayout = new javax.swing.GroupLayout(ThyroidFunctionTestsPanel);
        ThyroidFunctionTestsPanel.setLayout(ThyroidFunctionTestsPanelLayout);
        ThyroidFunctionTestsPanelLayout.setHorizontalGroup(
            ThyroidFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThyroidFunctionTestsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThyroidFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ThyroidFunctionTestsPanelLayout.createSequentialGroup()
                        .addComponent(ThyroxineLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ThyroxineLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThyroidFunctionTestsPanelLayout.createSequentialGroup()
                        .addComponent(TriiodothyronineLevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TriiodothyronineLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThyroidFunctionTestsPanelLayout.createSequentialGroup()
                        .addComponent(ThyroidStimulatingHormoneLevelLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ThyroidStimulatingHormoneLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThyroidFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThyroidStimulatingHormoneLevelUnitLabel)
                    .addComponent(TriiodothyronineLevelUnitLabel)
                    .addComponent(ThyroxineLevelUnitLabel))
                .addContainerGap(336, Short.MAX_VALUE))
        );
        ThyroidFunctionTestsPanelLayout.setVerticalGroup(
            ThyroidFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThyroidFunctionTestsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThyroidFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThyroidStimulatingHormoneLevelLabel)
                    .addComponent(ThyroidStimulatingHormoneLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThyroidStimulatingHormoneLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(ThyroidFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TriiodothyronineLevelLabel)
                    .addComponent(TriiodothyronineLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TriiodothyronineLevelUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(ThyroidFunctionTestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThyroxineLevelLabel)
                    .addComponent(ThyroxineLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThyroxineLevelUnitLabel))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        BloodTestTabbedPane.addTab("Thyroid Function Tests", ThyroidFunctionTestsPanel);

        bloodTestCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTestComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BloodTestPanelLayout = new javax.swing.GroupLayout(BloodTestPanel);
        BloodTestPanel.setLayout(BloodTestPanelLayout);
        BloodTestPanelLayout.setHorizontalGroup(
            BloodTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodTestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BloodTestTimestampLabel)
                .addGap(18, 18, 18)
                .addComponent(BloodTestTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BloodTestRecordedByLabel)
                .addGap(18, 18, 18)
                .addComponent(BloodTestRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bloodTestCom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BloodTestTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        BloodTestPanelLayout.setVerticalGroup(
            BloodTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BloodTestPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BloodTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodTestTimestampLabel)
                    .addComponent(BloodTestTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodTestRecordedByLabel)
                    .addComponent(BloodTestRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodTestCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BloodTestTabbedPane))
        );

        HealthRecordTabbedPane.addTab("Blood Test", BloodTestPanel);

        UrineTestTimestampLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineTestTimestampLabel.setText("Timestamp");

        UrineTestTimestampTextField.setEditable(false);
        UrineTestTimestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        UrineTestRecordedByLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineTestRecordedByLabel.setText("Recorded by");

        UrineTestRecordedByTextField.setEditable(false);
        UrineTestRecordedByTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        UrineTestTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        UrineAppearanceAndCompositionPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        UrineClarityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineClarityLabel.setText("Urine Clarity");

        UrineClarityTextField.setEditable(false);
        UrineClarityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineClarityTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineColorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineColorLabel.setText("Urine Color");

        UrineColorTextField.setEditable(false);
        UrineColorTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        UrinepHLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrinepHLabel.setText("Urine pH");

        UrinepHTextField.setEditable(false);
        UrinepHTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrinepHTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrinepHUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrinepHUnitLabel.setText("pH");

        UrineSpecificGravityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineSpecificGravityLabel.setText("Urine Specific Gravity");

        UrineSpecificGravityTextField.setEditable(false);
        UrineSpecificGravityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout UrineAppearanceAndCompositionPanelLayout = new javax.swing.GroupLayout(UrineAppearanceAndCompositionPanel);
        UrineAppearanceAndCompositionPanel.setLayout(UrineAppearanceAndCompositionPanelLayout);
        UrineAppearanceAndCompositionPanelLayout.setHorizontalGroup(
            UrineAppearanceAndCompositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineAppearanceAndCompositionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrineAppearanceAndCompositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UrineAppearanceAndCompositionPanelLayout.createSequentialGroup()
                        .addComponent(UrineClarityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrineClarityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UrineAppearanceAndCompositionPanelLayout.createSequentialGroup()
                        .addComponent(UrineColorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrineColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UrineAppearanceAndCompositionPanelLayout.createSequentialGroup()
                        .addComponent(UrinepHLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrinepHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UrineAppearanceAndCompositionPanelLayout.createSequentialGroup()
                        .addComponent(UrineSpecificGravityLabel)
                        .addGap(18, 18, 18)
                        .addComponent(UrineSpecificGravityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UrinepHUnitLabel)
                .addContainerGap(468, Short.MAX_VALUE))
        );
        UrineAppearanceAndCompositionPanelLayout.setVerticalGroup(
            UrineAppearanceAndCompositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineAppearanceAndCompositionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrineAppearanceAndCompositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineClarityLabel)
                    .addComponent(UrineClarityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UrineAppearanceAndCompositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineColorLabel)
                    .addComponent(UrineColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UrineAppearanceAndCompositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrinepHLabel)
                    .addComponent(UrinepHTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrinepHUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineAppearanceAndCompositionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineSpecificGravityLabel)
                    .addComponent(UrineSpecificGravityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        UrineTestTabbedPane.addTab("Urine Appearance & Composition", UrineAppearanceAndCompositionPanel);

        UrineBilirubinLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineBilirubinLabel.setText("Urine Bilirubin");

        UrineBilirubinTextField.setEditable(false);
        UrineBilirubinTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineBilirubinTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineBilirubinUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineBilirubinUnitLabel.setText("μmol/L");

        UrineBloodLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineBloodLabel.setText("Urine Blood");

        UrineBloodTextField.setEditable(false);
        UrineBloodTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineBloodTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineBloodUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineBloodUnitLabel.setText("RBC/HPF");

        UrineGlucoseLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineGlucoseLabel.setText("Urine Glucose");

        UrineGlucoseTextField.setEditable(false);
        UrineGlucoseTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineGlucoseTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineGlucoseUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineGlucoseUnitLabel.setText("mmol/L");

        UrineKetonesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineKetonesLabel.setText("Urine Ketones");

        UrineKetonesTextField.setEditable(false);
        UrineKetonesTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineKetonesTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineKetonesUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineKetonesUnitLabel.setText("mmol/L");

        UrineLeukocytesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineLeukocytesLabel.setText("Urine Leukocytes");

        UrineLeukocytesTextField.setEditable(false);
        UrineLeukocytesTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineLeukocytesTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineLeukocytesUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineLeukocytesUnitLabel.setText("/HPF");

        UrineNitritesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineNitritesLabel.setText("Urine Nitrites");

        UrineNitritesTextField.setEditable(false);
        UrineNitritesTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        UrineProteinLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineProteinLabel.setText("Urine Protein");
        UrineProteinLabel.setToolTipText("");

        UrineProteinTextField.setEditable(false);
        UrineProteinTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineProteinTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineProteinUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineProteinUnitLabel.setText("mg/dL");

        javax.swing.GroupLayout UrineChemicalAnalysisPanelLayout = new javax.swing.GroupLayout(UrineChemicalAnalysisPanel);
        UrineChemicalAnalysisPanel.setLayout(UrineChemicalAnalysisPanelLayout);
        UrineChemicalAnalysisPanelLayout.setHorizontalGroup(
            UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                        .addComponent(UrineBilirubinLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrineBilirubinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(UrineBloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                                .addComponent(UrineGlucoseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UrineGlucoseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                                .addComponent(UrineProteinLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UrineProteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                                .addComponent(UrineNitritesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UrineNitritesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                                .addComponent(UrineKetonesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UrineKetonesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                                .addComponent(UrineLeukocytesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(UrineLeukocytesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(UrineBloodLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UrineProteinUnitLabel)
                    .addComponent(UrineLeukocytesUnitLabel)
                    .addComponent(UrineKetonesUnitLabel)
                    .addComponent(UrineGlucoseUnitLabel)
                    .addComponent(UrineBloodUnitLabel)
                    .addComponent(UrineBilirubinUnitLabel))
                .addContainerGap(465, Short.MAX_VALUE))
        );
        UrineChemicalAnalysisPanelLayout.setVerticalGroup(
            UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineChemicalAnalysisPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineBilirubinLabel)
                    .addComponent(UrineBilirubinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineBilirubinUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineBloodLabel)
                    .addComponent(UrineBloodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineBloodUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineGlucoseLabel)
                    .addComponent(UrineGlucoseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineGlucoseUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineKetonesLabel)
                    .addComponent(UrineKetonesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineKetonesUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineLeukocytesLabel)
                    .addComponent(UrineLeukocytesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineLeukocytesUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineNitritesLabel)
                    .addComponent(UrineNitritesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UrineChemicalAnalysisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineProteinLabel)
                    .addComponent(UrineProteinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineProteinUnitLabel))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        UrineTestTabbedPane.addTab("Urine Chemical Analysis", UrineChemicalAnalysisPanel);

        UrineAlbuminLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineAlbuminLabel.setText("Urine Albumin");

        UrineAlbuminTextField.setEditable(false);
        UrineAlbuminTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineAlbuminTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineAlbuminUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineAlbuminUnitLabel.setText("mg/d");

        UrineCalciumLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineCalciumLabel.setText("Urine Calcium");

        UrineCalciumTextField.setEditable(false);
        UrineCalciumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineCalciumTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineCalciumUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineCalciumUnitLabel.setText("mmol/24 hours");

        UrineCreatinineLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineCreatinineLabel.setText("Urine Creatinine");

        UrineCreatinineTextField.setEditable(false);
        UrineCreatinineTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineCreatinineTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineCreatinineUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineCreatinineUnitLabel.setText("mmol/24 hours");

        UrineMagnesiumLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineMagnesiumLabel.setText("Urine Magnesium");

        UrineMagnesiumTextField.setEditable(false);
        UrineMagnesiumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineMagnesiumTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineMagnesiumUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineMagnesiumUnitLabel.setText("mmol/24 hours");

        UrineMicroalbuminLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineMicroalbuminLabel.setText("Urine Microalbumin");

        UrineMicroalbuminTextField.setEditable(false);
        UrineMicroalbuminTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineMicroalbuminTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineMicroalbuminUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineMicroalbuminUnitLabel.setText("mg/d");

        UrineOsmolalityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineOsmolalityLabel.setText("Urine Osmolality");

        UrineOsmolalityTextField.setEditable(false);
        UrineOsmolalityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineOsmolalityTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineOsmolalityUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineOsmolalityUnitLabel.setText("mmol/kg");

        UrinePotassiumLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrinePotassiumLabel.setText("Urine Potassium");

        UrinePotassiumTextField.setEditable(false);
        UrinePotassiumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrinePotassiumTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrinePotassiumUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrinePotassiumUnitLabel.setText("mmol/24 hours");

        UrineSodiumLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineSodiumLabel.setText("Urine Sodium");

        UrineSodiumTextField.setEditable(false);
        UrineSodiumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineSodiumTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineSodiumUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineSodiumUnitLabel.setText("mmol/24 hours");

        UrineUricAcidLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineUricAcidLabel.setText("Urine Uric Acid");

        UrineUricAcidTextField.setEditable(false);
        UrineUricAcidTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineUricAcidTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        UrineUricAcidUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UrineUricAcidUnitLabel.setText("mmol/24 hours");

        javax.swing.GroupLayout UrineBiochemistryPanelLayout = new javax.swing.GroupLayout(UrineBiochemistryPanel);
        UrineBiochemistryPanel.setLayout(UrineBiochemistryPanelLayout);
        UrineBiochemistryPanelLayout.setHorizontalGroup(
            UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                        .addComponent(UrineAlbuminLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrineAlbuminTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UrineBiochemistryPanelLayout.createSequentialGroup()
                        .addComponent(UrineCalciumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrineCalciumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UrineBiochemistryPanelLayout.createSequentialGroup()
                        .addComponent(UrineCreatinineLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrineCreatinineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                        .addComponent(UrineMagnesiumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UrineMagnesiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                        .addComponent(UrineMicroalbuminLabel)
                        .addGap(18, 18, 18)
                        .addComponent(UrineMicroalbuminTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UrineMicroalbuminUnitLabel)
                    .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                        .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                                    .addComponent(UrineAlbuminUnitLabel)
                                    .addGap(131, 131, 131)
                                    .addComponent(UrineOsmolalityLabel))
                                .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                                    .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                                            .addComponent(UrineCalciumUnitLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UrineBiochemistryPanelLayout.createSequentialGroup()
                                            .addComponent(UrineCreatinineUnitLabel)
                                            .addGap(52, 52, 52)))
                                    .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(UrineSodiumLabel)
                                        .addComponent(UrinePotassiumLabel)
                                        .addComponent(UrineUricAcidLabel))))
                            .addComponent(UrineMagnesiumUnitLabel))
                        .addGap(18, 18, 18)
                        .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                                .addComponent(UrineOsmolalityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UrineOsmolalityUnitLabel))
                            .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                                .addComponent(UrinePotassiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UrinePotassiumUnitLabel))
                            .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                                .addComponent(UrineSodiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UrineSodiumUnitLabel))
                            .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                                .addComponent(UrineUricAcidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UrineUricAcidUnitLabel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UrineBiochemistryPanelLayout.setVerticalGroup(
            UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineBiochemistryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineAlbuminLabel)
                    .addComponent(UrineAlbuminTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineAlbuminUnitLabel)
                    .addComponent(UrineOsmolalityLabel)
                    .addComponent(UrineOsmolalityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineOsmolalityUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UrinePotassiumLabel)
                    .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(UrineCalciumLabel)
                        .addComponent(UrineCalciumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UrineCalciumUnitLabel)
                        .addComponent(UrinePotassiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UrinePotassiumUnitLabel)))
                .addGap(18, 18, 18)
                .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineCreatinineLabel)
                    .addComponent(UrineCreatinineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineCreatinineUnitLabel)
                    .addComponent(UrineSodiumLabel)
                    .addComponent(UrineSodiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineSodiumUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineMagnesiumLabel)
                    .addComponent(UrineMagnesiumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineMagnesiumUnitLabel)
                    .addComponent(UrineUricAcidLabel)
                    .addComponent(UrineUricAcidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineUricAcidUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(UrineBiochemistryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineMicroalbuminLabel)
                    .addComponent(UrineMicroalbuminTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineMicroalbuminUnitLabel))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        UrineTestTabbedPane.addTab("Urine Biochemistry", UrineBiochemistryPanel);

        urineTestCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urineTestComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UrineTestPanelLayout = new javax.swing.GroupLayout(UrineTestPanel);
        UrineTestPanel.setLayout(UrineTestPanelLayout);
        UrineTestPanelLayout.setHorizontalGroup(
            UrineTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineTestPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UrineTestTimestampLabel)
                .addGap(18, 18, 18)
                .addComponent(UrineTestTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UrineTestRecordedByLabel)
                .addGap(18, 18, 18)
                .addComponent(UrineTestRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(urineTestCom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(UrineTestTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        UrineTestPanelLayout.setVerticalGroup(
            UrineTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UrineTestPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(UrineTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UrineTestTimestampLabel)
                    .addComponent(UrineTestTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UrineTestRecordedByLabel)
                    .addComponent(UrineTestRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urineTestCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(UrineTestTabbedPane))
        );

        HealthRecordTabbedPane.addTab("Urine Test", UrineTestPanel);

        MedicalInfoTimestampLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MedicalInfoTimestampLabel.setText("Timestamp");

        MedicalInfoTimestampTextField.setEditable(false);
        MedicalInfoTimestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MedicalInfoRecordedByLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MedicalInfoRecordedByLabel.setText("Recorded by");

        MedicalInfoRecordedByTextField.setEditable(false);
        MedicalInfoRecordedByTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PrescriptionMedicationsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PrescriptionMedicationsLabel.setText("Prescription Medications");

        PrescriptionMedicationsTextArea.setEditable(false);
        PrescriptionMedicationsTextArea.setColumns(20);
        PrescriptionMedicationsTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        PrescriptionMedicationsTextArea.setRows(5);
        jScrollPane1.setViewportView(PrescriptionMedicationsTextArea);

        DosagesLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DosagesLabel.setText("Dosages");

        DosagesTextField.setEditable(false);
        DosagesTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FrequencyOfUseLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FrequencyOfUseLabel.setText("Frequency of Use");

        FrequencyOfUseTextField.setEditable(false);
        FrequencyOfUseTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FrequencyOfUseTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        FrequencyOfUseUnitLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FrequencyOfUseUnitLabel.setText("times per day");

        MealRequirementLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MealRequirementLabel.setText("Meal Requirement");

        MealRequirementTextField.setEditable(false);
        MealRequirementTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TreatmentGoalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TreatmentGoalLabel.setText("Treatment Goal");

        TreatmentGoalTextField.setEditable(false);
        TreatmentGoalTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        medicalInfoCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalInfoComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MedicalInfoPanelLayout = new javax.swing.GroupLayout(MedicalInfoPanel);
        MedicalInfoPanel.setLayout(MedicalInfoPanelLayout);
        MedicalInfoPanelLayout.setHorizontalGroup(
            MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MedicalInfoPanelLayout.createSequentialGroup()
                        .addComponent(PrescriptionMedicationsLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(MedicalInfoPanelLayout.createSequentialGroup()
                        .addComponent(MedicalInfoTimestampLabel)
                        .addGap(18, 18, 18)
                        .addComponent(MedicalInfoTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MedicalInfoRecordedByLabel)
                        .addGap(18, 18, 18)
                        .addComponent(MedicalInfoRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicalInfoCom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MedicalInfoPanelLayout.createSequentialGroup()
                        .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DosagesLabel)
                            .addComponent(FrequencyOfUseLabel)
                            .addComponent(MealRequirementLabel)
                            .addComponent(TreatmentGoalLabel))
                        .addGap(67, 67, 67)
                        .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DosagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MedicalInfoPanelLayout.createSequentialGroup()
                                .addComponent(FrequencyOfUseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FrequencyOfUseUnitLabel))
                            .addComponent(MealRequirementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TreatmentGoalTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))))
                .addContainerGap())
        );
        MedicalInfoPanelLayout.setVerticalGroup(
            MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalInfoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedicalInfoTimestampLabel)
                    .addComponent(MedicalInfoTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedicalInfoRecordedByLabel)
                    .addComponent(MedicalInfoRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicalInfoCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrescriptionMedicationsLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DosagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DosagesLabel))
                .addGap(18, 18, 18)
                .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrequencyOfUseLabel)
                    .addComponent(FrequencyOfUseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FrequencyOfUseUnitLabel))
                .addGap(18, 18, 18)
                .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MealRequirementLabel)
                    .addComponent(MealRequirementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MedicalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TreatmentGoalLabel)
                    .addComponent(TreatmentGoalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        HealthRecordTabbedPane.addTab("Medical Info", MedicalInfoPanel);

        HospitalizationTimestampLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HospitalizationTimestampLabel.setText("Timestamp");

        HospitalizationTimestampTextField.setEditable(false);
        HospitalizationTimestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        HospitalizationRecordedByLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HospitalizationRecordedByLabel.setText("Recorded by");

        HospitalizationRecordedByTextField.setEditable(false);
        HospitalizationRecordedByTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DateOfHospitalizationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DateOfHospitalizationLabel.setText("Date of Hospitalization");

        DateOfHospitalizationTextField.setEditable(false);
        DateOfHospitalizationTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ReasonLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReasonLabel.setText("Reason");

        ReasonTextArea.setEditable(false);
        ReasonTextArea.setColumns(20);
        ReasonTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ReasonTextArea.setRows(5);
        jScrollPane2.setViewportView(ReasonTextArea);

        DischargeSummaryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DischargeSummaryLabel.setText("Discharge Summary");

        DischargeSummaryTextArea.setEditable(false);
        DischargeSummaryTextArea.setColumns(20);
        DischargeSummaryTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        DischargeSummaryTextArea.setRows(5);
        jScrollPane3.setViewportView(DischargeSummaryTextArea);

        hospitalizationCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalizationComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HospitalizationPanelLayout = new javax.swing.GroupLayout(HospitalizationPanel);
        HospitalizationPanel.setLayout(HospitalizationPanelLayout);
        HospitalizationPanelLayout.setHorizontalGroup(
            HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HospitalizationPanelLayout.createSequentialGroup()
                        .addComponent(HospitalizationTimestampLabel)
                        .addGap(18, 18, 18)
                        .addComponent(HospitalizationTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(HospitalizationRecordedByLabel)
                        .addGap(18, 18, 18)
                        .addComponent(HospitalizationRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HospitalizationPanelLayout.createSequentialGroup()
                        .addGroup(HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DateOfHospitalizationLabel)
                            .addComponent(ReasonLabel)
                            .addComponent(DischargeSummaryLabel))
                        .addGap(18, 18, 18)
                        .addGroup(HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HospitalizationPanelLayout.createSequentialGroup()
                                .addComponent(DateOfHospitalizationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hospitalizationCom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        HospitalizationPanelLayout.setVerticalGroup(
            HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HospitalizationPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HospitalizationTimestampLabel)
                    .addComponent(HospitalizationTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HospitalizationRecordedByLabel)
                    .addComponent(HospitalizationRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalizationCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOfHospitalizationLabel)
                    .addComponent(DateOfHospitalizationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReasonLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(HospitalizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DischargeSummaryLabel)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        HealthRecordTabbedPane.addTab("Hospitalization", HospitalizationPanel);

        VaccinationTimestampLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VaccinationTimestampLabel.setText("Timestamp");

        VaccinationTimestampTextField.setEditable(false);
        VaccinationTimestampTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        VaccinationRecordedByLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        VaccinationRecordedByLabel.setText("Recorded by");

        VaccinationRecordedByTextField.setEditable(false);
        VaccinationRecordedByTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DateOfVaccinationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DateOfVaccinationLabel.setText("Date of Vaccination");

        DateOfVaccinationTextField.setEditable(false);
        DateOfVaccinationTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TypesOfImmunizationsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TypesOfImmunizationsLabel.setText("Types of Immunizations");

        TypesOfImmunizationsTextField.setEditable(false);
        TypesOfImmunizationsTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TypesOfImmunizationsTextField.setToolTipText("");

        DosesAdministeredLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DosesAdministeredLabel.setText("Doses Administered");

        DosesAdministeredTextField.setEditable(false);
        DosesAdministeredTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        vaccinationCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaccinationComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VaccinationPanelLayout = new javax.swing.GroupLayout(VaccinationPanel);
        VaccinationPanel.setLayout(VaccinationPanelLayout);
        VaccinationPanelLayout.setHorizontalGroup(
            VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VaccinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(VaccinationPanelLayout.createSequentialGroup()
                        .addComponent(VaccinationTimestampLabel)
                        .addGap(18, 18, 18)
                        .addComponent(VaccinationTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VaccinationRecordedByLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VaccinationPanelLayout.createSequentialGroup()
                        .addGroup(VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TypesOfImmunizationsLabel)
                            .addComponent(DateOfVaccinationLabel)
                            .addComponent(DosesAdministeredLabel))
                        .addGap(18, 18, 18)
                        .addGroup(VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DosesAdministeredTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOfVaccinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypesOfImmunizationsTextField))))
                .addGap(18, 18, 18)
                .addComponent(VaccinationRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vaccinationCom, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        VaccinationPanelLayout.setVerticalGroup(
            VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VaccinationPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VaccinationTimestampLabel)
                    .addComponent(VaccinationTimestampTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VaccinationRecordedByLabel)
                    .addComponent(VaccinationRecordedByTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaccinationCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOfVaccinationLabel)
                    .addComponent(DateOfVaccinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypesOfImmunizationsLabel)
                    .addComponent(TypesOfImmunizationsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(VaccinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DosesAdministeredLabel)
                    .addComponent(DosesAdministeredTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        HealthRecordTabbedPane.addTab("Vaccination", VaccinationPanel);

        patientCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientComActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HealthRecordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patientCom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(HealthRecordTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HealthRecordLabel)
                        .addComponent(BackButton))
                    .addComponent(patientCom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HealthRecordTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        PatientMenu patientMenu = new PatientMenu();
        patientMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void medicalHistoryComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalHistoryComActionPerformed
        displayMedicalHistory(medicalHistoryCom.getSelectedIndex());
    }//GEN-LAST:event_medicalHistoryComActionPerformed

    private void vaccinationComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaccinationComActionPerformed
        displayVaccination(vaccinationCom.getSelectedIndex());
    }//GEN-LAST:event_vaccinationComActionPerformed

    private void hospitalizationComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalizationComActionPerformed
        displayHospitalization(hospitalizationCom.getSelectedIndex());
    }//GEN-LAST:event_hospitalizationComActionPerformed

    private void medicalInfoComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalInfoComActionPerformed
        displayMedicalInformation(medicalInfoCom.getSelectedIndex());
    }//GEN-LAST:event_medicalInfoComActionPerformed

    private void urineTestComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urineTestComActionPerformed
        displayUrineTest(urineTestCom.getSelectedIndex());
    }//GEN-LAST:event_urineTestComActionPerformed

    private void bloodTestComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTestComActionPerformed
        displayBloodTest(bloodTestCom.getSelectedIndex());
    }//GEN-LAST:event_bloodTestComActionPerformed

    private void vitalSignsComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalSignsComActionPerformed
        displayVitalSign(vitalSignsCom.getSelectedIndex());
    }//GEN-LAST:event_vitalSignsComActionPerformed

    private void patientComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientComActionPerformed
        String patientID = patientCom.getSelectedItem().toString();
        HealthRecord healthRecord = DataIO.PatientIO.checkPatient(patientID).getMyHealthRecord();
        
        
        vitalSigns = healthRecord.getVitalSigns();
        medicalHistories = healthRecord.getMedicalHistories();
        bloodTests = healthRecord.getBloodTests();
        urineTests = healthRecord.getUrineTests();
        medicalInformations = healthRecord.getMedicalInformations();
        hospitalizations = healthRecord.getHospitalizations();
        vaccinations = healthRecord.getVaccinations();
        
        // Remove the items in combo box
        vitalSignsCom.removeAllItems();
        medicalHistoryCom.removeAllItems();
        bloodTestCom.removeAllItems();
        urineTestCom.removeAllItems();
        medicalInfoCom.removeAllItems();
        hospitalizationCom.removeAllItems();
        vaccinationCom.removeAllItems();

        if (!healthRecord.getVitalSigns().isEmpty()) {
            for (int i = 1; i <= vitalSigns.size(); i++) {
                vitalSignsCom.addItem(String.valueOf(i));
            }
            vitalSignsCom.setSelectedIndex(vitalSigns.size() - 1);
            displayVitalSign(vitalSigns.size() - 1);
        }
        
        if (!medicalHistories.isEmpty()) {
            for (int i = 1; i <= medicalHistories.size(); i++) {
                medicalHistoryCom.addItem(String.valueOf(i));
            }
            medicalHistoryCom.setSelectedIndex(medicalHistories.size() - 1);
            displayMedicalHistory(medicalHistories.size() - 1);
        }
        if (!bloodTests.isEmpty()) {
            for (int i = 1; i <= bloodTests.size(); i++) {
                bloodTestCom.addItem(String.valueOf(i));
            }
            bloodTestCom.setSelectedIndex(bloodTests.size() - 1);
            displayBloodTest(bloodTests.size() - 1);
        }
    
        if (!urineTests.isEmpty()) {
            for (int i = 1; i <= urineTests.size(); i++) {
                urineTestCom.addItem(String.valueOf(i));
            }
            urineTestCom.setSelectedIndex(urineTests.size() - 1);
            displayUrineTest(urineTests.size() - 1);
        }
        
        if (!medicalInformations.isEmpty()) {
            for (int i = 1; i <= medicalInformations.size(); i++) {
                medicalInfoCom.addItem(String.valueOf(i));
            }
            medicalInfoCom.setSelectedIndex(medicalInformations.size() - 1);
            displayMedicalInformation(medicalInformations.size() - 1);
        }
        
        if (!hospitalizations.isEmpty()) {
            for (int i = 1; i <= hospitalizations.size(); i++) {
                hospitalizationCom.addItem(String.valueOf(i));
            }
            hospitalizationCom.setSelectedIndex(hospitalizations.size() - 1);
            displayHospitalization(hospitalizations.size() - 1);
        }
        
        if (!vaccinations.isEmpty()) {
            for (int i = 1; i <= vaccinations.size(); i++) {
                vaccinationCom.addItem(String.valueOf(i));
            }
            vaccinationCom.setSelectedIndex(vaccinations.size() - 1);
            displayVaccination(vaccinations.size() - 1);
        }
    }//GEN-LAST:event_patientComActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewHealthRecordDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHealthRecordDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHealthRecordDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHealthRecordDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHealthRecordDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlanineAminotransferaseLevelLabel;
    private javax.swing.JTextField AlanineAminotransferaseLevelTextField;
    private javax.swing.JLabel AlanineAminotransferaseLevelUnitLabel;
    private javax.swing.JLabel AlkalinePhosphataseLevelLabel;
    private javax.swing.JTextField AlkalinePhosphataseLevelTextField;
    private javax.swing.JLabel AlkalinePhosphataseLevelUnitLabel;
    private javax.swing.JLabel AllergyLabel;
    private javax.swing.JTextField AllergyTextField;
    private javax.swing.JLabel AspartateAminotransferaseLevelLabel;
    private javax.swing.JTextField AspartateAminotransferaseLevelTextField;
    private javax.swing.JLabel AspartateAminotransferaseLevelUnitLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel BasicMetabolicPanelPanel;
    private javax.swing.JLabel BilirubinLevelLabel;
    private javax.swing.JTextField BilirubinLevelTextField;
    private javax.swing.JLabel BilirubinLevelUnitLabel;
    private javax.swing.JLabel BloodPressureLabel;
    private javax.swing.JTextField BloodPressureTextField;
    private javax.swing.JLabel BloodPressureUnitLabel;
    private javax.swing.JPanel BloodTestPanel;
    private javax.swing.JLabel BloodTestRecordedByLabel;
    private javax.swing.JTextField BloodTestRecordedByTextField;
    private javax.swing.JTabbedPane BloodTestTabbedPane;
    private javax.swing.JLabel BloodTestTimestampLabel;
    private javax.swing.JTextField BloodTestTimestampTextField;
    private javax.swing.JLabel BloodUreaNitrogenLevelLabel;
    private javax.swing.JTextField BloodUreaNitrogenLevelTextField;
    private javax.swing.JLabel BloodUreaNitrogenLevelUnitLabel;
    private javax.swing.JLabel BodyMassIndexLabel;
    private javax.swing.JTextField BodyMassIndexTextField;
    private javax.swing.JLabel BodyMassIndexUUnitLabel;
    private javax.swing.JLabel CalciumLevelLabel;
    private javax.swing.JTextField CalciumLevelTextField;
    private javax.swing.JLabel CalciumLevelUnitLabel;
    private javax.swing.JLabel CholesterolLevelLabel;
    private javax.swing.JTextField CholesterolLevelTextField;
    private javax.swing.JLabel CholesterolLevelUnitLabel;
    private javax.swing.JLabel ChronicConditionLabel;
    private javax.swing.JTextField ChronicConditionTextField;
    private javax.swing.JPanel CompleteBloodCountPanel;
    private javax.swing.JLabel CreatinineLevelLabel;
    private javax.swing.JTextField CreatinineLevelTextField;
    private javax.swing.JLabel CreatinineLevelUnitLabel;
    private javax.swing.JLabel DateOfHospitalizationLabel;
    private javax.swing.JTextField DateOfHospitalizationTextField;
    private javax.swing.JLabel DateOfVaccinationLabel;
    private javax.swing.JTextField DateOfVaccinationTextField;
    private javax.swing.JLabel DischargeSummaryLabel;
    private javax.swing.JTextArea DischargeSummaryTextArea;
    private javax.swing.JLabel DosagesLabel;
    private javax.swing.JTextField DosagesTextField;
    private javax.swing.JLabel DosesAdministeredLabel;
    private javax.swing.JTextField DosesAdministeredTextField;
    private javax.swing.JLabel FamilyMedicalHistoryLabel;
    private javax.swing.JTextField FamilyMedicalHistoryTextField;
    private javax.swing.JLabel FastingBloodGlucoseLevelLabel;
    private javax.swing.JTextField FastingBloodGlucoseLevelTextField;
    private javax.swing.JLabel FastingBloodGlucoseLevelUnitLabel;
    private javax.swing.JLabel FrequencyOfUseLabel;
    private javax.swing.JTextField FrequencyOfUseTextField;
    private javax.swing.JLabel FrequencyOfUseUnitLabel;
    private javax.swing.JLabel HealthRecordLabel;
    private javax.swing.JTabbedPane HealthRecordTabbedPane;
    private javax.swing.JLabel HeartRateLabel;
    private javax.swing.JTextField HeartRateTextField;
    private javax.swing.JLabel HeartRateUnitLabel;
    private javax.swing.JLabel HeightLabel;
    private javax.swing.JTextField HeightTextField;
    private javax.swing.JLabel HeightUnitLabel;
    private javax.swing.JLabel HematocritLevelLabel;
    private javax.swing.JTextField HematocritLevelTextField;
    private javax.swing.JLabel HematocritLevelUnitLabel;
    private javax.swing.JLabel HemoglobinLevelLabel;
    private javax.swing.JTextField HemoglobinLevelTextField;
    private javax.swing.JLabel HemoglobinLevelUnitLabel;
    private javax.swing.JPanel HospitalizationPanel;
    private javax.swing.JLabel HospitalizationRecordedByLabel;
    private javax.swing.JTextField HospitalizationRecordedByTextField;
    private javax.swing.JLabel HospitalizationTimestampLabel;
    private javax.swing.JTextField HospitalizationTimestampTextField;
    private javax.swing.JPanel LipidPanelPanel;
    private javax.swing.JPanel LiverFunctionTestsPanel;
    private javax.swing.JLabel MealRequirementLabel;
    private javax.swing.JTextField MealRequirementTextField;
    private javax.swing.JPanel MedicalHistoryPanel;
    private javax.swing.JLabel MedicalHistoryRecordedByLabel;
    private javax.swing.JTextField MedicalHistoryRecordedByTextField;
    private javax.swing.JLabel MedicalHistoryTimestampLabel;
    private javax.swing.JTextField MedicalHistoryTimestampTextField;
    private javax.swing.JPanel MedicalInfoPanel;
    private javax.swing.JLabel MedicalInfoRecordedByLabel;
    private javax.swing.JTextField MedicalInfoRecordedByTextField;
    private javax.swing.JLabel MedicalInfoTimestampLabel;
    private javax.swing.JTextField MedicalInfoTimestampTextField;
    private javax.swing.JLabel MedicationLabel;
    private javax.swing.JTextField MedicationTextField;
    private javax.swing.JLabel PastSurgicalHistoryLabel;
    private javax.swing.JTextField PastSurgicalHistoryTextField;
    private javax.swing.JLabel PlateletCountLabel;
    private javax.swing.JTextField PlateletCountTextField;
    private javax.swing.JLabel PlateletCountUnitLabel;
    private javax.swing.JLabel PotassiumLevelLabel;
    private javax.swing.JTextField PotassiumLevelTextField;
    private javax.swing.JLabel PotassiumLevelUnitLabel;
    private javax.swing.JLabel PrescriptionMedicationsLabel;
    private javax.swing.JTextArea PrescriptionMedicationsTextArea;
    private javax.swing.JLabel ReasonLabel;
    private javax.swing.JTextArea ReasonTextArea;
    private javax.swing.JLabel RedBloodCellCountLabel;
    private javax.swing.JTextField RedBloodCellCountTextField;
    private javax.swing.JLabel RedBloodCellCountUnitLabel;
    private javax.swing.JLabel RespiratoryRateLabel;
    private javax.swing.JTextField RespiratoryRateTextField;
    private javax.swing.JLabel RespiratoryRateUnitLabel;
    private javax.swing.JLabel SodiumLevelLabel;
    private javax.swing.JTextField SodiumLevelTextField;
    private javax.swing.JLabel SodiumLevelUnitLabel;
    private javax.swing.JLabel TemperatureLabel;
    private javax.swing.JTextField TemperatureTextField;
    private javax.swing.JLabel TemperatureUnitLabel;
    private javax.swing.JPanel ThyroidFunctionTestsPanel;
    private javax.swing.JLabel ThyroidStimulatingHormoneLevelLabel;
    private javax.swing.JTextField ThyroidStimulatingHormoneLevelTextField;
    private javax.swing.JLabel ThyroidStimulatingHormoneLevelUnitLabel;
    private javax.swing.JLabel ThyroxineLevelLabel;
    private javax.swing.JTextField ThyroxineLevelTextField;
    private javax.swing.JLabel ThyroxineLevelUnitLabel;
    private javax.swing.JLabel TreatmentGoalLabel;
    private javax.swing.JTextField TreatmentGoalTextField;
    private javax.swing.JLabel TriglyceridesLevelLabel;
    private javax.swing.JTextField TriglyceridesLevelTextField;
    private javax.swing.JLabel TriglyceridesLevelUnitLabel;
    private javax.swing.JLabel TriiodothyronineLevelLabel;
    private javax.swing.JTextField TriiodothyronineLevelTextField;
    private javax.swing.JLabel TriiodothyronineLevelUnitLabel;
    private javax.swing.JLabel TypesOfImmunizationsLabel;
    private javax.swing.JTextField TypesOfImmunizationsTextField;
    private javax.swing.JLabel UrineAlbuminLabel;
    private javax.swing.JTextField UrineAlbuminTextField;
    private javax.swing.JLabel UrineAlbuminUnitLabel;
    private javax.swing.JPanel UrineAppearanceAndCompositionPanel;
    private javax.swing.JLabel UrineBilirubinLabel;
    private javax.swing.JTextField UrineBilirubinTextField;
    private javax.swing.JLabel UrineBilirubinUnitLabel;
    private javax.swing.JPanel UrineBiochemistryPanel;
    private javax.swing.JLabel UrineBloodLabel;
    private javax.swing.JTextField UrineBloodTextField;
    private javax.swing.JLabel UrineBloodUnitLabel;
    private javax.swing.JLabel UrineCalciumLabel;
    private javax.swing.JTextField UrineCalciumTextField;
    private javax.swing.JLabel UrineCalciumUnitLabel;
    private javax.swing.JPanel UrineChemicalAnalysisPanel;
    private javax.swing.JLabel UrineClarityLabel;
    private javax.swing.JTextField UrineClarityTextField;
    private javax.swing.JLabel UrineColorLabel;
    private javax.swing.JTextField UrineColorTextField;
    private javax.swing.JLabel UrineCreatinineLabel;
    private javax.swing.JTextField UrineCreatinineTextField;
    private javax.swing.JLabel UrineCreatinineUnitLabel;
    private javax.swing.JLabel UrineGlucoseLabel;
    private javax.swing.JTextField UrineGlucoseTextField;
    private javax.swing.JLabel UrineGlucoseUnitLabel;
    private javax.swing.JLabel UrineKetonesLabel;
    private javax.swing.JTextField UrineKetonesTextField;
    private javax.swing.JLabel UrineKetonesUnitLabel;
    private javax.swing.JLabel UrineLeukocytesLabel;
    private javax.swing.JTextField UrineLeukocytesTextField;
    private javax.swing.JLabel UrineLeukocytesUnitLabel;
    private javax.swing.JLabel UrineMagnesiumLabel;
    private javax.swing.JTextField UrineMagnesiumTextField;
    private javax.swing.JLabel UrineMagnesiumUnitLabel;
    private javax.swing.JLabel UrineMicroalbuminLabel;
    private javax.swing.JTextField UrineMicroalbuminTextField;
    private javax.swing.JLabel UrineMicroalbuminUnitLabel;
    private javax.swing.JLabel UrineNitritesLabel;
    private javax.swing.JTextField UrineNitritesTextField;
    private javax.swing.JLabel UrineOsmolalityLabel;
    private javax.swing.JTextField UrineOsmolalityTextField;
    private javax.swing.JLabel UrineOsmolalityUnitLabel;
    private javax.swing.JLabel UrinePotassiumLabel;
    private javax.swing.JTextField UrinePotassiumTextField;
    private javax.swing.JLabel UrinePotassiumUnitLabel;
    private javax.swing.JLabel UrineProteinLabel;
    private javax.swing.JTextField UrineProteinTextField;
    private javax.swing.JLabel UrineProteinUnitLabel;
    private javax.swing.JLabel UrineSodiumLabel;
    private javax.swing.JTextField UrineSodiumTextField;
    private javax.swing.JLabel UrineSodiumUnitLabel;
    private javax.swing.JLabel UrineSpecificGravityLabel;
    private javax.swing.JTextField UrineSpecificGravityTextField;
    private javax.swing.JPanel UrineTestPanel;
    private javax.swing.JLabel UrineTestRecordedByLabel;
    private javax.swing.JTextField UrineTestRecordedByTextField;
    private javax.swing.JTabbedPane UrineTestTabbedPane;
    private javax.swing.JLabel UrineTestTimestampLabel;
    private javax.swing.JTextField UrineTestTimestampTextField;
    private javax.swing.JLabel UrineUricAcidLabel;
    private javax.swing.JTextField UrineUricAcidTextField;
    private javax.swing.JLabel UrineUricAcidUnitLabel;
    private javax.swing.JLabel UrinepHLabel;
    private javax.swing.JTextField UrinepHTextField;
    private javax.swing.JLabel UrinepHUnitLabel;
    private javax.swing.JPanel VaccinationPanel;
    private javax.swing.JLabel VaccinationRecordedByLabel;
    private javax.swing.JTextField VaccinationRecordedByTextField;
    private javax.swing.JLabel VaccinationTimestampLabel;
    private javax.swing.JTextField VaccinationTimestampTextField;
    private javax.swing.JPanel VitalSignsPanel;
    private javax.swing.JLabel VitalSignsRecordedByLabel;
    private javax.swing.JTextField VitalSignsRecordedByTextField;
    private javax.swing.JLabel VitalSignsTimestampLabel;
    private javax.swing.JTextField VitalSignsTimestampTextField;
    private javax.swing.JLabel WeightLabel;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JLabel WeightUnitLabel;
    private javax.swing.JLabel WhiteBloodCellCountLabel;
    private javax.swing.JTextField WhiteBloodCellCountTextField;
    private javax.swing.JLabel WhiteBloodCellCountUnitLabel;
    private javax.swing.JComboBox<String> bloodTestCom;
    private javax.swing.JComboBox<String> hospitalizationCom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> medicalHistoryCom;
    private javax.swing.JComboBox<String> medicalInfoCom;
    private javax.swing.JComboBox<String> patientCom;
    private javax.swing.JComboBox<String> urineTestCom;
    private javax.swing.JComboBox<String> vaccinationCom;
    private javax.swing.JComboBox<String> vitalSignsCom;
    // End of variables declaration//GEN-END:variables
}
