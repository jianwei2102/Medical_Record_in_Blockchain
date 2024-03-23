package DataIO;

import Classes.Patient;
import static DataIO.DataIO.allPatient;

public class PatientIO {
    // function checkUsername -> IC
//    // Check if the username exist in txt file and return the user record
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
//    
//    public static boolean ValidateUsername(String userInfo[]){
//        User validUser = userIO.checkUsername(userInfo[0]);
//            if (validUser != null) {
//                JOptionPane.showMessageDialog(null, "This username is already been taken. Please enter another username", "Error", JOptionPane.ERROR_MESSAGE); // Display error message                              
//                return false;
//            } 
//            return true;
//    }
    
    // Validate info
    
    // Add new patient
    // Call writeToFile whenever have new user added
}
