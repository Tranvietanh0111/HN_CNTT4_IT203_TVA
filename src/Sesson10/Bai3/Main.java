package Sesson10.Bai3;

public class Main {
        public static void main(String[] args) {
            Duck donald = new Duck("Donal");
            Fish nemo = new Fish("Chép vàng om dưa");

            System.out.println("--- Hành động của Vịt ---");
            donald.introduce();
            donald.swim();
            donald.fly();

            System.out.println("\n--- Hành động của Cá ---");
            nemo.introduce();
            nemo.swim();
            nemo.fly();
        }
}
