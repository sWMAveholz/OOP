package oopuebung1;

public class Circle extends Shape {

    final private double radius;

    public Circle(double rad){
        this.radius = rad;
    }

    public Circle(double rad, String col){
        super(col);
        this.radius = rad;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "Circle: Radius " + radius + "sub of" + super.toString();
    }


}
