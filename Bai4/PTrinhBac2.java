package Bai4;

public class PTrinhBac2 extends PTrinhBac1{
    public int c;
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    
    public float x2;
    public float getX2() {
        return x2;
    }

    public PTrinhBac2(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public PTrinhBac2(int a, int b, int c){
        super(a,b);
        this.c = c;
    }

    public int tinhDelta(){
        return (int) Math.pow(this.getB(),2) - 4*this.getA()*this.getC();
    }

    public float tinhNghiemKep(){
        return (float) (-this.getB()/(2*this.getA()));
    }

    public float tinhNghiemX1(){
        return (float) ((-this.getB()) + Math.sqrt(tinhDelta()))/(2*this.getA());
    }

    public float tinhNghiemX2(){
        return (float) ((-this.getB()) - Math.sqrt(tinhDelta()))/(2*this.getA());
    }
        

    @Override
    public int giai() {
        if(tinhDelta() < 0){
            return -1;
        }
        else if(tinhDelta() == 0){
            return 1;
        }
        else if (tinhDelta() > 0){
            return 2;
        }
        else{
            return 0;
        }
    }

    @Override
    public String xuatNghiem() {
        if(giai() == -1){
            return String.format("Phuong trinh %dx^2 + %dx + %d = 0 vo nghiem", this.getA(), this.getB(), this.getC());
        }
        else if(giai() == 1){
            return String.format("Phuong trinh %dx^2 + %dx + %d = 0 co nghiem kep x1 = x2 = %.3f ", 
                                        this.getA(), this.getB(), this.getC(), tinhNghiemKep());
        }
        else if(giai() == 2){
            return String.format("Phuong trinh %dx^2 + %dx + %d = 0 co 2 nghiem x1 = %.3f va x2 = %.3f", 
                                        this.getA(), this.getB(), this.getC(), tinhNghiemX1(), tinhNghiemX2());
        }
        else{
            return "";
        }
    }
}