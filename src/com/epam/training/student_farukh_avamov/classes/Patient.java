package com.epam.training.student_farukh_avamov.classes;
import com.epam.training.student_farukh_avamov.classes.Hospital;

public class Patient {
    {
        idIncrement++;
    }

    private static int idIncrement = 0;
    private int id = idIncrement;
    private String surname;
    private String name;
    private String middleName;
    private String direction;
    private String phoneNumber;
    private int medicalCard;
    private String diagnose;

    public Patient(String surname, String name, String middleName, String direction, String phoneNumber, int medicalCard, String diagnose) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
        this.medicalCard = medicalCard;
        this.diagnose = diagnose;
    }

    public Patient(String surname, String name, String direction, String phoneNumber, int medicalCard, String diagnose) {
        this.surname = surname;
        this.name = name;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
        this.medicalCard = medicalCard;
        this.diagnose = diagnose;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDirection() {
        return direction;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(int medicalCard) {
        this.medicalCard = medicalCard;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", direction='" + direction + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", medicalCard=" + medicalCard +
                ", diagnose='" + diagnose + '\'' +
                '}';
    }
}
