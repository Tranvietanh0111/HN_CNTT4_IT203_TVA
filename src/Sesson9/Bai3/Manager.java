package Sesson9.Bai3;

public class Manager extends Employee{
    private String Phongban;
    public Manager(String Name,double salary,String Phongban){
        super(Name,salary);
        this.Phongban=Phongban;
    }
    public void display(){
        super.display();
        System.out.println("Phong Ban: "+Phongban);
    }
}
