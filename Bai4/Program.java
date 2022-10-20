package Bai4;

public class Program {
    public static void main(String[] args){
        PTrinhBac1 pt1 = new PTrinhBac1(2,3);
        PTrinhBac1 pt2 =  new PTrinhBac1(8,0);
        PTrinhBac2 pt3 = new PTrinhBac2(2,-1,2);
        PTrinhBac2 pt4 = new PTrinhBac2(0, 5,0);        
        
        
        //PTrinhBac2 pt = new PTrinhBac2(2, -4, 0);

        System.out.println(pt1.xuatNghiem());
        System.out.println(pt2.xuatNghiem());
        System.out.println(pt3.xuatNghiem());
        System.out.println(pt4.xuatNghiem());
    }
}
