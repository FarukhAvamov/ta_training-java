package com.epam.training.student_farukh_avamov.classes;
import com.epam.training.student_farukh_avamov.classes.Patient;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String hospitalName;
    private ArrayList<Patient> patientArrayList = new ArrayList<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addPatientToPatientList (Patient patient) {
        patientArrayList.add(patient);
    }
    public ArrayList<Patient> patientByDiagnose(String diagnose){
        ArrayList<Patient> patientList = new ArrayList<>();
        for (Patient p : patientArrayList){
            if (p.getDiagnose() == diagnose){
                patientList.add(p);
            }
        }
        return patientList;
    }
    public ArrayList<Patient> medicalCardInterval(int min, int max) {
        ArrayList<Patient> patientList = new ArrayList<>();
        for (Patient p : patientArrayList){
            if (p.getMedicalCard() >= min && p.getMedicalCard() <= max){
                patientList.add(p);
            }
        }
        return patientList;
    }
}


