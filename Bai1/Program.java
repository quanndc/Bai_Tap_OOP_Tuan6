

public class Program {
    public static void main(String[] args){
        // Point pt1 = new Point(2,3);
        // pt1.move(3, 5);
        Circle r1 = new Circle(1, 2, 1,"red");
        Circle r2 = new Circle(2, 3, 2,"green");
        Circle r3 = new Circle(3, 4, 3,"blue");

        System.out.println("Chu vi : " + r1.calArea());
        System.out.println("Dien tich: " + r1.calPerimeter());

        System.out.println("Chu vi : " + r2.calArea());
        System.out.println("Dien tich: " + r2.calPerimeter());

        System.out.println("Chu vi : " + r3.calArea());
        System.out.println("Dien tich: " + r3.calPerimeter());

        //System.out.println(crl1.getX());

        System.out.println(r1.draw());
    }
}
