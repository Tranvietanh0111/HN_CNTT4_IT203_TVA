package Sesson10.Bai6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Laptop", 1500),
                new Product("Mouse", 25),
                new Product("Keyboard", 80),
                new Product("Monitor", 300)
        ));

        Collections.sort(products, new Comparator<Product>() {
            private int callCount = 0;
            @Override
            public int compare(Product p1, Product p2) {
                callCount++;
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("--- Sắp xếp theo giá (Anonymous Class) ---");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\n--- Sắp xếp theo tên (Lambda Expression) ---");
        products.forEach(System.out::println);
    }
}