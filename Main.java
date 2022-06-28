package com.company;

public class Main {

    public static void main(String[] args) {
        // Дана сторона квадрата a. Найти его периметр P = 4·a.
        //Ввод или присвоение исходных данных
       /* int a = 8;
        //Вычисление результата
        int P = 4 * a;
        //Выводим на экран результат
        System.out.println(P);
        */
        //Дана сторона квадрата a. Найти его площадь S = a^2
         /*int a=  5;
        int S= a*a ;
        //Выводим на экран результат
        System.out.println(" у квадрата со стороной "+ a +" площадь S );
          */
        // Дан диаметр окружности d. Найти ее длину L = π·d. В качестве
        //значения π использовать 3.14.
         /*int d = 10;
        final double pi=  3.14;
        double L = pi * d;
        System.out.println(" у круга с диаметром "+ d +" длина окружности " + L );
            */
        // Дана длина ребра куба a. Найти объем куба V = a^3
        //и площадь его поверхности S= 6*a^2
  /* int a= 3;
    int V= a*a*a;
    int S= 6*a*a;
        System.out.println(" Площадь поверхности куба:"+S);
                System.out.println("Обьем куба:"+V)';
   */
//Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти
//его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).  }
       /* int a = 2;
        int b = 4;
        int c = 6;
        int V = a * b * c;
        int S = 2 * (a * b + b * c + a * c);
        System.out.println(" Обьем: " + V);
        System.out.println(" площадь поверхности: " + S);
                */
       //Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
         /*int a = 4;
        int b= 6;
        double z= (a+b)/(double) 2;
        System.out.println(" Среднее арифметическое " + z);

          */
        //Begin9◦
 // Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √a·b.
       /* double a= 3.45;
        double b = 7.2;
        double g_avg = Math.sqrt(a*b);
        System.out.println(g_avg);
        */
// Даны два ненулевых числа. Найти сумму, разность, произведение и
//частное их квадратов.
        /* int a= 2;
        int b= 4;
        int S= (a*a)+(b*b);
        int X= (a*a)-(b*b);
        int Y=(a*a)*(b*b);
        double D= (a*a)/(double) (b*b);
        System.out.println("Сумма"+ S);
        System.out.println("Разность"+ X);
        System.out.println("Произведение"+ X);
        System.out.println("Произведение"+ D);

         */
        // Даны два ненулевых числа. Найти сумму, разность, произведение и
        //частное их модулей.
       /* int a=-5;
        int b= 24;
        a= Math.abs(a);
                b=Math.abs(b);
                        double s= a+b ;
        System.out.println("Сумма модулей" +(int) s);
        s= a-b;
        System.out.println("Разность модулей" +(int) s);
        s= a*b;
        System.out.println("Частное модулей" + s);
        s=(double)a/b;
        System.out.println("Произведение" +(int) s);

        */
        //Поменять местами содержимое переменных A и B и вывести новые
        //значения A и B.
        /* int a= 3;
                int b= 10;
                int c= a;
                a=b;
                b=c;
        System.out.println("a="+a +" b="+b);

         */
        //Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
        //c =√a^2 + b^2
        //P= a+b+x
       /*int a= 5;
       int b= 8;
       double c = Math.sqrt((a*a)+(b*b));
       double S= a+b+c;
        System.out.println("Гипотенуза" +c );
        System.out.println("Периметр" +S);
                     */

        //Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2
        //S1 = π·(R1)^2
        // S2 = π·(R2)^2
        //S3 = π·(R3)^2
        int R1= 10;
        int R2= 15;
        final double pi=  3.14;
        double s1= pi *(R1*R1);
        double s2= pi *(R2*R2);
        double s3= pi *(R3*R3);

    }
    }