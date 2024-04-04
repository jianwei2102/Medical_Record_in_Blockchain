package bcd;

import Classes.MedicalHistory; // To remove
import Classes.Patient;
import Classes.Doctor;
import DataIO.DataIO;
import DataIO.BlockIO;
import DataIO.DoctorIO;
import DataIO.PermissionIO; // To remove
import DataIO.HealthRecordIO; // To remove
import UIUX.Login;
import blockchain.Blockchain; // to remove

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
//        Officer - admin;admin;3
//        Patient - 111213141234;patient;1
//        Docotr -  944342414321;doctor;2

    }
}
