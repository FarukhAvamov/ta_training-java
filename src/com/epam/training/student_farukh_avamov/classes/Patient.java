package com.epam.training.student_farukh_avamov.classes;

import java.util.Objects;

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

    private Patient(String surname, String name, String middleName, String direction, String phoneNumber, int medicalCard, String diagnose) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return id == patient.id && Objects.equals(surname, patient.surname) && Objects.equals(name, patient.name) && Objects.equals(middleName, patient.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, middleName);
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

    public static class Builder {
        private String surname;
        private String name;
        private String middleName;
        private String direction;
        private String phoneNumber;
        private int medicalCard;
        private String diagnose;

        public Builder(String diagnose) {
            this.diagnose = diagnose;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = direction;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setMedicalCard(int medicalCard) {
            this.medicalCard = medicalCard;
            return this;
        }

        public Builder setDiagnose(String diagnose) {
            this.diagnose = diagnose;
            return this;
        }

        public Patient build() {
            return new Patient(surname, name, middleName, direction, phoneNumber, medicalCard, diagnose);
        }
    }
}
