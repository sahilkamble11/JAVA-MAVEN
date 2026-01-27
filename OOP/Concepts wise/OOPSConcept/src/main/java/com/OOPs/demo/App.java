package com.OOPs.demo;

public class App {

    public App() {
        System.out.println("This is Constructor of this App class");
    }

    public void display(){
        System.out.println();
    }

    public static void main(String[] args) {
        App c=new App();
        System.out.println(c);
    }
    
}
