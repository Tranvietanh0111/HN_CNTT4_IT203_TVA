package Sesson13.bai5;

import java.util.*;

public class HospitalManagement {
    private static List<Patient> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- HỆ THỐNG QUẢN LÝ BỆNH VIỆN ---");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện (Xóa)");
            System.out.println("4. Danh sách bệnh nhân (Sắp xếp ưu tiên)");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> updateDiagnosis();
                case 3 -> dischargePatient();
                case 4 -> displaySortedPatients();
            }
        } while (choice != 5);
    }

    private static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        for (Patient p : list) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println("Lỗi: ID đã tồn tại!");
                return;
            }
        }
        System.out.print("Họ tên: ");
        String name = sc.nextLine();
        System.out.print("Tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Chẩn đoán: ");
        String diag = sc.nextLine();

        list.add(new Patient(id, name, age, diag));
        System.out.println("Tiếp nhận thành công.");
    }

    private static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();
        for (Patient p : list) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.print("Chẩn đoán mới: ");
                p.setDiagnosis(sc.nextLine());
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân.");
    }

    private static void dischargePatient() {
        System.out.print("Nhập ID xuất viện: ");
        String id = sc.nextLine();
        boolean removed = list.removeIf(p -> p.getId().equalsIgnoreCase(id));
        if (removed) System.out.println("Bệnh nhân đã xuất viện.");
        else System.out.println("Không tìm thấy ID.");
    }

    private static void displaySortedPatients() {
        list.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                int ageCompare = Integer.compare(p2.getAge(), p1.getAge());
                if (ageCompare != 0) return ageCompare;
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("\n--- DANH SÁCH BỆNH NHÂN ĐÃ SẮP XẾP ---");
        for (Patient p : list) System.out.println(p);
    }
}
