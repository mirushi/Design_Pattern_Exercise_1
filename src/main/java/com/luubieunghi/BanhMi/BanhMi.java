package com.luubieunghi.BanhMi;

import com.luubieunghi.NguyenLieu.NguyenLieu;

import java.util.List;

public abstract class BanhMi {
    protected String tenBanhMi;
    protected List<NguyenLieu> danhSachNguyenLieu;

    public String serve() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ban dang dung: ");
        stringBuilder.append(tenBanhMi);
        stringBuilder.append(" voi cac thanh phan nhu sau: ");

        if (danhSachNguyenLieu.size() > 0)
            stringBuilder.append(danhSachNguyenLieu.get(0).getTenNguyenLieu());

        for (int i = 1; i < danhSachNguyenLieu.size(); ++i){
            NguyenLieu nguyenLieu = danhSachNguyenLieu.get(i);
            stringBuilder.append(", ");
            stringBuilder.append(nguyenLieu.getTenNguyenLieu());
        }

        stringBuilder.append(".");

        return stringBuilder.toString();
    }
}
