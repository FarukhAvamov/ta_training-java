package com.epam.training.student_farukh_avamov.fundamentals.optional_task2;

import java.util.*;

public class SecondOptional {
    public static void main(String[] args) {

//      1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
//        ascendOrder();
        numsInRow();
    }

    public static void ascendOrder() {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Введите размерность матрицы");
        int matrixSize = scanner.nextInt();
        int min = matrixSize - 100;
        int max = matrixSize + 100;
        int[][] matrixArray = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                int randomNum = rd.nextInt(max-min+1) + min;
                matrixArray[i][j] = randomNum;
            }
        }
        Arrays.stream(matrixArray).map(Arrays::toString).forEach(System.out::println);
        System.out.println();

        for (int i = 0; i < matrixArray.length; i++) {
            Arrays.sort(matrixArray[i]);
        }
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                System.out.print(matrixArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void numsInRow() {
        System.out.println("hello");
//        Scanner scanner = new Scanner(System.in);
//        Random rd = new Random();
//        System.out.println("Введите размерность матрицы");
//        int matrixSize = scanner.nextInt();
//        int min = matrixSize - 100;
//        int max = matrixSize + 100;
//        int[][] matrixArray = new int[matrixSize][matrixSize];
//        for (int i = 0; i < matrixSize; i++) {
//            for (int j = 0; j < matrixSize; j++) {
//                int randomNum = rd.nextInt(max-min+1) + min;
//                matrixArray[i][j] = randomNum;
//            }
//        }
//        Arrays.stream(matrixArray).map(Arrays::toString).forEach(System.out::println);
//        System.out.println();
//        ArrayList<Integer> tempList = new ArrayList<>();
//        int[][] matrixSize = {{3, 4, 8, 4}, {7,0,1,12}, {8,1,9,3}, {2, 10,15, 3}};
//        System.out.println(Arrays.toString(matrixSize));
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (matrixSize[i][j] == matrixSize[i][j] + 1) {
//                    System.out.println(matrixSize[i][j]);
//                }
//            }
//        }

    }
}

