package com.luubieunghi.NguyenLieu;

/** Hiện tại mình chỉ lưu tên, nên cho đơn giản thì không cần hiện thực sự kế thừa.
 *  Trong tương lai, nếu cần thiết quản lý nâng cao thì cứ kế thừa là xong.
 *  Có thể mở rộng ra thành Singleton kết hợp Repository pattern để thực hiện quản lý số lượng nguyên liệu, nhập kho,...
 *  Do đề bài chưa yêu cầu nên ta lam tối giản để tăng tốc ứng dụng.
 * **/
public class NguyenLieu {

    private String tenNguyenLieu;

    public NguyenLieu (String tenNguyenLieu){
        this.tenNguyenLieu = tenNguyenLieu;
    }

    public String getTenNguyenLieu() {
        return tenNguyenLieu;
    }

    public void setTenNguyenLieu(String tenNguyenLieu) {
        this.tenNguyenLieu = tenNguyenLieu;
    }
}
