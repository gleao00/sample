package com.studies;

public class Main {

    static int number = 1;

    static final private Animal a = new Animal("Gabriel", 10);

    public static void main(String[] args) {
        System.out.println("Test Number: " + number);
        System.out.println("Animal Name: " + a.getName() + "\n" + "Animal Age: " + a.getAge());
    }
}
