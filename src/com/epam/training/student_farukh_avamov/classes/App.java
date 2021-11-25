package com.epam.training.student_farukh_avamov.classes;
import java.lang.String;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Saint Marie");

        hospital.addPatientToPatientList(new Patient("Овечкин", "Андрей", "Игоревич", "Ленина 55","8 777 555 55 55",
                    3, "грипп"));
        hospital.addPatientToPatientList(new Patient("Кузнецов", "Игорь", "Григорьевич", "Карла Маркса 23","8 701 232 43 34",
                4, "ангина"));
        hospital.addPatientToPatientList(new Patient("Куплинов", "Василий" ,"Красногвардейская 32", "8 777 231 54 23",
                5, "бронхит"));
        hospital.addPatientToPatientList(new Patient("Шанин", "Андрей", "Борисович", "Пушкина 1","8 777 555 55 55",
                6, "диабет"));
        hospital.addPatientToPatientList(new Patient("Порохов", "Юрий", "Игоревич", "Ленина 43", "8 707 111 22 22",
                7, "астма"));
        hospital.addPatientToPatientList(new Patient("Ковалев", "Андрей", "Игоревич", "Ленина 55","8 702 123 12 12",
                8, "диабет"));
        hospital.addPatientToPatientList(new Patient("Митина", "Юлия", "Полтавская 2", "8 777 531 11 23",
                9, "бронхит"));
        hospital.addPatientToPatientList(new Patient("Овечкин", "Андрей", "Игоревич", "Ленина 1","8 777 766 55 44",
                10, "ангина"));
        hospital.addPatientToPatientList(new Patient("Панин", "Андрей", "Олегович", "Павлова 54","8 777 888 88 88",
                11, "грипп"));
        hospital.addPatientToPatientList(new Patient("Беспалов", "Егор", "Алексеевич", "Комсомольская 89","8 777 999 99 99",
                12, "бронхит"));
        hospital.addPatientToPatientList(new Patient("Овечкин", "Андрей", "Игоревич", "Полтавская 11","8 777 100 10 11",
                13, "мигрень"));


        System.out.println("список пациентов, имеющих данный диагноз");
        List<Patient> listByDiagnose = hospital.patientByDiagnose("грипп");
        for (Patient p : listByDiagnose) {
            System.out.println(p);
        }

        System.out.println("список пациентов, номер медицинской карты которых находится в заданном интервале");
        List<Patient> listByMedicalInterval = hospital.medicalCardInterval(5, 8);
        for (Patient p : listByMedicalInterval) {
            System.out.println(p);
        }

    }
}
