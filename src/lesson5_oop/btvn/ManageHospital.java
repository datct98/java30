package lesson5_oop.btvn;

public class ManageHospital {
    private Doctor[] doctors;
    private Patient[] patients;

    public ManageHospital(Doctor[] doctors, Patient[] patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
}
