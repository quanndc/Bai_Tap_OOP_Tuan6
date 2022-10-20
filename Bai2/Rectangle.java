package Bai2;

public class Rectangle {
    public float length;
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        if(length <= 0){
            this.length = 1;
        }
        this.length = length;
    }

    public float width;
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        if(width <= 0){
            this.width = 1;
        }
        this.width = width;
    }

    public Rectangle(){
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(float length, float width){
        if(length <= 0){
            this.length = 1;
        }
        this.length = length;

        if(width <= 0){
            this.width = 1;
        }
        this.width = width;
    }


    protected float calArea(){
        return (float) 2*(this.getLength()+this.getWidth());
    }

    protected float calPerimeter(){
        return this.getWidth()*this.getLength();
    }


    public String toString(){
        return String.format("(%.0f,%.0f)", this.getLength(), this.getWidth());
    }

}
