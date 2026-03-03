package KTDGSS16;

public abstract class Product {
    protected String id;
    protected String name;
    protected double price;
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public abstract double calculateFinalPrice();
    public void displayInfo() {
        System.out.printf("mã: %-5s;tên:%-15s;giá gốc: %,.0f VNĐ", id, name, price);
    }
    public String getId() { return id; }
    public double getPrice() { return price; }
}