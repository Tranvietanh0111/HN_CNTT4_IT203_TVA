package Sesson9.Bai6;
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Circle();
        shapes[3] = new Rectangle();

        double totalArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].area();
        }

        System.out.println("Tổng diện tích: " + totalArea);
    }
}
