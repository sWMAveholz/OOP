package oopuebung1;

public class Startup {
    public static void main(String[]args){
        Basisereignis a = new Basisereignis(true);
        Basisereignis b = new Basisereignis(false);
        Basisereignis c = new Basisereignis(true);

        Oder baum = new Oder();
        baum.addKnoten(a).addKnoten(new Und().addKnoten(b).addKnoten(c));
        System.out.println(baum);

        Und baum2 = new Und();
        baum2.addKnoten(a).addKnoten(new Und().addKnoten(b).addKnoten(c));
        System.out.println(baum2);

        Und baum3 = new Und();
        baum3.addKnoten(a).addKnoten(new Oder().addKnoten(b).addKnoten(c));
        System.out.println(baum3);
    }
}
