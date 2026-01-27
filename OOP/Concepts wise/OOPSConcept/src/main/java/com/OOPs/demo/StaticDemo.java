package com.OOPs.demo;


public class StaticDemo {

    // Static block (runs once when class loads)
    static {
        System.out.println("This is static block 1");
    }

    static {
        System.out.println("This is static block 2");
    }

    static int age = 18;   // static variable (class-level)
    int girl = 19;         // instance variable

    static void add() {
        // static method

        StaticDemo obj = new StaticDemo(); // creating object to access instance variable
        obj.girl = 30;

        System.out.println(age);
        System.out.println("Accessing instance variable in static method: " + obj.girl);

        int boy = 29; // local variable
    }

    public static void main(String[] args) {
        StaticDemo.add(); // correct way to call static method
        System.out.println("Main");
    }
}
