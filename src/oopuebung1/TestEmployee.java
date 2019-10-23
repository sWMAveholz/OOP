package oopuebung1;
import java.io.IOException;
import java.util.Scanner;

public class TestEmployee {


    public static void main(String[] args){
        Employee m1 = new Employee("AA");
        Employee m2 = new Employee("BB");
        Employee m3 = new Employee("CC");

        Employee[] emps = new Employee[3];
        emps[0]=m1;
        emps[1]=m2;
        emps[2]=m3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gehalt m1: ");
        m1.setMonatsgehalt(scanner.nextFloat());
        System.out.println("Gehalt m2: ");
        m2.setMonatsgehalt(scanner.nextFloat());
        System.out.println("Gehalt m3: ");
        m3.setMonatsgehalt(scanner.nextFloat());

        float sum =0;
        for(Employee e : emps){
            sum += e.getMonatsgehalt();
        }

        int average = Math.round(sum/emps.length);
        System.out.println("Durchschnittsgehalt: " + average);
    }
}
