package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Козловский Константин
	//Begin13◦ Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2:
        // S1 = π·(R1)^2,  S2 = π·(R2)^2
        // S3 = S1 − S2.
        //В качестве значения π использовать 3.14.
         /* Scanner in = new Scanner(System.in);

        System.out.print("r1=");
        double r1 = in.nextDouble();
        System.out.print("r2=");
        double r2 = in.nextDouble();

        double s1 = 3.14 * Math.pow(r1, 2);
        System.out.println("s1=" + s1);
        double s2 = 3.14 * Math.pow(r2, 2);
        System.out.println("s2=" + s2);
        double s3 = s1 - s2;
        System.out.println("s3=" + s3);
        */
        //Begin16. Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2 − x1|.
        /*Scanner in=new Scanner (System.in);
        double x1=in.nextDouble();
        double x2=in.nextDouble();
        double D=Math.abs(x1-x2);
        System.out.println("D = "+D);
          */
        //Begin19. Даны координаты двух противоположных вершин прямоугольника: (x1,y1),  (x2,y2). Стороны прямоугольника параллельны осям координат. Найти периметр и площадь данного прямоугольника.
       /* Scanner in=new Scanner (System.in);
       System.out.println("x1,y1");
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        System.out.println("x2,y2");
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        System.out.println("P = "+2*(y2-y1+x2-x1));
        System.out.println("S = "+(y2-y1)*(x2-x1));
         */
//Begin20◦ Найти расстояние между двумя точками с заданными координатами
//(x1, y1) и (x2, y2) на плоскости. Расстояние вычисляется по формуле
        //q(x2 − x1)^2+ (y2 − y1)^2
        /*Scanner in=new Scanner (System.in);
        System.out.println("x1,y1");
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        System.out.println("x2,y2");
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        System.out.println("D = "+Math.sqrt(Math.pow((y2-y1),2)*Math.pow((x2-x1),2)));
         */
            //Begin21.Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).
        //Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости (см. задание Begin20). Для нахождения
        //площади треугольника со сторонами a, b, c использовать формулу Герона:
        //S =√p·(p − a)·(p − b)·(p − c),
        //где p = (a + b + c)/2 — полупериметр.
        Scanner in=new Scanner (System.in);
        System.out.println("x1,y1");
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        System.out.println("x2,y2");
        double x2=in.nextDouble();
        double y2=in.nextDouble();
        System.out.println("x3,y3");
        double x3=in.nextDouble();
        double y3=in.nextDouble();
        double a=Math.sqrt(Math.pow(x2-x1,2)+Math.pow((y2-y1),2));
        double b=Math.sqrt(Math.pow(x3-x2,2)+Math.pow((y3-y2),2));
        double c=Math.sqrt(Math.pow(x3-x1,2)+Math.pow((y3-y1),2));
        double p=(a+b+c)/2;
        double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("S = "+S);
        System.out.println("P = "+p*2);
    }
}
