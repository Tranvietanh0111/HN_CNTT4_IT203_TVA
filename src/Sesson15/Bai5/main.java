package Sesson15.Bai5;

public class main {
    public static void main(String[] args) {
        EmergencyCaseQueue hospitalQueue = new EmergencyCaseQueue();

        // 1. Tiếp nhận bệnh nhân vào Queue
        hospitalQueue.addCase(new EmergencyCase("Nguyễn Văn A"));
        hospitalQueue.addCase(new EmergencyCase("Trần Thị B"));

        System.out.println("\n--- BẮT ĐẦU XỬ LÝ CA 1 ---");
        EmergencyCase currentCase = hospitalQueue.getNextCase();

        // 2. Thực hiện các bước điều trị (Stack xử lý)
        currentCase.addStep(new TreatmentStep("Tiếp nhận & Đo huyết áp", "08:00"));
        currentCase.addStep(new TreatmentStep("Tiêm thuốc giảm đau", "08:10"));
        currentCase.addStep(new TreatmentStep("Xét nghiệm máu", "08:20"));

        // 3. Giả sử có sai sót ở bước xét nghiệm, thực hiện Undo
        System.out.println("\n(Phát hiện nhầm lẫn, đang hoàn tác bước cuối...)");
        currentCase.undoStep();

        // 4. Hiển thị tình trạng hiện tại của ca cấp cứu
        currentCase.displaySteps();

        System.out.println("\n--- CA TIẾP THEO ---");
        EmergencyCase nextCase = hospitalQueue.getNextCase();
        System.out.println("Đang chuẩn bị phòng cho bệnh nhân: " + nextCase.getPatientName());
    }
}