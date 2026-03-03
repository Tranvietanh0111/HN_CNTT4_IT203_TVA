package KTDGSS16;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }
    @Override
    public double calculateFinalPrice() {
        return (warrantyMonths>12) ? (price + 1000000) : price;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf(" BH: %dtháng |hành tiền: %,.0f vnd.\n", warrantyMonths, calculateFinalPrice());
    }
}
