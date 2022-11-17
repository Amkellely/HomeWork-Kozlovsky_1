package com.company;

import java.util.*;

public class Main {
    // Работа с HashSet
    public static void sortProducts(List<Product> products, int choice, boolean revers){
        switch (choice){
            case 1:
                Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo (o2.getName());
                Collections.sort(products, compByName);
                System.out.println(products);
                break;
            case 2:
                Comparator<Product> compByPrice = (o1, o2) -> ((Double)(o1.getPrice())).compareTo (o2.getPrice());
                if(!revers){
                Collections.sort(products, compByPrice);
                System.out.println(products);
                break;
        }
    }
    public static void main(String[] args) {
        //ADD
       /* Set<String> set = new HashSet<>();
        set.add("Яблоко");
        set.add("Мама");
        set.add("мыла");
        set.add("раму");
        set.add("мыла");
        for(String s: set){
            System.out.println(s);
        }
        //REMOVE
        set.remove("мыла");
        System.out.println("После удаления \"мыла\"");
        for(String s: set) {
            System.out.println(s);
        }
        //contains
        System.out.println(set.contains("Я"));
        //size
        System.out.println("Размер множества - " + set.size());
        //clear
        set.clear();
        //isEmpty
        System.out.println(set.isEmpty());*/

        //Работа с TreeSet
        /*Set<HeavyBox> heavyBoxSet = new TreeSet<>();
        Random gen = new Random();
        for(int i = 1; i <= 10; i++){
            heavyBoxSet.add(new HeavyBox(gen.nextInt(20)+1));
        }
        for(HeavyBox box:heavyBoxSet) {
            System.out.println(box);
        }*/
        //Сортировка товаров по разным полям
        Product[] productArray = {
                new Product(" Вилка", 1.25, 5),
        new Product("Ложка", 1.05, 4),
        new Product("Сковородка", 10.99, 3),
        new Product("Кастрюля", 15.25, 1),
        new Product("Нож", 5.43, 2),
        new Product("Сковородка", 5.12, 2),
        new Product("Тарелка", 3.70, 4),
        };
        List<Product> products = Arrays.asList(productArray);
        /*System.out.println("Сортировка по имени");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
               return o1.getName().compareTo (o2.getName());
            }
        });*/
        //По названию
       /* Comparator<Product> compByName = (o1, o2) -> o1.getName().compareTo (o2.getName());
        //По цене
        Comparator<Product> compByPrice = (o1, o2) -> ((Double)(o1.getPrice())).compareTo (o2.getPrice());
        //Сортировка по названию
        Collections.sort(products, compByName);
        System.out.println(products);
        //Сортировка по цене
        Collections.sort(products, compByPrice);
        System.out.println(products);
        //Сортировка по убыванию
        Collections.sort(products, Collections.reverseOrder(compByPrice));
        System.out.println(products);*/


    }
}