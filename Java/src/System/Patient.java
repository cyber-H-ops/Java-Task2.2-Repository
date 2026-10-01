package System;

import Admin.Admin;
import Doctor.Doctor;

public class Patient {
    private String name;
    private String appointment;
    private String diagnosis;
    private double balance;

    public Patient(String name, String appointment, String diagnosis, double balance) {
        this.name = name;
        this.appointment = appointment;
        this.diagnosis = diagnosis;
        this.balance = balance;
    }

        public String getName() {
            return name;
        }

        public String getAppointment() {
            return appointment;
        }
        
        public String getDiagnosis(Doctor d) {
            return diagnosis;
        }

        public double getBalance(Admin a) {
            return balance;
        }
}
