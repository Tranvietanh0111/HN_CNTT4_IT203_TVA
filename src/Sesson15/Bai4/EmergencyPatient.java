package Sesson15.Bai4;

public class EmergencyPatient implements Comparable<EmergencyPatient> {
    private String id;
    private String name;
    private int priority; // 1: Cấp cứu, 2: Thường
    private long arrivalTime; // Dùng để xử lý FIFO khi cùng mức độ ưu tiên

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.arrivalTime = System.nanoTime(); // Lưu thời điểm đến chính xác
    }

    // Getters
    public String getName() { return name; }
    public int getPriority() { return priority; }

    @Override
    public int compareTo(EmergencyPatient other) {
        // So sánh mức độ ưu tiên trước
        if (this.priority != other.priority) {
            return Integer.compare(this.priority, other.priority);
        }
        // Nếu cùng mức độ ưu tiên, ai đến trước (arrivalTime nhỏ hơn) sẽ khám trước (FIFO)
        return Long.compare(this.arrivalTime, other.arrivalTime);
    }

    @Override
    public String toString() {
        String type = (priority == 1) ? "NGUY KỊCH (Cấp cứu)" : "Bình thường";
        return String.format("[%s] %-15s | Loại: %s", id, name, type);
    }
}
