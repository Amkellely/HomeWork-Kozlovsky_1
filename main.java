package OOP1.Java;

public class main{
    public static void main(String[] args){
        Phone phone1 = new Phone(1, "IPhone", 100);
        Phone phone2 = new Phone(2, "Nokia", 200);
        Phone phone3 = new Phone(3, "Sony", 300);

        System.out.println("Введите номер 1-го телефона: ");
        phone1.number= getNum();
        System.out.println("Введите модель 1-го телефона: ");
        phone1.model = getStr();
        System.out.println("Введите вес 1-го телефона: ");
        phone1.weight = getNum();

        System.out.println("Введите номер 1-го телефона: ");
        phone2.number= getNum();
        System.out.println("Введите модель 1-го телефона: ");
        phone2.model = getStr();
        System.out.println("Введите вес 1-го телефона: ");
        phone2.weight = getNum();

        System.out.println("Введите номер 1-го телефона: ");
        phone3.number= getNum();
        System.out.println("Введите модель 1-го телефона: ");
        phone3.model = getStr();
        System.out.println("Введите вес 1-го телефона: ");
        phone3.weight = getNum();


    }
}
