package Sesson13.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main{
    public static void main(String[] args) {
        List<String> danhSachNhap = new ArrayList<>(Arrays.asList(
                "Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"
        ));

        System.out.println("Danh sách nhập kho ban đầu: " + danhSachNhap);

        List<String> danhSachDuyNhat = locThuocTrungLap(danhSachNhap);
        Collections.sort(danhSachDuyNhat);

        System.out.println("Danh sách thuốc sau khi xử lý (A-Z): " + danhSachDuyNhat);
    }

    public static List<String> locThuocTrungLap(List<String> danhSachGoc) {
        List<String> ketQua = new ArrayList<>();
        for (String thuoc : danhSachGoc) {
            if (!ketQua.contains(thuoc)) {
                ketQua.add(thuoc);
            }
        }
        return ketQua;
    }
}