package oopuebung1;

public class Employee {
    private float monatsgehalt;
    private String name;

    public Employee(String n){
        name = n;
        monatsgehalt = 0;
    }

    public Employee(String n, float gehalt){
        name = n;
        monatsgehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public float getMonatsgehalt() {
        return monatsgehalt;
    }

    public void setMonatsgehalt(float s){
        if (s<50000){monatsgehalt = s;}
        else monatsgehalt = monatsgehalt;
    }

    public String getInfo(String n, float s){
        return n + "|" + s;
    }
}
