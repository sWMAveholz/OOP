package oopuebung1;

import java.io.IOException;
import java.util.Scanner;

public class Sekunden {

    public static void main(String[]args){
       int Stunden, Minuten, Sekunden;

       Scanner scanner = new Scanner(System.in);
       System.out.println("Stunden eingeben: ");
       Stunden = scanner.nextInt();
       System.out.println("Minuten eingeben: ");
       Minuten = scanner.nextInt();

       Sekunden = Stunden * 60 * 60 + Minuten * 60;

       System.out.println("Ergebnis: " + Sekunden);
    }
}
