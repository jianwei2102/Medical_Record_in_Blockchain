package DataIO;

import Classes.Permission;
import static DataIO.DataIO.allPermission;

public class PermissionIO {
    // Validate permission 
    public static Boolean checkPermission(String patientID, String doctorID){
        for(Permission p : allPermission){
            if (p.getPatientID().equals(patientID)) {
                if (p.getDoctorID().equals(doctorID)){
                    return true;
                }
            }
        }
        return false;
    }
    
    // Add permission
    public static void addNewPermission(String patientID, String doctorID){
        if(!checkPermission(patientID, doctorID)) {
            allPermission.add(new Permission(patientID, doctorID));
            DataIO.writeToFile();
        }
    }
    
    // Remove permission
    public static void removePermission(String patientID, String doctorID){
        if(checkPermission(patientID, doctorID)) {
            allPermission.removeIf(p -> p.getPatientID().equals(patientID) && p.getDoctorID().equals(doctorID));
            DataIO.writeToFile();
        }
    }
}
