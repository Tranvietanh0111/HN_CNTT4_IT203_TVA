package Sesson15.Bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    private Stack<String> stack;

    public MedicationProcessChecker() {
        this.stack = new Stack<>();
    }

    /**
     * Kiểm tra quy trình dùng thuốc
     * @param actions Mảng các chuỗi "PUSH" hoặc "POP"
     * @return true nếu quy trình hợp lệ, ngược lại false
     */
    public boolean checkProcess(String[] actions) {
        reset(); // Đảm bảo Stack trống trước khi kiểm tra

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i].toUpperCase();

            if (action.equals("PUSH")) {
                stack.push("Thuốc"); // Đưa một bản ghi vào Stack
                System.out.println("Thao tác " + (i + 1) + ": PUSH -> Đang phát thuốc.");
            }
            else if (action.equals("POP")) {
                // LỖI 1: POP khi Stack rỗng (Chưa phát thuốc đã báo hoàn tất)
                if (stack.isEmpty()) {
                    System.out.println("LỖI: Thao tác " + (i + 1) + " là POP nhưng chưa có thuốc nào được phát!");
                    return false;
                }
                stack.pop();
                System.out.println("Thao tác " + (i + 1) + ": POP -> Đã hoàn tất một đơn thuốc.");
            }
        }

        // LỖI 2: Kết thúc ca trực mà Stack vẫn còn thuốc (Chưa hoàn tất hết thuốc đã phát)
        if (!stack.isEmpty()) {
            System.out.println("LỖI: Kết thúc ca trực nhưng vẫn còn " + stack.size() + " đơn thuốc chưa hoàn tất!");
            return false;
        }

        return true;
    }

    // Làm mới Stack cho lần kiểm tra sau
    public void reset() {
        stack.clear();
    }
}
