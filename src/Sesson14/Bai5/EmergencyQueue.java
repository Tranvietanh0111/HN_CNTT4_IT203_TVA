package Sesson14.Bai5;
import java.util.TreeSet;
import java.util.Comparator;

public class EmergencyQueue {
    public static void main(String[] args) {
        TreeSet<Patient> queue = new TreeSet<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.getSeverity() != p2.getSeverity()) {
                    return Integer.compare(p1.getSeverity(), p2.getSeverity());
                }
                return Integer.compare(p1.getArrivalTime(), p2.getArrivalTime());
            }
        });

        queue.add(new Patient("A", 3, 480)); // 8:00
        queue.add(new Patient("B", 1, 495)); // 8:15
        queue.add(new Patient("C", 1, 485)); // 8:05

        System.out.println("Thứ tự xử lý cấp cứu:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}