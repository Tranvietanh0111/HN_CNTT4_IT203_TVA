package Sesson10.Bai3;

public class Duck extends Animal implements Animal.Swimmable, Animal.Flyable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void introduce() {
        System.out.println("Tôi là vịt, tên tôi là: " + name);
    }

    @Override
    public void swim() {
        System.out.println(name + " đang bơi tung tăng trên mặt hồ.");
    }

    @Override
    public void fly() {
        System.out.println(name + " đang cất cánh bay lên bầu trời.");
    }
}
