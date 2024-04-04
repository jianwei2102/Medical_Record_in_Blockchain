package Classes;

public class Doctor {
    private String doctorID;
    private String name;
    private String hospitalName;
    private String hospitalAddress;
    private String department;
    private String role;

    public Doctor(String doctorID, String name, String hospitalName, 
            String hospitalAddress, String department, String role) {
        this.doctorID = doctorID;
        this.name = name;
        this.hospitalName = hospitalName;
        this.hospitalAddress = hospitalAddress;
        this.department = department;
        this.role = role;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
