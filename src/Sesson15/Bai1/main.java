package Sesson15.Bai1;

public class main {
    public static void main(String[] args) {
        MedicalRecordHistory manager = new MedicalRecordHistory();

        manager.addEdit(new EditAction("Cập nhật nhịp tim: 80bpm", "08:00"));
        manager.addEdit(new EditAction("Thêm đơn thuốc Paracetamol", "08:15"));
        manager.addEdit(new EditAction("Thay đổi chẩn đoán: Sốt xuất huyết", "08:30"));

        manager.displayHistory();

        System.out.println("Chỉnh sửa gần nhất (Peek): " + manager.getLatestEdit());
        System.out.println("\n--- Đang thực hiện Undo ---");
        EditAction undone = manager.undoEdit();
        if (undone != null) {
            System.out.println("Đã hoàn tác hành động: " + undone.getDescription());
        }
        manager.displayHistory();
    }
}