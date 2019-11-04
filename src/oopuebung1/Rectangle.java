package oopuebung1;

public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String col){
        super(col);
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width + 2 * length);
    }

    @Override
    public String toString(){
        return "Rectangle: Length: " + this.getLength() + " Width: " + this.getWidth() + " Sub of: " + super.toString();
    }


}
