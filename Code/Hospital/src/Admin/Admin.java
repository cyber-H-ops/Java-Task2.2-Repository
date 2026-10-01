package Admin;

import System.Patient;

private class Admin {
    public void view(Patient p) {
        System.out.println("ADMIN sees: " + p.getName() + " | Balance: " + p.getBalance(this));
    }
}