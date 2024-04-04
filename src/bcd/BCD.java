package bcd;

import Classes.Patient;
import Classes.Doctor;
import DataIO.DataIO;
import DataIO.BlockIO;
import UIUX.Login;

public class BCD {
    public static Login login;
    
    public static Doctor loginDoctor = null;
    public static Patient loginPatient = null;
    
    public static void main(String[] args) throws Exception {
        // Read data from off-chain data to memory
        DataIO.readFromFile();
        // Read data from on-chain data to memory
        BlockIO.readFromBlockchain();
        
        login = new Login();
        login.setVisible(true);
//        Credential
//        Officer - admin;admin
//        Patient - 111213141234;patient
//        Docotr -  944342414321;doctor

    }
}
