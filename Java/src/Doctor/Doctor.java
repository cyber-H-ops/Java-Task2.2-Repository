package Doctor;

import System.Patient;

  public class Doctor {
    private void view(Patient p) {
        System.out.println("DOCTOR sees: " + p.getName() + " | Diagnosis: " + p.getDiagnosis(this) + " | Appointment: " + p.getAppointment());
    }
}