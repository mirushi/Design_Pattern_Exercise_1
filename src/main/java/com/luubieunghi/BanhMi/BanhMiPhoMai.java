package com.luubieunghi.BanhMi;

import com.luubieunghi.NguyenLieu.NguyenLieu;

import java.util.Arrays;

public class BanhMiPhoMai extends BanhMi {

    public BanhMiPhoMai () {
        super();
        this.tenBanhMi = "Banh mi pho mai";

        NguyenLieu bot = new NguyenLieu("Bot");
        NguyenLieu sua = new NguyenLieu("Sua");
        NguyenLieu phoMai = new NguyenLieu("Pho mai");

        this.danhSachNguyenLieu = Arrays.asList(bot, sua, phoMai);
    }

}
