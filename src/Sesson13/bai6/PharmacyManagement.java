package Sesson13.bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class PharmacyManagement {
    private static List<Medicine> cart = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- HỆ THỐNG KÊ ĐƠN THUỐC ---");
            System.out.println("1. Thêm thuốc vào đơn (Cộng dồn)");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc khỏi đơn");
            System.out.println("4. In hóa đơn & Thanh toán");
            System.out.println("5. Tìm thuốc giá rẻ (< 50.000 VNĐ)");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addMedicine();
                case 2 -> adjustQuantity();
                case 3 -> removeMedicine();
                case 4 -> printInvoice();
                case 5 -> findCheapMedicines();
            }
        } while (choice != 0);
    }

    private static void addMedicine() {
        System.out.print("Mã thuốc: ");
        String id = sc.nextLine();

        for (Medicine m : cart) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Thuốc đã có. Nhập số lượng cộng thêm: ");
                int extra = Integer.parseInt(sc.nextLine());
                m.setQuantity(m.getQuantity() + extra);
                System.out.println("Đã cập nhật số lượng.");
                return;
            }
        }

        System.out.print("Tên thuốc: ");
        String name = sc.nextLine();
        System.out.print("Đơn giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Số lượng: ");
        int qty = Integer.parseInt(sc.nextLine());

        cart.add(new Medicine(id, name, price, qty));
        System.out.println("Đã thêm thuốc mới vào đơn.");
    }

    private static void adjustQuantity() {
        System.out.print("Nhập mã thuốc cần chỉnh: ");
        String id = sc.nextLine();
        Iterator<Medicine> it = cart.iterator();
        while (it.hasNext()) {
            Medicine m = it.next();
            if (m.getDrugId().equalsIgnoreCase(id)) {
                System.out.print("Nhập số lượng mới: ");
                int newQty = Integer.parseInt(sc.nextLine());
                if (newQty <= 0) {
                    it.remove();
                    System.out.println("Đã xóa thuốc khỏi đơn.");
                } else {
                    m.setQuantity(newQty);
                    System.out.println("Đã điều chỉnh số lượng.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy mã thuốc.");
    }

    private static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = sc.nextLine();
        boolean removed = cart.removeIf(m -> m.getDrugId().equalsIgnoreCase(id));
        System.out.println(removed ? "Thành công." : "Không tìm thấy mã thuốc.");
    }

    private static void printInvoice() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc trống!");
            return;
        }
        double grandTotal = 0;
        System.out.println("\n-------------------------- HÓA ĐƠN THUỐC --------------------------");
        System.out.printf("%-10s | %-20s | %10s | %8s | %12s\n", "Mã", "Tên thuốc", "Đơn giá", "SL", "Thành tiền");
        for (Medicine m : cart) {
            System.out.println(m);
            grandTotal += m.getTotalPrice();
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("TỔNG TIỀN THANH TOÁN: %.2f VNĐ\n", grandTotal);

        cart.clear();
        System.out.println("Hệ thống đã làm mới đơn hàng cho bệnh nhân tiếp theo.");
    }

    private static void findCheapMedicines() {
        System.out.println("\n--- CÁC THUỐC GIÁ RẺ (< 50.000 VNĐ) ---");
        boolean found = false;
        for (Medicine m : cart) {
            if (m.getUnitPrice() < 50000) {
                System.out.println(m);
                found = true;
            }
        }
        if (!found) System.out.println("Không có thuốc nào dưới 50.000 VNĐ.");
    }
}