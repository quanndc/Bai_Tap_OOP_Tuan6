package Bai3;

public class Program {
    public static void main(String[] args){
        HocSinh arr[] = new HocSinh[5];

        arr[0] = new HocSinh("Tran Minh Quan", 2003, "Go Vap", 10);
        arr[1] = new SinhVien("Tran Minh Quan", 2003, "Go Vap", 2,true);
        arr[0].thongBaoKhenThuong();
        arr[1].thongBaoKhenThuong();
    }
}
