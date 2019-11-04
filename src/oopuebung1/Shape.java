package oopuebung1;

public class Shape {
    private String color;
    final private double lineWidth;

    public Shape(){
        this.lineWidth = Math.random()*2;
        this.color = "red";
    }

    public Shape(String c){
        this();
        this.color = c;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        String answer = "Color: " + color + " Line Width: " + lineWidth;
        return answer;
    }
}
