package com.luubieunghi.CuaHang;

import com.luubieunghi.BanhMi.BanhMi;
import com.luubieunghi.BanhMi.BanhMiType;
import com.luubieunghi.Factory.BanhMiFactory;

public class CuaHangBanhMi {

    private String tenCuaHang;
    private String diaChiCuaHang;

    private BanhMiFactory banhMiFactory;

    public CuaHangBanhMi (String tenCuaHang, String diaChiCuaHang) {
        banhMiFactory = new BanhMiFactory();
        this.tenCuaHang = tenCuaHang;
        this.diaChiCuaHang = diaChiCuaHang;
    }

    public BanhMi serveBanhMi (String order) {
        if (order.equals("Banh mi thit nguoi di chu quan oi."))
            return banhMiFactory.createBanhMi(BanhMiType.THIT);
        else if (order.equals("Banh mi thuong di chu quan oi."))
            return banhMiFactory.createBanhMi(BanhMiType.THUONG);
        else if (order.equals("Banh mi pho mai nha chu quan."))
            return banhMiFactory.createBanhMi(BanhMiType.PHO_MAI);
        throw new RuntimeException();
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
    }

    public String getDiaChiCuaHang() {
        return diaChiCuaHang;
    }

    public void setDiaChiCuaHang(String diaChiCuaHang) {
        this.diaChiCuaHang = diaChiCuaHang;
    }

    public BanhMiFactory getBanhMiFactory() {
        return banhMiFactory;
    }

    public void setBanhMiFactory(BanhMiFactory banhMiFactory) {
        this.banhMiFactory = banhMiFactory;
    }
}
