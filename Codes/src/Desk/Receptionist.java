package Desk;
public class Receptionist {
    public void view(Patient p) {
        System.out.println("RECEPTIONIST sees: " + p.getName() + " | Appointment: " + p.getAppointment());
    }
}
