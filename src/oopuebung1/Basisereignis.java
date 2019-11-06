package oopuebung1;

public class Basisereignis extends Knoten {
    protected boolean wert;

    @Override
    public Boolean getWert() {
        return wert;
    }

    public void setWert(boolean wert) {
        this.wert = wert;
    }

    public Basisereignis(boolean wert){
        this.wert = wert;
    }
}
