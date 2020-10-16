package com.luubieunghi.BanhMi;

import com.luubieunghi.NguyenLieu.NguyenLieu;

import java.util.Arrays;

public class BanhMiThuong extends BanhMi{
    public BanhMiThuong(){
        super();
        this.tenBanhMi = "Banh mi binh thuong";

        NguyenLieu bot = new NguyenLieu("Bot");
        NguyenLieu sua = new NguyenLieu("Sua");
        this.danhSachNguyenLieu = Arrays.asList(bot,sua);
    }
}
