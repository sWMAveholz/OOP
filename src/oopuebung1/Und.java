package oopuebung1;

public class Und extends ErweiterbarerKnoten {


    @Override
    public Boolean getWert() {
        boolean erg=true;
        for(Knoten k : super.unterknoten){
            erg = erg && k.getWert();
        }
        return erg;
    }
}
