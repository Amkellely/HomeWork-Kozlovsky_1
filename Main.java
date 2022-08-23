package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //заполенение случайными числами
    static void fillRandom(int[] mass, int left, int right){
        Random gen= new Random();
        for(int i=0; i< mass.length; i++){
            mass [i] = gen.nextInt(right - left +1) + left;
        }
    }
    static void print(int[] mass){
        for(int i=0; i<= mass.length; i++) {
            System.out.println(mass[i] + "");
        }
        System.out.println();
    }
    static int suma0fArray(int[] mass ){
        int sum = 0;
        for(int i=0; i< mass.length; i++) {
            sum += mass[i];
        }
        return sum;
    }
    static double arifmAvg(int[] arr){
        int sum=0;
        for(int i=0; i< arr.length; i++) {
            sum += arr[i];
        }
        return  (double) sum/ arr.length ;
    }
    static  int countLessK(int[] mass, int k){
        int qty=0;
        for(int i=0; i< mass.length; i++) {
            if(mass[i] < k) qty++;
        }
        return qty;
    }
    static int numElem(int[] mas, int k) {
        int res = -1;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > k) {
                res = i;
                break;
            }
        }
        return res;
    }
    static void printLessRight(int[] mass){
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] < mass[1+1]) {
                System.out.print(mass[i] + " ");
            }
        }
        System.out.println();
    }
    static int countLessRight(int[] mass){
        int qty=0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] < mass[1+1]) {
               qty++;
            }
        }
        return qty;
    }
    public static void main(String[] args) {
    int[] arr= new int[10];
    fillRandom(arr, -10, +10);
    print(arr);
        Scanner in= new Scanner(System.in);
    //Series 1. Дан массив из десяти целых чисел. Найти их сумму.
        //System.out.println("Сумма элементов массива"+suma0fArray(arr));

        //Series 3. Дан массив из десяти целых чисел. Найти их среднее арифметическое.
       // System.out.println(arifmAvg(arr));

        //Series14. Дано целое число K и массив из десяти целых чисел;
        //Вывести количество чисел в массиве, меньших K .
        /* System.out.println("Введите к");
        int k = in.nextInt();
        System.out.println("Кол-во элементов <k" + countLessK(arr, k)); */

        //15.  Дано целое число K и массив из десяти целых чисел. Вывести номер первого числа в наборе, большего К.
        // Если таких чисел нет, то вывести -1.
         /* System.out.println("Введите к");
          int k = in.nextInt();
        System.out.println("Номер первого элемента >k" + numElem(arr, k));*/

        //28. Дано целое число N(>1) и массив из N целых чисел. Вывести те элементы массива
        // которые меньше своего правого соседа
        //  и количество К таких элементов.

                }
           }
