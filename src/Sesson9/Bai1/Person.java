package Sesson9.Bai1;
public class Person {
    private String Name;
    private int age;
    public Person(String Name,int age){
        this.Name=Name;
        this.age=age;
    }
    public void display(){
        System.out.println("Ho va Ten: "+Name);
        System.out.println("Tuoi: "+age);
    }
}
