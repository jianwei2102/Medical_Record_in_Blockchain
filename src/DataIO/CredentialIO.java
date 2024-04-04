package DataIO;

import Classes.Credential;
import Classes.Validation;
import static DataIO.DataIO.allCredential;

public class CredentialIO {
    public static Credential validateCredential(String userID, String password) {
        Credential found = null;
        for (Credential credential : allCredential) {
            if (credential.getUserID().equals(userID) && credential.getPassword().equals(password)) {
                found = credential;
                break;
            }
        }
        return found;
    }
    
    public static Validation validateExist(String userID) {
        Validation v = new Validation(true, "", "");
        for (Credential credential : allCredential) {
            if (credential.getUserID().equals(userID)) {
                v.setValid(false);
                v.setMessage("This user already exists");
                v.setMessageType("Invalid Input");
                break;
            }
        }
        return v;
    }
    
    public static Validation validateUserID(String userID) {
        Validation v = new Validation(true, "", "");
        if (!userID.equals("admin")) {
            if (userID.isEmpty()) {
                v.setValid(false);
                v.setMessage("Add your IC number");
                v.setMessageType("Missing Value");
            }
            else if (userID.matches("^[a-zA-Z]*$")) {
                v.setValid(false);
                v.setMessage("IC should be number only");
                v.setMessageType("Invalid Input");
            }
        }
        return v;
    }
    
    public static Validation validatePassword(String password) {
        Validation v = new Validation(true, "", "");
        if (password.isEmpty()) {
            v.setValid(false);
            v.setMessage("Add your password");
            v.setMessageType("Missing Value");
        }
        else if (password.length() < 4 || password.length() > 16) {
            v.setValid(false);
            v.setMessage("Password should be 4 to 16 characters only");
            v.setMessageType("Invalid Input");
        }
        return v;
    }
}
