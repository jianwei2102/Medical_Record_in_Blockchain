package DataIO;

import Classes.Permission;
import java.util.Iterator;
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
        // Else?
    }
    
    // Remove permission -- Working GPT
    public static void removePermission(String patientID, String doctorID){
        if(checkPermission(patientID, doctorID)) {
            Iterator<Permission> iterator = allPermission.iterator();
            while (iterator.hasNext()) {
                Permission p = iterator.next();
                if (p.getPatientID().equals(patientID) && p.getDoctorID().equals(doctorID)) {
                    iterator.remove(); // Remove the permission
                    DataIO.writeToFile();
                    return;
                }
            }
        }
        // Else?
    }
}
