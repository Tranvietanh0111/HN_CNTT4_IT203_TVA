package Sesson15.Bai5;

import java.util.Stack;

public class EmergencyCase {
    private String patientName;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(String patientName) {
        this.patientName = patientName;
        this.steps = new Stack<>();
    }

    public String getPatientName() { return patientName; }

    // Thêm một bước xử lý (Push)
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("-> Đã thực hiện: " + step);
    }

    // Hoàn tác bước xử lý gần nhất (Pop)
    public TreatmentStep undoStep() {
        if (!steps.isEmpty()) {
            TreatmentStep undone = steps.pop();
            System.out.println("-> Đã hoàn tác: " + undone);
            return undone;
        }
        System.out.println("-> Chưa có bước xử lý nào để hoàn tác.");
        return null;
    }

    // Hiển thị toàn bộ quá trình điều trị
    public void displaySteps() {
        System.out.println("Lịch sử điều trị bệnh nhân " + patientName + ":");
        if (steps.isEmpty()) System.out.println("  (Trống)");
        for (int i = steps.size() - 1; i >= 0; i--) {
            System.out.println("  " + steps.get(i));
        }
    }
}