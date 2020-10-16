package com.luubieunghi;

import com.luubieunghi.BanhMi.BanhMi;
import com.luubieunghi.CuaHang.CuaHangBanhMi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Danh sách các cửa hàng mà tôi quản lý.
        List<CuaHangBanhMi> danhSachCuaHang = new ArrayList<>();

        //Lưu lại danh sách bánh mì đã phục vụ cho người dùng.
        List<BanhMi> banhMiDaPhucVu = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int sel = -1;

        //Lấy ra cửa hàng cần quản lý.
        CuaHangBanhMi cuaHangQuanLy;

        //Thêm các cửa hàng vào danh sách quản lý.
        danhSachCuaHang.add(new CuaHangBanhMi("ACB Bakery Nguyen Trai", " 222 - 231 - 233 Nguyễn Trãi, P. 2 , Quận 5, TP. HCM"));

        System.out.println("Danh sach cua hang: ");
        System.out.println("Chon cua hang de quan ly: ");

        for (int i = 0; i < danhSachCuaHang.size(); ++i) {
            CuaHangBanhMi cuaHangBanhMi = danhSachCuaHang.get(i);
            System.out.println((i + 1) + ". " + cuaHangBanhMi.getTenCuaHang());
        }

        do {
            sel = scanner.nextInt();
        } while (sel <= 0 || sel > danhSachCuaHang.size());

        //Lấy ra cửa hàng cần quản lý.
        cuaHangQuanLy = danhSachCuaHang.get(sel - 1);

        String banhMiThuong = "Banh mi thuong";
        String banhMiPhoMai = "Banh mi pho mai";
        String banhMiThit = "Banh mi thit";

        int n = 0;

        System.out.println("Nhap vao so banh mi can thuc hien: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.println("Chon loai banh mi: ");
            System.out.println("1. " + banhMiThuong);
            System.out.println("2. " + banhMiPhoMai);
            System.out.println("3. " + banhMiThit);

            sel = scanner.nextInt();

            BanhMi banhMi;
            if (sel == 1) {
                banhMi = cuaHangQuanLy.serveBanhMi("Banh mi thuong di chu quan oi.");
            } else if (sel == 2) {
                banhMi = cuaHangQuanLy.serveBanhMi("Banh mi pho mai nha chu quan.");
            } else if (sel == 3) {
                banhMi = cuaHangQuanLy.serveBanhMi("Banh mi thit nguoi di chu quan oi.");
            } else {
                System.out.println("Cua hang khong biet lam loai banh mi ban da yeu cau.");
                System.out.println("Xin vui long yeu cau lai loai banh mi khac.");
                --i;
                continue;
            }
            banhMiDaPhucVu.add(banhMi);
        }

        System.out.println("Cac loai banh mi da phuc vu: ");
        for (BanhMi banhMi : banhMiDaPhucVu) {
            System.out.println(banhMi.serve());
        }
    }
}
