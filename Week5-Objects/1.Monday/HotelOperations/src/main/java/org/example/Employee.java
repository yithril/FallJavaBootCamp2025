package org.example;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //getTotalPay
    public double getTotalPay(){
        //how do we calculate their total pay?
        return (getRegularHours() * getPayRate()) + (getOverTimeHours() * 1.5 * getPayRate());
    }

    //getRegularHours
    //This method's job is to tell you how many hours you worked
    public double getRegularHours(){
        if(hoursWorked <= 40){
            return hoursWorked;
        }
        else{
            return 40;
        }
    }

    //This method is how many hours you worked overtime
    //getOverTimeHours
    public double getOverTimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }
        else{
            return 0;
        }
    }
}
