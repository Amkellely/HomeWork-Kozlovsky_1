package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // If1. Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; в противном случае не изменять его. Вывести полученное число.
       /* Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        if(a>0) {
            a= a+1;
            //a++;
            //++a;
        }
        System.out.printf(a);
         */
        // If2.  Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; в противном случае вычесть из него 2. Вывести полученное число.
       /* Scanner in= new Scanner(System.in);
        System.out.println("Дано число");
        int a= in.nextInt();
        if(a>0) {
             a++;
        }
            else {
                a = a-2;
        }
            System.out.println("a");
             */
        // If 3. Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
        //заменить его на 10. Вывести полученное число.
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a > 0) {
            a++;
        }
         else {
if (a<0){
    a-=2;
    }
else {
    a=10;
      */

        // If 4. Даны три целых числа. Найти количество положительных чисел в исходном наборе.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = in.nextInt();
        System.out.println("Введите число ");
        int b = in.nextInt();
        System.out.println("Введите число  ");
        int c = in.nextInt();
        int N=0;
        if (a > 0) {
            N++;
        }
            if (b > 0) {
                N++;
            }
                if (c > 0) {
                    N++;
                    System.out.println("Количество положительных числе в исходном наборе "+N);
                }
                         */
        // If 5. Даны три целых числа. Найти количество положительных и количество
        //отрицательных чисел в исходном наборе.
         /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = in.nextInt();
        System.out.println("Введите число ");
        int b = in.nextInt();
        System.out.println("Введите число  ");
        int res1=0;
        int res2=0;
        int c = in.nextInt();
        if (a > 0) res1++;
            if(a<0)  res2++;
        if (b > 0) res1++;
        if(b<0)  res2++;
        if (c > 0) res1++;
        if(c<0)  res2++;
        System.out.println("Количество положительных числе в исходном наборе "+res1);
        System.out.println("Количество отрицательных числе в исходном наборе "+res2);
         */
        // If 6. Даны два числа. Вывести большее из них.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = in.nextInt();
        System.out.println("Введите число ");
        int b = in.nextInt();
        if (a>b) System.out.println(a);
        else System.out.println(b);
          */
        // If 7.  Даны два числа. Вывести порядковый номер меньшего из них
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int a1 = in.nextInt();
        System.out.println("Введите число ");
        int a2 = in.nextInt();
        if (a1>a2) System.out.println(2);
        else System.out.println(1);
            */
        // If 8.Даны два числа. Вывести вначале большее, а затем меньшее из них.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите число a1 ");
        int a1 = in.nextInt();
        System.out.println("Введите число a2 ");
        int a2 = in.nextInt();
        if (a1>a2)  System.out.println(a1+""+a2);
        else System.out.println(a2+""+a1);
           */
        // If 9. Даны две переменные вещественного типа: A, B.
        // Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений,
        //а в B — большее. Вывести новые значения переменных A и B.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число a ");
        int a = in.nextInt();
        System.out.println("Введите число b ");
        int b = in.nextInt();
        if (a>b){
            a=a+b;
            b=a-b;
            a=a-b;
             }
        System.out.println(a+" "+b);
         */
        // If 11. Даны две переменные целого типа: A и B. Если их значения не равны, то
        //присвоить каждой переменной большее из этих значений, а если равны,
        //то присвоить переменным нулевые значения. Вывести новые значения
        //переменных A и B.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число a ");
        int a = in.nextInt();
        System.out.println("Введите число b ");
        int b = in.nextInt();
        if (a!= b){
            if(a>b){
                            }
        }
        else{
            a=b;
        }
        else{
            a=0;
            b=0;*/
        // If 12. Даны три числа. Найти наименьшее из них
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число a ");
        int a = in.nextInt();
        System.out.println("Введите число b ");
        int b = in.nextInt();
        System.out.println("Введите число c ");
        int c= in.nextInt();
        int res=0;
        if (a<b && a<c)
            res= a;
            else if(b<a && b<c );
                res= b;
                else if(c<a && c<b);
                res=c;*/

        // If 15.Даны три числа. Найти сумму двух наибольших из них.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число a ");
        int a = in.nextInt();
        System.out.println("Введите число b ");
        int b = in.nextInt();
        System.out.println("Введите число c ");
        int c= in.nextInt();
        int res=0;
        if (a<b && a<c)
            res= b+c;
        else if(b<a && b<c );
        res= a+b;
                else if(c<a && c<b);
        res=a+c;*/
        // If 18. Даны три целых числа, одно из которых отлично от двух других, равных между собой.
        // Определить порядковый номер числа, отличного от остальных.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a ");
        int a = in.nextInt();
        System.out.println("Введите число b ");
        int b = in.nextInt();
        System.out.println("Введите число c ");
        int c= in.nextInt();
        int res=0;
        if (a==b) res=3;
        else if(a == c) res=2;
        else if(b==c) res=1;
        System.out.println(res);
        }
                            }
