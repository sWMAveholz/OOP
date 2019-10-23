package oopuebung1;
import java.util.Random;

public class TestRandom {
    public static void main(String[]args){
        Random random = new Random();

        int AnzahlKopf = 0;
        for (int l = 0; l<100000; l++ ){
            if (random.nextDouble()<0.5){
                AnzahlKopf++;
            }
        }

        System.out.println("Anzahl Kopf: " +AnzahlKopf + "\nAnzahl Zahl: " + (100000-AnzahlKopf));
    }
}
