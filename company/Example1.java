package com.company;

import java.io.*;

public class Example1 {
    public static void writeObject(Object obj, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeObjectEx(FishEx obj, String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            obj.writeExternal(oos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static FishEx readObjectEx(String fileName) {
        FishEx obj = null;
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            obj.writeExternal(oos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }
    /*public static Object readObject ( String fileName){
        Object obj = null;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectOutputStream ois = new ObjectInputStream(fis)
        ) {
            obj = ois.readObject(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }catch(ClassNotFoundException e) {
        e.printStackTrace();
    }
    return obj;*/

    public static void main(String[] args) {
       /* Fish salmon = new Fish("salmon", 1000, 39.99);
        writeObject(salmon, "fish.txt");
        Fish newFish = (Fish) readObject("fish.txt");*/

        FishEx shark = new FishEx("shark", 500,89.00);
        writeObjectEx(shark, "Fishex.txt");
        FishEx newFishEx = new FishEx();
        System.out.println(newFishEx);
    }
}
