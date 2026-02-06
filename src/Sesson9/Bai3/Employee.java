package Sesson9.Bai3;

public class Employee {
    private String Name;
    private double salary;
    public Employee(String Name,double salary){
        this.Name=Name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Ten: "+Name);
        System.out.println("Luong: "+salary);
    }
}
