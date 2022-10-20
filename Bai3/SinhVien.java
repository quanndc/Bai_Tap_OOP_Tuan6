package Bai3;

public class SinhVien extends HocSinh{
    public boolean nghienCuuKH;
    public boolean isNghienCuuKH() {
        return nghienCuuKH;
    }
    public void setNghienCuuKH(boolean nghienCuuKH) {
        this.nghienCuuKH = nghienCuuKH;
    }

    public SinhVien(){
        super();
        this.nghienCuuKH = false;
    }

    public SinhVien(String hoTen, int namSinh, String diaChi, float diemTB, boolean nghienCuuKH){
        super(hoTen, namSinh, diaChi, diemTB);
        this.nghienCuuKH = nghienCuuKH;
    }

    @Override
    public void nhap() {
        super.nhap();
    }
    
    @Override
    public String xuat() {
        return super.xuat();
    }

    @Override
    public boolean khenThuong() {
        return (this.nghienCuuKH == true && this.getDiemTB() >=9) ? true : false;
    }

    @Override
    public void thongBaoKhenThuong() {
        if(khenThuong() == true){
            System.out.println("Sinh vien " + this.getHoTen() + " duoc khen thuong");
        }
        else{
            System.out.println("Sinh vien " + this.getHoTen() + " khong duoc khen thuong");
        }
    }

}
