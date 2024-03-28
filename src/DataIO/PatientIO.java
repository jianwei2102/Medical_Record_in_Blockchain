package DataIO;

import Classes.Patient;
import Classes.Validation;
import static DataIO.DataIO.allPatient;
import javax.swing.JRadioButton;

public class PatientIO {
    // Check if the username exist in txt file and return the user record
    public static Patient checkPatient(String patientID){ 
        Patient found = null;
        for (Patient p : allPatient){
            if(patientID.equals(p.getPatientID())) {
                found = p;
                break;
            }
        }
       return found;
    }
    
    public static Validation validateName(String name) {
        Validation v = new Validation(true, "", "");
        if (name.isEmpty()) {
            v.setValid(false);
            v.setMessage("Add your name");
            v.setMessageType("Missing Value");
        }
        else if (!name.matches("^[a-zA-Z]+$")) {
            v.setValid(false);
            v.setMessage("Enter your name using letters only");
            v.setMessageType("Invalid Input");
        }
        return v;
    }
    
    public static Validation validateGender(JRadioButton male, JRadioButton female) {
        Validation v = new Validation(true, "", "");
        if (!male.isSelected() && !female.isSelected()) {
            v.setValid(false);
            v.setMessage("Select your gender");
            v.setMessageType("Missing Value");
        }
        return v;
    }
    
    public static Validation validateContact(String contact) {
        Validation v = new Validation(true, "", "");
        if (contact.isEmpty()) {
            v.setValid(false);
            v.setMessage("Add your contact");
            v.setMessageType("Missing Value");
        }
        else if (!contact.matches("\\d+")) {
            v.setValid(false);
            v.setMessage("Contact should be number only");
            v.setMessageType("Invalid Input");
        }
        return v;
    }
    
    public static Validation validateEmergencyContact(String emergencyContact) {
        Validation v = new Validation(true, "", "");
        if (emergencyContact.isEmpty()) {
            v.setValid(false);
            v.setMessage("Add your emergency contact");
            v.setMessageType("Missing Value");
        }
        else if (!emergencyContact.matches("\\d+")) {
            v.setValid(false);
            v.setMessage("Emergency contact should be number only");
            v.setMessageType("Invalid Input");
        }
        return v;
    }
    
    public static void addNewPatient(String ic, String name, String dob, String gender,
            String address, String contact, String emergencyContact){
        DataIO.allPatient.add(new Patient(ic, name, dob, gender, address, contact, emergencyContact));
        DataIO.writeToFile();
    }
}
