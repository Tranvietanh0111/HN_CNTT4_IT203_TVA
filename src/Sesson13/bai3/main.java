package Sesson13.bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Integer> khoaNoiInt = new ArrayList<>(Arrays.asList(101, 102, 105));
        List<Integer> khoaNgoaiInt = new ArrayList<>(Arrays.asList(102, 105, 108));
        List<Integer> ketQuaInt = findCommonPatients(khoaNoiInt, khoaNgoaiInt);
        System.out.println("Test Case 1 Output: " + ketQuaInt);

        List<String> khoaNoiStr = new ArrayList<>(Arrays.asList("DN01", "DN02", "DN03"));
        List<String> khoaNgoaiStr = new ArrayList<>(Arrays.asList("DN02", "DN04"));
        List<String> ketQuaStr = findCommonPatients(khoaNoiStr, khoaNgoaiStr);
        System.out.println("Test Case 2 Output: " + ketQuaStr);
    }

    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> common = new ArrayList<>();
        for (T item : listA) {
            if (listB.contains(item)) {
                common.add(item);
            }
        }
        return common;
    }
}