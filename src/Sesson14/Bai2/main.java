package Sesson14.Bai2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<String, String> medicineInventory = new HashMap<>();

        medicineInventory.put("T01", "Paracetamol");
        medicineInventory.put("T02", "Ibuprofen");
        medicineInventory.put("T03", "Amoxicillin");
        medicineInventory.put("T04", "Aspirin");
        medicineInventory.put("T05", "Vitamin C");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String inputCode = scanner.nextLine().trim().toUpperCase();

        if (medicineInventory.containsKey(inputCode)) {
            String medicineName = medicineInventory.get(inputCode);
            System.out.println("Tên thuốc: " + medicineName);
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT");
        }

        scanner.close();
    }
}