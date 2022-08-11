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

        // Задача 1. Составьте программу, выводящую на экран квадраты чисел от 10 до 20.
        /*Scanner in = new Scanner(System.in);
        int i;
        for (int i = 10; i <= 20; i++) {
            System.out.println(i * i + "");
        }*/
        // Задача 2. Составьте программу, которая вычисляет сумму чисел от 1 до n.значение n вводится с клавиатуры.
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i <= 10; i++) {
            System.out.println(i+i+"");
        }*/
        //Задача 3. Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum= 1;
        for (int i = n; i <= 10; i++) {
            sum **;
            System.out.println("");
        }*/
        //Задача 7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.
        /*Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            if (num1 > num2) {
                System.out.println("" + num1);
            } else if (num2 > num1) ;
            System.out.println("" + num2) {
                    else System.out.println("Числа равны");
            }*/
        //Задача 8. Даны натуральные числа от 20 до 50.Напечатать те из них, которые делятся на 3, но не делятся на 5.
        /*Scanner in = new Scanner(System.in);
        for (int i = 20; i <= 50; i++) {
            if(i % 3==0 && i% 5 !=0) System.out.println(i);
                }*/
        //Задача 9. Даны натуральные числа от 35 до 87. Найти и напечатать те из них, которые при делении на 7 дают остаток 1, 2 или 5.
        /*Scanner in = new Scanner(System.in);
        for (int i = 35; i <= 87; i++) {
            if(i % 7==1 || i % 7==2|| i % 7==5) System.out.println(i);
        }*/

        //Задача 16. В бригаде, работающей на уборке сена, имеется N сенокосилок.
        // Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше, чем предыдущая.
        // Сколько часов проработала вся бригада?
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите количество косилок");
        int n= in.nextInt();
        System.out.println("Введите количество часов работы 1 косилки");
        int m= in.nextInt();
        int sum=0;
        int workTimeInMin = m*60;
        for( int i=1; i<= n; i++);
        sum += workTimeInMin;
        workTimeInMin +=10;
        System.out.println("Время работы бригады " +sum/60 + " часов и " +sum % 60+ "минут");*/
        //Задача 17.  В ЭВМ вводятся по очереди данные о росте N учащихся класса. Определить средний рост учащихся класса.
        /* Scanner in = new Scanner(System.in);
         */
        //Задача 18.  Задано натуральное число N. Найти количество натуральных чисел, не превосходящих N и не делящихся ни на одно из чисел 2,3,5.
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число N");
        int n= in.nextInt();
        int sum=0;
        for( i=n; i<=n; i++) {
            if(i%2!=2 && i%3!=0 && i%5!=0 ) sum= sum+1;
        }
        System.out.println("Количество чисел = " +sum);*/
        //Задача 19. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа.
     /* for(int x=10; x<=99; x++) {
         for(int y=10; y<=99; y++){
             int num= 100*x+y;
             if(num % (x*y)==0);
             System.out.println(num);
                 }
             } */
        //Задача 21 . Дано натуральное n. вычислить 1/(2^2) + 1/(4^2)+1/(6^2) ... + 1/(n^2)
        /*Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        double sum=0;
        for(int i=2;i<=n; i+=2 ) {
            sum += 1.0 / (i * i);
            }
        System.out.println(sum);*/
        //Задача 28. Бизнесмен взял ссуду m тысяч рублей в банке под 20% годовых. через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.
          /*Scanner in = new Scanner(System.in);
        System.out.println("Введите начальную сумму ссуды");
        int nach_summa= in.nextInt();
        int proc=20;
        System.out.println("Введите сумму гарантий");
        int s=in.nextInt();
        double dolg = nach_summa;
        int k=0;
        while (dolg <= s){
            dolg = dolg * (1+ proc / 100.0);
            k++;
            }
        System.out.println("Через " + k + " лет ");*/
        //Задача 29. Начальная дистанция 1 км. Каждую неделю дистанция растет на 10%.
        //Через сколько недель дистанция превысит 10 км.
       /* double dist= 1.0;
        int k=0;
        while(dist <=10.0001){
        dist *=1.1;
        k++;
            }
        System.out.println(k);*/
// Повторять ввод, пока пользователь не введет число от 0 до 10.
         /*Scanner in = new Scanner(System.in);
        int i;
        do{
            System.out.println(" Введите целое число ");
            i= in.nextInt();
        }while(i < 0 || i>10);*/
        // Массив
        /*final int size = 10;
        int mas[] = new int[size];
        int mas1[] = {0,1,2,3,4,5,6,7,8,9};
        //заполнить массив случайными даными
        for(int i = 0 ; i < mas.length ; i++ ){
            mas[i] = (int)(Math.random()* 11) -5;
            }
        //вывод масства в строку
        for(int i = 0 ; i < mas.length ; i++ ){
            System.out.print(mas[i] + " ");
            }
        System.out.println();
        }*/
        // Array 1. Дано целое число N (> 0). Сформировать и вывести целочисленный
        //массив размера N, содержащий N первых положительных нечетных чисел:
        // 1, 3, 5, . . . .
         /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println(" Введите размер массива ");
            size = in.nextInt();
        }
        while(size < 1);
        int[] arr = new int [size];
        int j=1;
        for(int i= 0; i < arr.length; i++){
         arr[i]= j;
         j+= 2;
        }
        for(int i= 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();*/
        // Array 2. Дано целое число N (> 0). Сформировать и вывести целочисленный
        //массив размера N, содержащий степени двойки от первой до N-й: 2, 4,
        //8, 16, . . . .
        /* Scanner in = new Scanner(System.in);
        System.out.println(" Введите размер массива : ");
        int size;
        int j=1;
       int [] array = new int[size];
       for (int i = 0; i<array.length; i++, j*=2){
           array[i]=j;
       }
        for(int i= 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }*/
        // Array 3. . Дано целое число N (> 1), а также первый член A и разность D арифметической прогрессии.
        // Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии:
        //A+0*D, A + 1*D, A + 2·D, A + 3·D, . . . .
        /*Scanner in = new Scanner(System.in);
        System.out.println(" Введите размер массива : ");
        int size=in.nextInt();
        int [] arifm = new int[size];
        int a= in.nextInt();
        int d= in.nextInt();
        arifm[0]=a;
        for(int i=1; i<arifm.length; i++){
            arifm[i] = a+ i*d;
        }
        //for(int i=0; i<arifm.length; i++){
        //            arifm[i] = a+ i*d;
        //}
        for(int i=0; i< arifm.length; i++) {
            System.out.println(arifm[i] + "");
        }
        System.out.println();*/
        // Array 7. Массив размера N заполнить случайными целыми числами.
        // Вывести его элементы в прямом и  обратном порядке на разных строках.
       /* Scanner in = new Scanner(System.in);
        System.out.println(" Введите размер массива : ");
        int size=in.nextInt();
        int [] arifm = new int[size];
        int a= (int)(Math.random()* 10);
        for(int i=1; i<arifm.length; i++) {
            arifm[i] = a;}
        System.out.println();
            for (int i = 0; i < arifm.length-1; i>=0 ; i--) {
                System.out.println(arifm[i] + "");
            }*/
        // Array 8. .  Массив размера N заполнить случайными целыми числами.
        //Вывести все содержащиеся в
        //данном массиве нечетные числа в порядке возрастания их индексов, а
        //также их количество K
        /*Scanner in = new Scanner(System.in);
        System.out.println(" Введите размер массива : ");
        int size = in.nextInt();
        int[] arifm = new int[size];

        for (int i = 0; i < arifm.length; i++) {
            int a = (int) (Math.random() * 10);
            arifm[i] = a;
            System.out.print(arifm[i] + "");
              }
        int kolvo = 0;
        for (int i = 0; i < arifm.length; i++) {
            if( arifm[i] %2!=0){
                System.out.println(arifm[i] + " нечетные ");
                kolvo++;
                           }
            }
        System.out.println( " Количество нечетных чисел " +kolvo);*/
        // Array 9. Дан целочисленный массив размера N. Вывести все содержащиеся в
        // данном массиве четные числа в порядке убывания их индексов, а также
        //их количество K.
         /*Scanner in = new Scanner(System.in);
        System.out.println(" Введите размер массива : ");
        int size = in.nextInt();
        int[] arifm = new int[size];*/

        }
    }