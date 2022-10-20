package Bai3;

import java.util.Scanner;

public class HocSinh extends Nguoi{
    private Scanner input;

    public float diemTB;
    public float getDiemTB() {
        return diemTB;
    }
    public void setDiemTb(float diemTB) {
        this.diemTB = diemTB;
    }

    public HocSinh(){
        super();
        this.diemTB = 0;
    }

    public HocSinh(String hoTen, int namSinh, String diaChi, float diemTB){
        super(hoTen,namSinh,diaChi);
        this.diemTB = diemTB;
    }

    @Override
    public void nhap() {
        System.out.print("Nhap ten: ");
        this.setHoTen(input.nextLine());
        System.out.print("Nhap nam sinh: ");
        this.setNamSinh(Integer.parseInt(input.nextLine()));
        System.out.print("Nhap dia chi: ");
        this.setDiaChi(input.nextLine());
        System.out.print("Nhap diem TB: ");
        this.setDiemTb(Float.parseFloat(input.nextLine()));
    }

    @Override
    public String xuat() {
        return String.format("%s    %d      %s      %.2f", 
                                    this.getHoTen(), this.getNamSinh(), this.getDiaChi(), this.getDiemTB());
    }

    public boolean khenThuong(){
        return this.getDiemTB() >= 9 ? true : false;
    }

    public void thongBaoKhenThuong(){
        if(khenThuong() == true){
            System.out.println("Hoc sinh " + this.getHoTen() + " duoc khen thuong");
        }
        else{
            System.out.println("Hoc sinh " + this.getHoTen() + " khong duoc khen thuong");
        }
    }

}
