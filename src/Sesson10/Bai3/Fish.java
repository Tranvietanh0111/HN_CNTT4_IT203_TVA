package Sesson10.Bai3;
public class Fish extends Animal implements Animal.Swimmable, Animal.Flyable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Tôi là cá, tên tôi là: " + name);
    }

    @Override
    public void fly() {
        System.out.println(name + " không biết bay");
    }

    @Override
    public void swim() {
        System.out.println(name + " đang lặn sâu dưới dòng nước.");
    }
}
