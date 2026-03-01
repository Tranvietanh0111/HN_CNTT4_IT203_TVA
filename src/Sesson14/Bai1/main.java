import java.util.LinkedHashSet;
import java.util.Set;
public class main{
public static void main(String[] args) {
    String[] patientsInput = {
            "Nguyễn Văn V – Đồng Nai",
            "Trần Thị B – Thái Bình",
            "Nguyễn Văn A – Yên Bái",
            "Lê Văn C – Hưng Yên"
    };

    Set<String> patientQueue = new LinkedHashSet<>();

    for (String patient : patientsInput) {
        patientQueue.add(patient);
    }

    System.out.println("Danh sách gọi khám:");
    int orderNumber = 1;
    for (String patientName : patientQueue) {
        System.out.println(orderNumber + ". " + patientName);
        orderNumber++;
    }
}
}