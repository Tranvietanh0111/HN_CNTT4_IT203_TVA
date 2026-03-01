package Sesson14.Bai3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<String> medicineComponents = new HashSet<>(Arrays.asList("Aspirin", "Caffeine", "Paracetamol"));
        Set<String> patientAllergies = new HashSet<>(Arrays.asList("Penicillin", "Aspirin", "Pollen"));

        System.out.println("Thuốc: " + medicineComponents);
        System.out.println("Dị ứng: " + patientAllergies);

        Set<String> allergyWarnings = new HashSet<>(medicineComponents);
        allergyWarnings.retainAll(patientAllergies);

        Set<String> safeComponents = new HashSet<>(medicineComponents);
        safeComponents.removeAll(patientAllergies);

        if (allergyWarnings.isEmpty()) {
            System.out.println("Kết quả: Thuốc này an toàn cho bệnh nhân.");
        } else {
            System.out.println("Cảnh báo dị ứng: " + allergyWarnings);
        }

        System.out.println("Thành phần an toàn: " + safeComponents);
    }
}