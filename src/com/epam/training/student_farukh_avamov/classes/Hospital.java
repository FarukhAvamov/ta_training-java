package com.epam.training.student_farukh_avamov.classes;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Hospital {

    private CharSequence hospitalName;
    private Set<Patient> patients = new HashSet<>();

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    public Collection<Patient> patientByDiagnose(String diagnose) {
        return patients.stream().filter(patient -> patient.getDiagnose().equals(diagnose)).collect(Collectors.toSet());
    }

    public Collection<Patient> medicalCardInterval(int min, int max) {
        return patients.stream().filter(patient -> patient.getMedicalCard() >= min && patient.getMedicalCard() <= max)
                .collect(Collectors.toSet());
    }
}


