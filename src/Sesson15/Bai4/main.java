package Sesson15.Bai4;
public class main {
    public static void main(String[] args) {
        EmergencyQueue emergencyRoom = new EmergencyQueue();

        // Giả sử các bệnh nhân đến theo thứ tự thời gian như sau:
        emergencyRoom.addPatient(new EmergencyPatient("BN01", "Nguyễn Thường", 2));
        emergencyRoom.addPatient(new EmergencyPatient("BN02", "Trần Thường", 2));
        emergencyRoom.addPatient(new EmergencyPatient("BN03", "Lê Cấp Cứu", 1)); // Đến sau nhưng ưu tiên 1
        emergencyRoom.addPatient(new EmergencyPatient("BN04", "Phạm Cấp Cứu", 1));

        // Hiển thị hàng đợi
        emergencyRoom.displayQueue();

        // Bác sĩ gọi khám
        System.out.println("Bác sĩ gọi: " + emergencyRoom.callNextPatient());
        System.out.println("Bác sĩ gọi: " + emergencyRoom.callNextPatient());

        System.out.println("\n--- Sau khi khám 2 ca ưu tiên ---");
        emergencyRoom.displayQueue();
    }
}