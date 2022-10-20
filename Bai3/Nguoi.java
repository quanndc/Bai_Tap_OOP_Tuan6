package Bai3;

import java.util.Scanner;

public class Nguoi {
    private Scanner input;

    public String hoTen;
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public int namSinh;
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String diaChi;
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Nguoi(){
        this.hoTen = "";
        this.namSinh = 0;
        this.diaChi = "";
    }

    public Nguoi(String hoTen, int namSinh, String diaChi){
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }


    public void nhap(){
        System.out.print("Nhap ten: ");
        this.setHoTen(input.nextLine());
        System.out.print("Nhap nam sinh: ");
        this.setNamSinh(Integer.parseInt(input.nextLine()));
        System.out.print("Nhap dia chi: ");
        this.setDiaChi(input.nextLine());
    }

    public String xuat(){
        return String.format("%s    %d      %s", this.getHoTen(), this.getNamSinh(), this.getDiaChi());
    }
}
