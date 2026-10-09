package Desk;
import Desk.Admin.Admin;
import Desk.Doctor.Doctor;
public class Main {
    public static void main(String[] args) {
        Patient alice = new Patient("Alice", "Oct 5, 2026", "Hypertension", 500_000);
        new Doctor().view(alice);
        new Receptionist().view(alice);
        new Admin().view(alice);
    }
}