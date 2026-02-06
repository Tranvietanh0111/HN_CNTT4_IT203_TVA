package Sesson9.Bai1;

public class SYudent extends Person{
    private String Masv;
    private double diem;
    public void Student(String Masv, double diem, String Name, int age){
        super(Name,age);
        this.diem=diem;
        this.Masv=Masv;
    }
    public void display(){
        super.display();
        System.out.println("Masv: "+Masv);
        System.out.println("Diem: "+diem);
    }
}
