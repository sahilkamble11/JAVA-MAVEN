package com.HR_Domain.demo.HR;

public class App {
    public static void main(String[] args) {

        SalesEmployee emp = new SalesManager(1, "Nirjala", "Naik", "sahil@123", "7894561230","Satara", "11/11/2001", 5000.00, 100000.00, 120000.00,30000.00, 8000.00, 10000.00);

        System.out.println(emp);

        emp.doWork();
        System.out.println("Total Salary: " + emp.computePay());
    }
}
