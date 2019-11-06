package oopuebung1;

public class Dozent extends Person implements Besuchbar{

    private Veranstaltung[] gehalteneVeranstaltung;

    public Dozent(String vorname, String nachname){
        super(vorname,nachname);
    }

    public Termin getTermin(){
        return null;
    }
}
