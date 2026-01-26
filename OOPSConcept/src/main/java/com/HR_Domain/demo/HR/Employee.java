package com.HR_Domain.demo.HR;

public abstract class Employee{

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String location;
    private String birthDate;

    public Employee() {
    }

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

            public int getId() {
                 return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getContactNumber() {
                return contactNumber;
            }

            public void setContactNumber(String contactNumber) {
                this.contactNumber = contactNumber;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getBirthDate() {
                return birthDate;
            }

            public void setBirthDate(String birthDate) {
                this.birthDate = birthDate;
            }


    public abstract void doWork();

    public double computePay(){
        return 0.0;
    }

    @Override
    public String toString(){
        return "Employee{"+
        "Id: "+id+
        "First Name: "+ firstName +
        "Last Name: "+ lastName +
        "Email: "+email+
        "Contact Number: " + contactNumber +
        "Location: " + location +
        "Birthdate : " + birthDate +" }";
    };

}