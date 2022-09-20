package OOP1.Java;


import java.util.Scanner;

public class Phone{
    int number;
    String model;
    int weight;

    Phone(int number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Phone{" + "number=" + number + ", model='" + model + '\'' + ", weight=" + weight + '}';
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }
    public void getNumber() {
        System.out.println(number);
    }
    public Phone(int a, String b) {
        number = a;
        model = b;
        Phone phone = new Phone(number, "model" , weight);
    }
    public Phone() {
    }
    static int getNum() {
        Scanner num = new Scanner(System.in);
        return num.nextInt();

    }
    static String getStr() {
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }
}
