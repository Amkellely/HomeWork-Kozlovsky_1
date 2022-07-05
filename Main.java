package com.company;

import java.util.Scanner;

/* Козловский Константин

 */
public class Main {

    public static void main(String[] args) {
        // Boolean 1. Дано целое число A. Проверить истинность высказывания:
        // «Число A является положительным».
        /*Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        boolean res= a>0;
        System.out.println(res);
                 */
        // Boolean 2.  Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int a1 = a % 2;
        boolean res = a1 != 0;
        System.out.println(res);
                 */

        // Boolean 3. Дано целое число A. Проверить истинность высказывания: «Число A является четным».
        /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int a1 = a % 2;
        boolean res = a1 ==0;
        System.out.println(res);
                 */
// Boolean 4. Даны два целых числа: A, B. Проверить истинность высказывания:
//«Справедливы неравенства A > 2 и B ≤ 3».
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите число А= ");
        int a = in.nextInt();
        System.out.println("Введите число B= ");
         int b= in.nextInt();
         boolean res =a> 2 & b<=3;
        System.out.println(res);
           */
        //Boolean5◦. Даны два целых числа: A, B. Проверить истинность высказывания:
        //«Справедливы неравенства A ≥ 0 или B < −2».
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите число А= ");
        int a = in.nextInt();
        System.out.println("Введите число B= ");
        int b= in.nextInt();
        boolean res =a>= 0 & b< -2;
        System.out.println(res);
         */
//Boolean6◦Даны три целых числа: A, B, C. Проверить истинность высказывания:
// «Справедливо двойное неравенство A < B < C».
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите число А= ");
        int a = in.nextInt();
        System.out.println("Введите число B= ");
        int b= in.nextInt();
        System.out.println("Введите число C= ");
        int c= in.nextInt();
        boolean res = a< b & b<c ;
        System.out.println(res);
        */

//Boolean 7. Даны три целых числа: A, B, C.
// / Проверить истинность высказывания: «Число B находится между числами A и C».
         /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число А= ");
        int a = in.nextInt();
        System.out.println("Введите число B= ");
        int b= in.nextInt();
        System.out.println("Введите число C= ");
        int c= in.nextInt();
        boolean res = a<b & b<c | a>b & b>c;
        System.out.println(res);
          */
//Boolean8 Даны два целых числа: A, B. Проверить истинность высказывания:
//«Каждое из чисел A и B нечетное».
       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        boolean res = a%2!=0 & b%2!=0;
        System.out.println(res);
        */
        //Boolean9◦. Даны два целых числа: A, B. Проверить истинность высказывания:
//«Хотя бы одно из чисел A и B нечетное».
         /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        boolean res = a%2!=0 || b%2!=0;
        System.out.println(res);
          */
        //Boolean 10. Даны два целых числа: A, B.
        // Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        boolean res = (a% 2!=0 && b%2 ==0) || (a% 2==0 && b%2 !=0);
        System.out.println(res);
                */
//Boolean 11. Даны два целых числа: A, B.
// Проверить истинность высказывания: «Числа A и B имеют одинаковую четность»
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
    boolean res = (a% 2!=0 && b%2 !=0) || (a% 2==0 && b%2 ==0);
        System.out.println(res);
                 */
        //Boolean 12. Даны три целых числа: A, B, C.
        // Проверить истинность высказывания: «Каждое из чисел A, B, C положительное».
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число А= ");
        int a = in.nextInt();
        System.out.println("Введите число B= ");
        int b= in.nextInt();
        System.out.println("Введите число C= ");
        int c= in.nextInt();
        boolean res = a>0 && b>0 && c>0;
        System.out.println(res);
                 */
        //Boolean 13.Даны три целых числа: A, B, C.
        // Проверить истинность высказывания: «Хотя бы одно из чисел A, B, C положительное».
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число А= ");
        int a = in.nextInt();
        System.out.println("Введите число B= ");
        int b= in.nextInt();
        System.out.println("Введите число C= ");
        int c= in.nextInt();
        boolean res = a>0 || b>0 || c>0;
        System.out.println(res);
                 */
        //Boolean 14. Даны три целых числа: A, B, C. Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число А= ");
        int a = in.nextInt();
        System.out.println("Введите число B= ");
        int b= in.nextInt();
        System.out.println("Введите число C= ");
        int c= in.nextInt();
        boolean res = a>0&& b<0&& c<0& || a<0&& b>0&& c<0|| a<0&& b<0&& c>0;
        System.out.println(res);
                 */
        //Boolean 18◦ Проверить истинность высказывания: «Среди трех данных целых
        //чисел есть хотя бы одна пара совпадающих».
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите число B= ");
        int b= in.nextInt();
        System.out.println("Введите число C= ");
        int c= in.nextInt();
        boolean res = (a==b) ||(b==c)|| (a==c);
        System.out.println(res);
                 */
        //Boolean 19.  Дано трехзначное число. Проверить истинность высказывания:
        //«Все цифры данного числа различны».
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sotni= a/100;
        int des = (a/10)%10;
        int ed= a% 10;
        boolean res=(sotni != des) && (des !=ed) && (sotni !=ed);
        System.out.println(res);
    }
    }
