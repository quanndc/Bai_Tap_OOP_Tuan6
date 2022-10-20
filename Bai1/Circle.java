public class Circle extends Point {
    public float radius;
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String draw(){
        return String.format("Hinh tron co ban kinh %.0f, mau %s, duoc ve tai toa do %s", this.getRadius(), this.getColor(), this.toString());
    }


    public float calArea(){
        return (float) (this.getRadius() * 2 * 3.14);
    }

    public float calPerimeter(){
        return (float) ((Math.pow(this.getRadius(),2))*3.14);
    }

    public Circle(){
        super();
        this.radius = 0;
        this.color = "";
    }

    public Circle(int x, int y, float radius, String color){
        super(x, y);
        this.radius = radius;
        this.color = color;
    }

}
