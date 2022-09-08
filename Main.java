package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void fillMatrix(int[][] arr, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {//arr.length перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {//arr[i].length
                arr[i][j] = gen.nextInt(right - left + 1) + left;
            }
        }
    }

    static void prinyMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
    }

    static void task1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {//arr.length перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {//arr[i].length
                arr[i][j] = 10 * i;
            }
        }
    }

    static void task2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {//arr.length перебирает количество строк в матрице
            for (int j = 0; j < arr[i].length; j++) {//arr[i].length
                arr[i][j] = 5 * i;
            }
        }
    }

    static void showString(int[][] arrayName, int k) {
        if (k < 0 || k >= arrayName.length) {
            System.out.println("Ошибка. Нет такой строки");
        } else {
            for (int i = 0; i < arrayName[k].length; i++) {
                System.out.println(arrayName[k][i] + "");
            }
        }
    }

    static void showRow(int[][] arrayName, int k) {
        if (k < 0 || k >= arrayName[0].length) {
            System.out.println("Ошибка. Нет такого столбца");
        } else {
            for (int i = 0; i < arrayName.length; i++) {
                System.out.println(arrayName[i][k] + "");
            }
        }
    }

    static void printEvenRows(int[][] arrayName) {
        for (int i = 0; i < arrayName.length; i += 2) {
            for (int j = 0; j < arrayName.length; j++) {
                System.out.println(arrayName[i][j] + "");
            }
            System.out.println();
        }
    }

    static int sumOfRow(int[][] arrayName, int k) {
        int sum = 0;
        if (k < 0 || k >= arrayName.length) {
            System.out.println("");
        } else {
            for (int j = 0; j < arrayName[k].length; j++) {
                sum += arrayName[k][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = 4;
        final int m = 5;
        int[][] mas = new int[n][m];
        //int k;
        //k= in.nextInt();
        // fillMatrix(mas, 0, 10);
        // prinyMatrix(mas);

        // Matrix1. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N, у которой все элементы I-й строки имеют
        //значение 10·I (I = 1, . . ., M).
        // task1(mas);
        // prinyMatrix(mas);

        //Matrix2. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера M × N, у которой все элементы J-го столбца
        //имеют значение 5·J (J = 1, . . ., N).
        // task2(mas);
        // prinyMatrix(mas);

        //Matrix7◦ Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Вывести
        //элементы K-й строки данной матрицы.
        // fillMatrix(mas, 0, 10);
        // showString(mas, k);

        //Matrix8. Дана матрица размера M × N и целое число K (1 ≤ K ≤ N). Вывести
        //элементы K-го столбца данной матрицы.
        // fillMatrix(mas, 0, 10);
        // showString(mas, k);

        //Matrix9. Дана матрица размера M × N. Вывести ее элементы, расположенные
        //в строках с четными номерами (2, 4, . . .). Вывод элементов производить
        //по строкам, условный оператор не использовать.
        // fillMatrix(mas, -10, 10);
        // prinyMatrix(mas);
        // System.out.println("Строки с четными номерами");
        // printEvenRows(mas);

        //Matrix17. Дана матрица размера M × N и целое число K (1 ≤ K ≤ M). Найти
        //сумму и произведение элементов K-й строки данной матрицы.
        //fillMatrix(mas, 1, 5);
        // prinyMatrix(mas);
        // do {
        //   System.out.println("Введите номер строки: ");
        //   int k = in.nextInt();
        //     System.out.println();
        //  }while (k < 0 || k > mas.length);

        //Сумма одной строки
        // for(int i = 0; i< mas.length; i++)
        // {
        //   int k = 1;
        //  int sum = 0;
        //   for (int j = 0; j < mas[i].length; j++) {
        //       sum += mas[i][j];

        //    }
        //    System.out.println(sum);

            //Matrix 19. Дана матрица размера M × N. Для каждой строки матрицы найти
            //сумму ее элементов.
        //fillMatrix(mas, 1, 5 );
        // prinyMatrix(mas);
        // for(int i = 0; i < mas.length; i++)
        //{
        //    System.out.println("Сумма " +i + "-ой строки" + sumOfRow(mas,i));
        // }

        //
        }
    }

