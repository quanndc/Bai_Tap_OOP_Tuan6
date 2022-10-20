package Bai4;

public class PTrinhBac1 {
    public int a;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int b;
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public float x1;
    public float getX() {
        return x1;
    }


    public PTrinhBac1(){
        this.a = 0;
        this.b = 0;
    }

    public PTrinhBac1(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int giai(){
        if(this.getA() == 0 && this.getB() !=0){
            return -1;
        }
        else if(this.getA() == 0 && this.getB() == 0){
            return 0;
        }
        else if(this.getA() != 0){
            return 1;
        }
        return 100;
    }

    public String xuatNghiem(){
        if(giai() == -1){
            return String.format("Phuong trinh %dx + %d = 0 vo nghiem", this.getA(), this.getB());
        }
        else if(giai() == 0){
            return String.format("Phuong trinh %dx + %d = 0 co vo so nghiem", this.getA(), this.getB());
        }
        else{
            return String.format("Phuong trinh %dx + %d = 0 co 1 nghiem: x1 = %.3f", this.getA(), this.getB(), -(this.getB()*1.0/this.getA()*1.0));
        }
    }
}
