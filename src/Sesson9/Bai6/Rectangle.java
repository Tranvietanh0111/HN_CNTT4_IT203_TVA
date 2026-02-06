package Sesson9.Bai6;

public class Rectangle extends Shape{
    private double width;
    private double height;

    // Overload constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    @Override
    public double area() {
        return width * height;
    }
}
