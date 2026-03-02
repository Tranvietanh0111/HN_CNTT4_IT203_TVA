package Sesson15.Bai2;

public class main {
    public static void main(String[] args) {
        PatientQueue clinic = new PatientQueue();

        // 1. Tiếp nhận bệnh nhân
        clinic.addPatient(new Patient("BN001", "Nguyễn Văn A", 25));
        clinic.addPatient(new Patient("BN002", "Trần Thị B", 60));
        clinic.addPatient(new Patient("BN003", "Lê Văn C", 10));

        // 2. Hiển thị danh sách chờ
        clinic.displayQueue();

        // 3. Xem ai là người tiếp theo sẽ được khám
        System.out.println("Bệnh nhân chuẩn bị khám: " + clinic.peekNextPatient());

        // 4. Bác sĩ gọi khám lần lượt
        System.out.println("\n--- Bác sĩ bắt đầu gọi khám ---");
        Patient p1 = clinic.callNextPatient();
        System.out.println("Mời bệnh nhân: " + p1.getName() + " vào phòng khám.");

        Patient p2 = clinic.callNextPatient();
        System.out.println("Mời bệnh nhân: " + p2.getName() + " vào phòng khám.");

        // 5. Hiển thị danh sách còn lại
        clinic.displayQueue();
    }
}
