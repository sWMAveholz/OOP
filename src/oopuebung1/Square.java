package oopuebung1;

public class Square extends Rectangle {

    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color){
        super(side,side,color);
    }

    public double getSide(){
        return super.width;
    }

    public void setSide(double side){
        super.length = side;
        super.width=side;
    }

    @Override
    public void setWidth(double side){
        super.length = side;
        super.width=side;
    }

    @Override
    public void setLength(double side){
        super.length = side;
        super.width = side;
    }

    @Override
    public String toString(){
        return "Square: Side " + this.getSide() + " Sub of Rectangle" + super.toString();
    }

}
