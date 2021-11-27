package com.epam.training.student_farukh_avamov.classes;

import java.lang.String;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Saint Marie");

        hospital.addPatient(
                new Patient.Builder("грипп").setSurname("Овечкин").setName("Андрей").setMiddleName("Игоревич")
                        .setDirection("Ленина 55").setPhoneNumber("8 777 555 55 55").setMedicalCard(3).build()
        );
        hospital.addPatient(new Patient.Builder("ангина")
                .setSurname("Кузнецов").setName("Игорь").setMiddleName("Григорьевич")
                .setDirection("Карла Маркса 23").setPhoneNumber("8 701 232 43 34").setMedicalCard(
                        4).build());
        hospital.addPatient(new Patient.Builder("бронхит")
                .setSurname("Куплинов").setName("Василий").setMiddleName("Красногвардейская 32")
                .setPhoneNumber("8 777 231 54 23").setMedicalCard(
                        5).build());
        hospital.addPatient(new Patient.Builder("диабет")
                .setSurname("Шанин").setName("Андрей").setMiddleName("Борисович")
                .setDirection("Пушкина 1").setPhoneNumber("8 777 555 55 55").setMedicalCard(
                        6).build());
        hospital.addPatient(new Patient.Builder("астма")
                .setSurname("Порохов").setName("Юрий").setMiddleName("Игоревич")
                .setDirection("Ленина 43").setPhoneNumber("8 707 111 22 22").setMedicalCard(
                        7).build());
        hospital.addPatient(new Patient.Builder("диабет")
                .setSurname("Ковалев").setName("Андрей").setMiddleName("Игоревич")
                .setDirection("Ленина 55").setPhoneNumber("8 702 123 12 12").setMedicalCard(
                        8).build());
        hospital.addPatient(new Patient.Builder("бронхит")
                .setSurname("Митина").setName("Юлия").setDirection("Полтавская 2")
                .setPhoneNumber("8 777 531 11 23").setMedicalCard(
                        9).build());
        hospital.addPatient(new Patient.Builder("ангина")
                .setSurname("Овечкин").setName("Андрей").setMiddleName("Игоревич")
                .setDirection("Ленина 1").setPhoneNumber("8 777 766 55 44").setMedicalCard(
                        10).build());
        hospital.addPatient(new Patient.Builder("грипп")
                .setSurname("Панин").setName("Андрей").setMiddleName("Олегович")
                .setDirection("Павлова 54").setPhoneNumber("8 777 888 88 88").setMedicalCard(
                        11).build());
        hospital.addPatient(new Patient.Builder("бронхит")
                .setSurname("Беспалов").setName("Егор").setMiddleName("Алексеевич")
                .setDirection("Комсомольская 89").setPhoneNumber("8 777 999 99 99").setMedicalCard(
                        12).build());
        hospital.addPatient(new Patient.Builder("мигрень")
                .setSurname("Овечкин").setName("Андрей").setMiddleName("Игоревич")
                .setDirection("Полтавская 11").setPhoneNumber("8 777 100 10 11").setMedicalCard(
                        13).build());


        System.out.println("список пациентов, имеющих данный диагноз");
        for (Patient p : hospital.patientByDiagnose("бронхит")) {
            System.out.println(p);
        }

        System.out.println("список пациентов, номер медицинской карты которых находится в заданном интервале");
        for (Patient p : hospital.medicalCardInterval(5, 8)) {
            System.out.println(p);
        }
    }
}
