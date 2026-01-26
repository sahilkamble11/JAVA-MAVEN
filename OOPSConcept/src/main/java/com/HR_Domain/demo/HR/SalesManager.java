package com.HR_Domain.demo.HR;

public class SalesManager extends SalesEmployee {

    // private int id;
    // private String firstName;
    // private String lastName;
    // private String email;
    // private String contactNumber;
    // private String location;
    // private String birthDate;
    // private double incentive;
    // private double target;
    // private double achievedTarget;
    // private double basicSalary;
    // private double hra;
    private double bonus;

    SalesManager(int id, String firstName,String lastName,
             String email,String contactNumber,String location,String birthDate,double incentive,
              double target,double achievedTarget,double basicSalary,double hra,double bonus){
             super(id, firstName, lastName, email, contactNumber, location, birthDate, incentive, target, achievedTarget, basicSalary, hra);                

                // this.id = id;
                // this.firstName = firstName;
                // this.lastName = lastName;
                // this.email = email;
                // this.contactNumber = contactNumber;
                // this.location = location;
                // this.birthDate = birthDate;
                // this.incentive = incentive;
                // this.target = target;
                // this.achievedTarget = achievedTarget;
                // this.basicSalary = basicSalary;
                // this.hra = hra;
                this.bonus=bonus;
    }

    
//     public int getId() {
//     return id;
// }

// public void setId(int id) {
//     this.id = id;
// }

// public String getFirstName() {
//     return firstName;
// }

// public void setFirstName(String firstName) {
//     this.firstName = firstName;
// }

// public String getLastName() {
//     return lastName;
// }

// public void setLastName(String lastName) {
//     this.lastName = lastName;
// }

// public String getEmail() {
//     return email;
// }

// public void setEmail(String email) {
//     this.email = email;
// }

// public String getContactNumber() {
//     return contactNumber;
// }

// public void setContactNumber(String contactNumber) {
//     this.contactNumber = contactNumber;
// }

// public String getLocation() {
//     return location;
// }

// public void setLocation(String location) {
//     this.location = location;
// }

// public String getBirthDate() {
//     return birthDate;
// }

// public void setBirthDate(String birthDate) {
//     this.birthDate = birthDate;
// }

// public double getIncentive() {
//     return incentive;
// }

// public void setIncentive(double incentive) {
//     this.incentive = incentive;
// }

// public double getTarget() {
//     return target;
// }

// public void setTarget(double target) {
//     this.target = target;
// }

// public double getAchievedTarget() {
//     return achievedTarget;
// }

// public void setAchievedTarget(double achievedTarget) {
//     this.achievedTarget = achievedTarget;
// }

// public double getBasicSalary() {
//     return basicSalary;
// }

// public void setBasicSalary(double basicSalary) {
//     this.basicSalary = basicSalary;
// }

// public double getHra() {
//     return hra;
// }

// public void setHra(double hra) {
//     this.hra = hra;
// }

public double getbonus(){
    return bonus;
}

public void setbonus(double bonus){
    this.bonus=bonus;
}

    @Override
    public void doWork(){

        System.out.println(getFirstName()+" is managing the sales team and strategy.");
    }

    
    @Override
    public double computePay(){
        return super.computePay()+bonus;
    }

}
