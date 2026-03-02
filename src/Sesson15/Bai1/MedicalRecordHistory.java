package Sesson15.Bai1;

import java.util.Stack;

public class MedicalRecordHistory {
    private Stack<EditAction> history;

    public MedicalRecordHistory() {
        this.history = new Stack<>();
    }

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã lưu chỉnh sửa: " + action.getDescription());
    }

    public EditAction undoEdit() {
        if (!isEmpty()) {
            return history.pop();
        }
        System.out.println("Không còn lịch sử để Undo!");
        return null;
    }
    public EditAction getLatestEdit() {
        if (!isEmpty()) {
            return history.peek();
        }
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
    public void displayHistory() {
        System.out.println("\n--- DANH SÁCH LỊCH SỬ (Từ cũ đến mới) ---");
        if (isEmpty()) {
            System.out.println("Lịch sử trống.");
        } else {
            for (EditAction action : history) {
                System.out.println(action);
            }
        }
        System.out.println("------------------------------------------\n");
    }
}
