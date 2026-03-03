package KTDGSS16;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        repo.add(new ElectronicProduct("1", "iphone 17", 50000000, 24));
        repo.add(new ElectronicProduct("2", "muôi", 5000, 6));
        repo.add(new FoodProduct("3", "Bánh", 50000, 10));
        repo.add(new FoodProduct("4", "Sữa", 200000, 5));
        System.out.println("Danh sách sản phâam");
        repo.findAll().forEach(Product::displayInfo);
        System.out.println("\n Tìm kiếm Id: 1 ");
        Product found = repo.findById("1");
        if (found != null) found.displayInfo();
        else System.out.println("không thấy!");
        System.out.println("\n danh sách sau sắp xếp giá tăng dần");
        repo.sortByPrice();
        repo.findAll().forEach(Product::displayInfo);
        System.out.println("\n Thống kê số lượng");
        Map<String, Integer> stats = repo.getStatistics();
        stats.forEach((key, value) -> System.out.println(key + ": " + value + " sản phẩm"));
    }
}
