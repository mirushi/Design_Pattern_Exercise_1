package com.luubieunghi.BanhMi;

import com.luubieunghi.NguyenLieu.NguyenLieu;

import java.util.Arrays;

public class BanhMiThit extends BanhMi {

    public BanhMiThit () {
        super();
        this.tenBanhMi = "Banh mi thit";

        NguyenLieu bot = new NguyenLieu("Bot");
        NguyenLieu sua = new NguyenLieu("Sua");
        NguyenLieu thitNguoi = new NguyenLieu("Thit nguoi");

        this.danhSachNguyenLieu = Arrays.asList(bot, sua, thitNguoi);
    }

}
