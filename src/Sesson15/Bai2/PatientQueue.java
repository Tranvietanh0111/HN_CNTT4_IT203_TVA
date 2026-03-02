package Sesson15.Bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue;

    public PatientQueue() {
        // Sử dụng LinkedList để triển khai Queue
        this.queue = new LinkedList<>();
    }

    // Thêm bệnh nhân vào cuối hàng (Enqueue)
    public void addPatient(Patient p) {
        queue.add(p);
        System.out.println("Đã thêm bệnh nhân: " + p.getName() + " vào hàng đợi.");
    }

    // Gọi bệnh nhân đầu hàng vào khám (Dequeue)
    public Patient callNextPatient() {
        if (!isEmpty()) {
            return queue.poll(); // Lấy ra và xóa khỏi hàng
        }
        System.out.println("Hàng đợi hiện đang trống!");
        return null;
    }

    // Xem bệnh nhân tiếp theo là ai (Peek)
    public Patient peekNextPatient() {
        if (!isEmpty()) {
            return queue.peek(); // Chỉ xem, không xóa
        }
        return null;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị danh sách bệnh nhân đang chờ
    public void displayQueue() {
        System.out.println("\n--- DANH SÁCH BỆNH NHÂN ĐANG CHỜ ---");
        if (isEmpty()) {
            System.out.println("Không có bệnh nhân nào.");
        } else {
            int count = 1;
            for (Patient p : queue) {
                System.out.println(count + ". " + p);
                count++;
            }
        }
        System.out.println("------------------------------------\n");
    }
}
