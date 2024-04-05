package DataIO;

import Classes.Permission;
import Classes.Patient;
import Classes.Doctor;
import Classes.Credential;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class DataIO {
    public static ArrayList<Patient> allPatient = new ArrayList<>();
    public static ArrayList<Doctor> allDoctor = new ArrayList<>();
    public static ArrayList<Credential> allCredential = new ArrayList<>();
    public static ArrayList<Permission> allPermission = new ArrayList<>();
    
    public static void readFromFile(){
        try{
            // Patient 
            Scanner sPatient = new Scanner(new File("patient.txt"));
            while(sPatient.hasNextLine()) {
                String patient = sPatient.nextLine();
                String [] patientDetails = patient.split(";");
                //String patientID, String name, String dob, String gender, String address, String contact, String emergencyContact
                allPatient.add(new Patient(patientDetails[0], patientDetails[1], patientDetails[2], 
                        patientDetails[3], patientDetails[4], patientDetails[5], patientDetails[6]));
            }
            sPatient.close();
            
            // Doctor
            Scanner sDoctor = new Scanner(new File("doctor.txt"));
            while(sDoctor.hasNextLine()) {
                String doctor = sDoctor.nextLine();
                String [] doctorDetails = doctor.split(";");
                //String doctorID, String name, String hospitalName, String hospitalAddress, String department, String role
                allDoctor.add(new Doctor(doctorDetails[0], doctorDetails[1], doctorDetails[2], 
                        doctorDetails[3], doctorDetails[4], doctorDetails[5]));
            }
            sDoctor.close();
            
            // Credential
            Scanner sCredential = new Scanner(new File("credential.txt"));
            while(sCredential.hasNextLine()) {
                String credential = sCredential.nextLine();
                String [] credentialDetails = credential.split(";");
                //String doctorID, String name, String hospitalName, String hospitalAddress, String department, String role
                allCredential.add(new Credential(credentialDetails[0], credentialDetails[1], credentialDetails[2]));
            }
            sDoctor.close();
            
             // Permission
            Scanner sPermission = new Scanner(new File("permission.txt"));
            while(sPermission.hasNextLine()) {
                String permission = sPermission.nextLine();
                String [] permissionDetails = permission.split(";");
                //String patientID, String doctorID
                allPermission.add(new Permission(permissionDetails[0], permissionDetails[1]));
            }
            sDoctor.close();
            
        }catch(FileNotFoundException e){
            System.out.println("Read file error...");
        }
    }
    
     public static void writeToFile(){
        try{
            // Patient
            PrintWriter pPatient = new PrintWriter("patient.txt");
            for(Patient p : allPatient) {
                //String patientID, String name, String dob, String gender, String address, String contact, String emergencyContact
                pPatient.println(p.getPatientID()+";"+p.getName()+";"+p.getDob()+";"+p.getGender()+";"
                        +p.getAddress()+";"+p.getContact()+";"+p.getEmergencyContact());
            }
            pPatient.close();
            
            // Doctor
            PrintWriter pDoctor = new PrintWriter("doctor.txt");
            for(Doctor d : allDoctor) {
                //String doctorID, String name, String hospitalName, String hospitalAddress, String department, String role
                pDoctor.println(d.getDoctorID()+";"+d.getName()+";"+d.getHospitalName()+";"
                        +d.getHospitalAddress()+";"+d.getDepartment()+";"+d.getRole());
            }
            pDoctor.close();
         
            // Credential
            PrintWriter pCredential = new PrintWriter("credential.txt");
            for(Credential c : allCredential) {
                //String userID, String password, String role
                pCredential.println(c.getUserID()+";"+c.getPassword()+";"+c.getRole());
            }
            pCredential.close();
            
            // Permission
            PrintWriter pPermission = new PrintWriter("permission.txt");
            for(Permission p : allPermission) {
                //String patientID, String doctorID
                pPermission.println(p.getPatientID()+";"+p.getDoctorID());
            }
            pPermission.close();
        }catch(FileNotFoundException e){
            System.out.println("PrintWriter error...");
        }
    }
     
     public static void tableSearchId(JTable table, String id, int colno){
        try {
            DefaultTableModel display = (DefaultTableModel)table.getModel(); // Get table model
            TableRowSorter<DefaultTableModel> resultRow = new TableRowSorter<>(display); // Create table row sorter object
            resultRow.setRowFilter(RowFilter.regexFilter(id, colno)); // Check inputted string with the 1st column of the table
            table.setRowSorter(resultRow); // Set results from the filter to table
        }
        catch (PatternSyntaxException ex){
            JOptionPane.showMessageDialog(null, "Only enter numbers or letters!", "Error", JOptionPane.ERROR_MESSAGE);                
        }
    }
}
