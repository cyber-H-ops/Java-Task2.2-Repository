package Doctor;

import System.Patient;

private class Doctor {
    public void view(Patient p) {
        System.out.println("DOCTOR sees: " + p.getName() + " | Diagnosis: " + p.getDiagnosis(this) + " | Appointment: " + p.getAppointment());
    }
}