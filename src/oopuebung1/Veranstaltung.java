package oopuebung1;

public class Veranstaltung implements Besuchbar {

    private String name;
    private String semester;

    private Student[] studenten;
    private Dozent dozent;

    public Veranstaltung(String name, String semester){
        this.name = name;
        this.semester = semester;
    }

    @Override
    public Termin getTermin() {
        return null;
    }

    public String toString(){
        return null;

    }
}
