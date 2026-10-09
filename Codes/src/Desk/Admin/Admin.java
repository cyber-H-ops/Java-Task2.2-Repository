package Desk.Admin;
import Desk.Patient;
  public class Admin {
    public void view(Patient p) {
        System.out.println("ADMIN sees: " + p.getName() + " | Balance: " + p.getBalance(this));
    }
}