package Lesson2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //. Дано расстояние L в сантиметрах. Используя операцию деления
        //нацело, найти количество полных метров в нем (1 метр = 100 см).
       /* Scanner in=new Scanner(System.in);
        System.out.println("Введите целое число- кол-во сантиметров");
        int L=in.nextInt();
        System.out.println(L/100+"метра");
            */
//Дана масса M в килограммах. Используя операцию деления нацело,
//найти количество полных тонн в ней (1 тонна = 1000 кг).
       /* Scanner in=new Scanner(System.in);
        System.out.println("Введите целое число в килограммах");
        int L=in.nextInt();
        System.out.println(L/1000+"кг");
          */
        // Дан размер файла в байтах. Используя операцию деления нацело,
        //найти количество полных килобайтов, которые занимает данный файл
        //(1 килобайт = 1024 байта).
        /*Scanner in= new Scanner(System.in);
        System.out.println("Введите число байтов");
        int bytes = in.nextInt();
        System.out.println(bytes/1024+"килобайтов");
         */
        //Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы). Для нахождения десятков
        //использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.
       /* Scanner in= new Scanner(System.in);
        System.out.print("Введите двухзначное число");
        int number = in.nextInt();
        System.out.println("Десятки"+number /10);
        System.out.println("Единицы"+number % 10);
         */
        //Дано двузначное число. Найти сумму и произведение его цифр
       /* Scanner in= new Scanner(System.in);
        System.out.println("Введите двузначное число ");
        int M = in.nextInt();
        int a= M/10;
        int b= M % 10;
        System.out.println((a+b)+ "Сумма");
        System.out.println((a*b)+ "Произведение число");
         */
        // Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа.
       /* Scanner in= new Scanner(System.in);
        int M = in.nextInt();
        int number_a= M/10;
        int number_b= M % 10;
        int x= number_b *10+  number_a;
        System.out.println(x+ "Новое число");
        */
        //Дано трехзначное число. Используя одну операцию деления нацело,
        //вывести первую цифру данного числа (сотни).
        /* Scanner in= new Scanner(System.in);
        System.out.println("Введите трехзначное число ");
        int number = in.nextInt();
        System.out.println(" Сотни "+ number / 100);
       */
        //Дано трехзначное число. Вывести вначале его последнюю цифру
        //(единицы), а затем — его среднюю цифру (десятки).
       /* Scanner in= new Scanner(System.in);
        System.out.println("Введите трехзначное число ");
        int number = in.nextInt();
        System.out.println(" Единицы "+ number % 10);
        int numbers = (number /10) %10;
        System.out.println(" Десятки "+ numbers);
                */

        //Дано трехзначное число. Найти сумму и произведение его цифр.
        /*Scanner in= new Scanner(System.in);
        System.out.println("Введите трехзначное число ");
        int number = in.nextInt();
        int number_edinici= number%10;
        int number_des=(number /10)% 10;
        int number_sotni=number /100;
        System.out.println(" Сумма " +(number_edinici+number_des+number_sotni));
        System.out.println(" Произведение " +(number_edinici*number_des*number_sotni));
        */
        //Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
       /* Scanner in= new Scanner(System.in);
        System.out.println("Введите трехзначное число ");
        int number = in.nextInt();
        int number_edinici= number%10;
        int number_des=(number /10)% 10;
        int number_sotni=number /100;
        int res=100*number_edinici + 10*number_des+number_sotni ;
        System.out.println(" В обратном порядке  " +res);
                */
        //Дано трехзначное число. В нем зачеркнули первую слева цифру и
        //приписали ее справа. Вывести полученное число.
        Scanner in= new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = in.nextInt();
        int number_sotni=number /100;
        int ostatok= number % 100;
        int res= ostatok*10+ number_sotni;
        System.out.println(" Убрали сотник, приписали сотни слева  " +res);
     }
}
