package Sesson10.Bai6;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format("Sản phẩm: %-10s | Giá: %-8.0f", name, price);
    }
}
