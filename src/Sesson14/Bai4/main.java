package Sesson14.Bai4;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        List<String> reportedCases = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );

        Map<String, Integer> statisticsMap = new TreeMap<>();

        for (String disease : reportedCases) {
            if (statisticsMap.containsKey(disease)) {
                // If disease exists, increment the count
                statisticsMap.put(disease, statisticsMap.get(disease) + 1);
            } else {
                // If new disease, start with 1
                statisticsMap.put(disease, 1);
            }
        }
        System.out.println("Báo cáo thống kê ca bệnh (Đã sắp xếp):");
        for (Map.Entry<String, Integer> entry : statisticsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}