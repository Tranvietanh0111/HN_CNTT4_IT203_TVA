
package Sesson14.Bai6;
import java.util.*;

public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patientList = new ArrayList<>();
        patientList.add(new Patient("Lan", 25, "Tim mạch"));
        patientList.add(new Patient("Hùng", 40, "Nội tiết"));
        patientList.add(new Patient("Mai", 30, "Tim mạch"));
        patientList.add(new Patient("Tuấn", 55, "Xương khớp"));
        patientList.add(new Patient("An", 20, "Nội tiết"));
        patientList.add(new Patient("Cường", 45, "Nội tiết"));

        Map<String, List<Patient>> departmentMap = new HashMap<>();

        for (Patient p : patientList) {
            String deptName = p.getDepartment();

            if (!departmentMap.containsKey(deptName)) {
                departmentMap.put(deptName, new ArrayList<>());
            }
            departmentMap.get(deptName).add(p);
        }

        System.out.println("--- Danh sách bệnh nhân theo khoa ---");
        for (String dept : departmentMap.keySet()) {
            System.out.println("Khoa " + dept + ": " + departmentMap.get(dept));
        }

        String overcrowdedDept = "";
        int maxPatients = 0;

        for (Map.Entry<String, List<Patient>> entry : departmentMap.entrySet()) {
            if (entry.getValue().size() > maxPatients) {
                maxPatients = entry.getValue().size();
                overcrowdedDept = entry.getKey();
            }
        }

        System.out.println("\n--- Phân tích hệ thống ---");
        if (!overcrowdedDept.isEmpty()) {
            System.out.println("Khoa " + overcrowdedDept + " đang đông nhất (" + maxPatients + " bệnh nhân).");
        }
    }
}