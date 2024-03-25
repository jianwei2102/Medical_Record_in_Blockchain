package DataIO;

import Classes.Credential;
import static DataIO.DataIO.allCredential;

public class CredentialIO {
    public static Credential validateCredential(String userID, String password) {
        Credential found = null;
        for (Credential credential : allCredential) {
            found = (credential.getUserID().equals(userID) && credential.getPassword().equals(password)) ? credential : null;
            break;
        }
        return found;
    } 
    // function checkUsername -> IC
}
