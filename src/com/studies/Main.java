package com.studies;

public class Main {

    static final int number = 1;

    static final private Animal a = new Animal("Gabriel", 10);

    public static void main(String[] args) {

        Animal b = new Animal();
        b.setAge(25);
        b.setName("Clara");
        System.out.println("Test Number: " + number);
        System.out.println("Animal Name: " + a.getName() + "\n" + "Animal Age: " + a.getAge());
        System.out.println("Animal Name: " + b.getName() + "\n" + "Animal Age: " + b.getAge());
    }
}
