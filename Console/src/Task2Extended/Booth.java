package Task2Extended;

import java.util.Scanner;

public class Booth {
    private Patient patient;

    private static Scanner input = new Scanner(System.in);


    public Booth(Patient patient) {
        this.patient = patient;
    }


    public String getName() {
        return this.patient.getName();
    }


    public String[] getPatientDetailList() {
        return this.patient.getPatientDetailList();
    }


}

