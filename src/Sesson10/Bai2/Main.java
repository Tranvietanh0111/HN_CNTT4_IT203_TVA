package Sesson10.Bai2;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        Vehicle myBike = new Bicycle("Thống Nhất");

        myCar.move();
        myBike.move();
    }
}