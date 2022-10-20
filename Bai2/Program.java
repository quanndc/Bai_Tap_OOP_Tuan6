package Bai2;

public class Program {
    public static void main(String[] args){
        Rectangle recta = new Rectangle(10, 3);

        System.out.println("Chu vi HCN: " + recta.calArea());
        System.out.println("Dien tich HCN: " + recta.calPerimeter());
        
        //System.out.println(recta.toString());

        Box box = new Box(2, 4, 6);
        System.out.println("Dien tich hinh hop: " + box.calPerimeter());
        System.out.println("The tich hinh hop: " + box.calVolume());
    }
}
