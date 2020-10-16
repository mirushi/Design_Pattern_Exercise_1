package com.luubieunghi.Factory;

import com.luubieunghi.BanhMi.*;

public class BanhMiFactory {

    public BanhMi createBanhMi (BanhMiType banhMiType) {
        switch (banhMiType){
            case THUONG:
                return new BanhMiThuong();
            case PHO_MAI:
                return new BanhMiPhoMai();
            case THIT:
                return new BanhMiThit();
            default:
                throw new RuntimeException();
        }
    }

}
