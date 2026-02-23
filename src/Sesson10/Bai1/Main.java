package Sesson10.Bai1;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rect = new Rectangle(4.0, 6.0);

        System.out.println("--- Hình tròn (r=5) ---");
        System.out.printf("Diện tích: %.2f\n", circle.getArea());
        System.out.printf("Chu vi: %.2f\n", circle.getPerimeter());

        System.out.println("\n--- Hình chữ nhật (4x6) ---");
        System.out.printf("Diện tích: %.2f\n", rect.getArea());
        System.out.printf("Chu vi: %.2f\n", rect.getPerimeter());
    }
}
