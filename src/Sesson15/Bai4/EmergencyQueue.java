package Sesson15.Bai4;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmergencyQueue {
    private PriorityQueue<EmergencyPatient> queue;

    public EmergencyQueue() {
        this.queue = new PriorityQueue<>();
    }

    // Thêm bệnh nhân vào hàng đợi (tự động sắp xếp theo độ ưu tiên)
    public void addPatient(EmergencyPatient p) {
        queue.add(p);
        System.out.println(">>> Tiếp nhận: " + p.getName() + " (" + (p.getPriority() == 1 ? "Cấp cứu" : "Thường") + ")");
    }

    // Gọi bệnh nhân tiếp theo
    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống.");
            return null;
        }
        return queue.poll();
    }

    // Hiển thị danh sách đang chờ (đã sắp xếp)
    public void displayQueue() {
        System.out.println("\n--- DANH SÁCH CHỜ KHÁM (Theo thứ tự ưu tiên) ---");
        if (queue.isEmpty()) {
            System.out.println("Trống.");
        } else {
            // PriorityQueue không đảm bảo thứ tự khi duyệt bằng for-each,
            // nên ta copy ra list và sắp xếp để hiển thị đúng.
            List<EmergencyPatient> sortedList = new ArrayList<>(queue);
            Collections.sort(sortedList);
            for (EmergencyPatient p : sortedList) {
                System.out.println(p);
            }
        }
        System.out.println("--------------------------------------------------\n");
    }
}
