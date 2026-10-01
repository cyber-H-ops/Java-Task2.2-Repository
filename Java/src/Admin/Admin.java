package Admin;

import System.Patient;

 public class Admin {
    protected void view(Patient p) {
        System.out.println("ADMIN sees: " + p.getName() + " | Balance: " + p.getBalance(this));
    }
}