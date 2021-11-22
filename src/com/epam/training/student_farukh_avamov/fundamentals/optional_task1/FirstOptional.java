package com.epam.training.student_farukh_avamov.fundamentals.optional_task1;

import java.util.*;

public class FirstOptional {
    public static void main(String[] args) {

        // write your code here
//        1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        findShortLongNum();
//       2.     Вывести числа в порядке возрастания (убывания) значений их длины.
        ascendNumbers();
    }

    public static void findShortLongNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int sizeOfArray = scanner.nextInt();
        System.out.println("Введите числа");
        Integer inputNums = scanner.nextInt();
        ArrayList<Integer> shortLongNumber = new ArrayList<>();

        shortLongNumber.add(inputNums);
        for (int i = 1; i < sizeOfArray; i++) {
            shortLongNumber.add(scanner.nextInt());
        }
        int shortestNum = shortLongNumber.get(1);
        int longestNum = shortLongNumber.get(1);
        for (int s : shortLongNumber) {
            System.out.println(s);
        }

        for (int n : shortLongNumber) {

            if (n > longestNum) {
                longestNum = n;
            }
            if (n < shortestNum) {
                shortestNum = n;
            }
        }
        System.out.println("The longest number: " + longestNum + ". It has " + String.valueOf(Math.abs(longestNum)).length() + " symbols.");
        System.out.println("The shortest number: " + shortestNum + ". It has " + String.valueOf(Math.abs(shortestNum)).length() + " symbols.");
    }

    public static void ascendNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int sizeOfArray = scanner.nextInt();
        System.out.println("Введите числа");
        Integer inputNums = scanner.nextInt();
        ArrayList<Integer> ascendArray = new ArrayList<>();

        ascendArray.add(inputNums);
        for (int i = 1; i < sizeOfArray; i++) {
            ascendArray.add(scanner.nextInt());
        }
        Collections.sort(ascendArray);
        for (int n : ascendArray) {
            System.out.print(n + " ");
        }
    }
}
