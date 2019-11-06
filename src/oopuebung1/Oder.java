package oopuebung1;

public class Oder extends ErweiterbarerKnoten {


    @Override
    public Boolean getWert(){
        Boolean erg = false;
        for(Knoten k : super.unterknoten){
            erg = erg||k.getWert();
        }
        return erg;
    }
}
