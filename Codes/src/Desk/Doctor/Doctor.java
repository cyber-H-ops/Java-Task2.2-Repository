package Desk.Doctor;
import Desk.Patient;
  public class Doctor {
    public void view(Patient p) {
        System.out.println("DOCTOR sees: " + p.getName() + " | Diagnosis: "
                + p.getDiagnosis(this) + " | Appointment: " + p.getAppointment());
    }
}