package com.HR_Domain.demo.HR;

public abstract class Employee{

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String location;
    private String birthDate;

    Employee(int id, String firstName,String lastName,
             String email,String contactNumber,String location,String birthDate){
                this.id=id;
                this.firstName=firstName;
                this.lastName=lastName;
                this.email=email;
                this.contactNumber=contactNumber;
                this.location=location;
                this.birthDate=birthDate;
             }

    public abstract void doWork();
    
    

    
}