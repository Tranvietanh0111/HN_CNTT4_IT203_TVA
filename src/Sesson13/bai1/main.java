package Sesson13.bai4;

import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Double> temperature =  new ArrayList<>();

        temperature.add(36.5);
        temperature.add(40.2);
        temperature.add(37.0);
        temperature.add(12.5);
        temperature.add(39.8);
        temperature.add(99.9);
        temperature.add(36.8);

        System.out.println("Danh sách nhiệt độ bệnh nhân: " + temperature);

        Iterator<Double> iterator = temperature.iterator();
        while (iterator.hasNext()) {
            double temp = iterator.next();
            if (temp < 34.0 || temp > 42.0) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách sau khi kiểm tra: " + temperature);

        double sum = 0;
        for (Double temp : temperature) {
            sum += temp;
        }
        double average = sum / temperature.size();

        System.out.printf("Nhiệt độ trung bình bệnh nhân: %.2f", average);
    }
}
