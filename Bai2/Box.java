package Bai2;

public class Box extends Rectangle{
    public float height;
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        if(height <= 0){
            this.height = 1;
        }
        this.height = height;
    }

    public Box(){
        this.width = 1;
        this.length = 1;
        this.height = 1;
    }

    public Box(float width, float length, float height){
        super(width,length);
        if(height <= 0){
            this.height = 1;
        } 
        this.height = height;
    }

    @Override
    protected float calArea() {
        return 2*(this.getLength()*this.getWidth() + this.getWidth()*this.getHeight() + this.getHeight()*this.getLength());
    }

    public String toString(){
        return String.format("(%.0f,%.0f,%.0f)", this.getLength(), this.getWidth(), this.getHeight());
    }

    public float calVolume(){
        return this.getLength()*this.getWidth()*this.getHeight();
    }
    
}
