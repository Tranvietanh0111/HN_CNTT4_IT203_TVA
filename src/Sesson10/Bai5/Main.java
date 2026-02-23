package Sesson10.Bai5;
public class Main {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Nguyễn Văn A", 10000000);
        Employee manager = new Manager("Trần Thị B", 20000000, 1.5);

        System.out.println("=== BẢNG LƯƠNG CHI TIẾT ===");
        staff.displayInfo();
        manager.displayInfo();
        if (manager instanceof BonusCalculator) {
            System.out.println(">> " + manager.name + " là đối tượng có chế độ thưởng.");
        }
    }
}