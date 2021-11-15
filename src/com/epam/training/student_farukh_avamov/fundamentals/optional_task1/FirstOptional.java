package com.epam.training.student_farukh_avamov.fundamentals.optional_task1;

import java.util.Arrays;

public class FirstOptional {
    public static void main(String[] args) {
        // write your code here

//        int maxLengthNum = Integer.valueOf(args[0]);
//        int minLengthNum = Integer.valueOf(args[0]);
//        for (String s : args) {
//            if (Integer.valueOf(s) > maxLengthNum) {
//                maxLengthNum = Integer.valueOf(s);
//            }
//            if (Integer.valueOf(s) < minLengthNum) {
//                maxLengthNum = Integer.valueOf(s);
//            }
//        }
//        System.out.println("The longest number: " + maxLengthNum + ". It has " + String.valueOf(Math.abs(maxLengthNum)).length() + " symbols.");
//        System.out.println("The shortest number: " + minLengthNum + ". It has " + String.valueOf(Math.abs(minLengthNum)).length() + " symbols.");
        int[] newArray = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            newArray[i] = Integer.valueOf(args[i]);
        }
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));


    }
}
