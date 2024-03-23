package DataIO;

import Classes.Permission;
import static DataIO.DataIO.allPermission;

public class PermissionIO {
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
    
    // add permission
    public static void addNewPermission(String patientID, String doctorID){
        if(!checkPermission(patientID, doctorID)) {
            allPermission.add(new Permission(patientID, doctorID));
            DataIO.writeToFile();
        }
    }
    
    
    // remove permission
    
}
