package Sesson10.Bai5;

public class OfficeStaff extends Employee {
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // Không có thưởng
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Tổng lương: " + calculateSalary() + " (Không có thưởng)");
    }
}