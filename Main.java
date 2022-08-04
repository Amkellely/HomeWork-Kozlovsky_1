package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
        //недели, соответствующее данному числу (1 — «понедельник», 2 — «втор-
        //18 М. Э. Абрамян. Электронный задачник Programming Taskbook 4.5
        //ник» и т. д.).
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное число : ");
        int day = in.nextInt();
        if (day == 1) {
            System.out.print("понедельник");
        } else if (day == 2) {
            System.out.print("вторник");
        } else if (day == 3) {
            System.out.print("среда");
        } else if (day == 4) {
            System.out.print("четверг");
        } else if (day == 5) {
            System.out.print("пятница");
        } else if (day == 6) {
            System.out.print("суббота");
        } else if (day == 7) {
            System.out.print("воскресенье");
        } 
        else
            System.out.print("нет дат с таким номером");
        switch (day){
            case 1:
                System.out.print("понедельник");
                break;
            case 2:
                System.out.print("вторник");
                break;
            case 3:
                System.out.print("среда");
                break;
            case 4:
                System.out.print("четверг");
                break;
            case 5:
                System.out.print("пятница");
                break;
            case 6:
                System.out.print("суббота");
                break;
            case 7:
                System.out.print("воскресенье");
                break;
            default:
                System.out.print("нет дня с таким номером"); */
        // Case 2. Дано целое число K. Вывести строку-описание оценки, соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
        // Если K не лежит в диапазоне 1–5,
        //то вывести строку «ошибка»
        /*Scanner in = new Scanner(System.in);
        int k;
        System.out.print("K");
        k= in.nextInt();
        switch (k){
            case 1:
                System.out.print("плохо");
                break;
            case 2:
                System.out.print("неуд.");
                break;
            case 3:
                System.out.print("удовлетворительно");
                break;
            case 4:
                System.out.print("хорошо");
                break;
            case 5:
                System.out.print("отлично");
                break;
            default:
                System.out.print("ошибка");*/
        // Case 3.. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.).
        // Вывести название соответствующего времени года («зима»,
        //«весна», «лето», «осень»).
       /* Scanner in = new Scanner(System.in);
        int mounth ;
        System.out.print("месяц");
        mounth = in.nextInt();
        switch () {
            case 1:
            case 2:
            case 12:
                System.out.print("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("осень");
                break;
            default:
                System.out.print("ошибка");*/
        // Case 4. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
        //февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.
        /*Scanner in = new Scanner(System.in);
        int mounth;
        System.out.print("месяц");
        mounth = in.nextInt();
        switch ( mounth ){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.print("в месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("в месяце 30 дней");
                break;
            case 2:
                System.out.print("в месяце 28 дней");
                break;
            default:
                Scanner in = new Scanner(System.in);
        } */
        // Case 15. Мастям игральных карт присвоены порядковые номера: 1 — пики,
        // 2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки,
        //  присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны
        // два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты
        //(1 ≤ M ≤ 4). Вывести название соответствующей карты вида «шестерка
        // бубен», «дама червей», «туз треф» и т. п.
       /* Scanner in = new Scanner(System.in);
        System.out.print("Введите достоинство карт");*/


        // цикл
        /* for(int i=1; i<=10; i=i+1){
            System.out.print(i+"");*/
        //For3. Даны два целых числа A и B (A < B). Вывести в порядке убывания все
        //целые числа, расположенные между A и B (не включая числа A и B), а
        //также количество N этих чисел.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число А");
        int a= in.nextInt();
        System.out.print("Введите целое число B ");
        int b= in.nextInt();
        int result = 0;
        for(int i=b-1; i> a; i=i-1) {
            System.out.print(i+"");
            result++;
        }
        System.out.print("кол-во"+result);
        }*/

        //For 4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
        //2, . . . , 10 кг конфет.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите цену за 1кг конфет : ");
        int a= in.nextInt();
        for(int b=1;b<11; b=b+1 ){
            System.out.print(b+"кг стоит  ="+a*b);
        }*/
        //For 5. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
        //0.2, . . . , 1 кг конфет
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите стоимость 1кг конфет : ");
        float c=in.nextFloat();
        for(int i=1; i<11; i++){
            double m=(double) i/10;
            System.out.print(m+"кг стоит  ="+c*m);
        }*/
         /*Scanner in = new Scanner(System.in);
        System.out.print("Введите стоимость 1кг конфет : ");
        double price= in.nextDouble();
        for (double weight = 0.1; weight<1.1; weight=weight+0.1){
            System.out.print(weight+"кг стоит  ="+price*weight);
        }*/
//For 6.  Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
//1.4, . . . , 2 кг конфет.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите стоимость 1кг конфет : ");
        double c= in.nextDouble();
        for (double m=1.2; m<2.1; m+=0.1){
            System.out.println(m+"кг стоит : "+c*m);
        }*/

        //For 7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
        //от A до B включительно.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число A : ");
        int a=in.nextInt();
        System.out.println("Введите целое число B : ");
        int b=in.nextInt();
        int sum=0;
        for(int i=a; i<=b; i++) {
            sum += i;
            System.out.println(i + "кг стоит : " + a * b);
        }*/

        //For 8. Даны два целых числа A и B (A < B). Найти произведение всех целых
        //чисел от A до B включительно.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число A : ");
        int a=in.nextInt();
        System.out.println("Введите целое число B : ");
        int b=in.nextInt();
        int proizv=1;
        for(int i=a; i<=b; i++) {
            proizv *=i;
        }
        System.out.println("произведение : " + proizv);*/

        //For 9.  Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых
        //чисел от A до B включительно.
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число A : ");
        int a=in.nextInt();
        System.out.println("Введите целое число B : ");
        int b=in.nextInt();
        int kvadrat=0;
        for(int i=a; i<=b; i++) {
            kvadrat=kvadrat+ i*i;
        }
        System.out.println("сумма квадратов : " + kvadrat); */
        //For 10. Дано целое число N (> 0). Найти сумму
        //1 + 1/2 + 1/3 + . . . + 1/N
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число A : ");
        int n=in.nextInt();
        double sum=0;
        for(int i=1; i<=n; i++){
            sum= sum+1.0/i;
        }
        System.out.println("сумма : " +sum);*/
        //For 11.   Дано целое число N (> 0). Найти сумму
        //N^2 + (N + 1)2 + (N + 2)2 + . . . + (2·N)^2
        //(целое число).
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число A : ");
        int n=in.nextInt();
        int sum=0;
        for(int i=0; i<=n; i++){
            sum=sum+(n+i)*(n+1);
                    }
        System.out.println("сумма : " +sum);*/

        //Series 1. Даны десять вещественных чисел. Найти их сумму
       /* double sum=0.0;
        Scanner in = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            double x= in.nextInt();
            sum = sum + x;
                    }
        System.out.println("Cумма="+sum);*/

        //Самостоятельные задачи
        //Series 2. Даны десять вещественных чисел. Найти их произведение.
        /*double sum=0.0;
        Scanner in = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            double x= in.nextInt();
            sum = sum * x;
        }
        System.out.println("Cумма="+sum);*/

        //Series 3. Даны десять вещественных чисел. Найти их среднее арифметическое.
        /*double sum= 1,r;
        Scanner in = new Scanner(System.in);
        for(int i=1; i<=10; i++){
            double x= in.nextInt();
            sum = (sum+ x)/10;
        }
        System.out.println("Среднее ари"+sum);*/
        //Series 4. Дано целое число N и набор из N вещественных чисел. Вывести
        //сумму и произведение чисел из данного набора.
         /*Scanner in = new Scanner(System.in);
         int r= in.nextInt();
        double sum=0, pro=1,r;
        for ( int i=1; i<=10; ++i) {
            double r= in.nextInt();
            sum +=r;
            pro *=r;
        }
        System.out.println(sum+""+pro);*/

        //Series 5.Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке целые части всех чисел из данного
        //набора (как вещественные числа с нулевой дробной частью), а также
        //сумму всех целых частей.
        /*Scanner in = new Scanner(System.in);
        double r;
        int n, sum = 0;
        System.out.println("N : ");
        n= in.nextInt();
        for ( int i=1; i<=10; ++i) {
            r= in.nextInt();
            sum +=(int) r;
        }*/
        //Series 6. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке дробные части всех чисел из данного набора (как вещественные числа с нулевой целой частью), а также
        //произведение всех дробных частей

         }
}
