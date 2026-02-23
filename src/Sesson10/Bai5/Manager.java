package Sesson10.Bai5;

public class Manager extends Employee implements BonusCalculator {
    private double kpiScore;

    public Manager(String name, double baseSalary, double kpiScore) {
        super(name, baseSalary);
        this.kpiScore = kpiScore;
    }

    @Override
    public double getBonus() {
        return baseSalary * 0.2 * kpiScore;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Thưởng KPI: " + getBonus() + " | Tổng lương: " + calculateSalary());
    }
}