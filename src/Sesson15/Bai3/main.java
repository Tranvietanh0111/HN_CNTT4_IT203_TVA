package Sesson15.Bai3;

public class main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        // Kịch bản 1: Quy trình chuẩn
        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        System.out.println("--- KIỂM TRA QUY TRÌNH 1 ---");
        System.out.println("Kết quả: " + (checker.checkProcess(process1) ? "HỢP LỆ" : "KHÔNG HỢP LỆ"));

        // Kịch bản 2: Quên hoàn tất thuốc (Dư PUSH)
        String[] process2 = {"PUSH", "PUSH", "POP"};
        System.out.println("\n--- KIỂM TRA QUY TRÌNH 2 ---");
        System.out.println("Kết quả: " + (checker.checkProcess(process2) ? "HỢP LỆ" : "KHÔNG HỢP LỆ"));

        // Kịch bản 3: Báo hoàn tất khi chưa phát (Thừa POP)
        String[] process3 = {"PUSH", "POP", "POP", "PUSH"};
        System.out.println("\n--- KIỂM TRA QUY TRÌNH 3 ---");
        System.out.println("Kết quả: " + (checker.checkProcess(process3) ? "HỢP LỆ" : "KHÔNG HỢP LỆ"));
    }
}
