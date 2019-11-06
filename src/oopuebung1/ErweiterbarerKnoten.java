package oopuebung1;

abstract public class ErweiterbarerKnoten extends Knoten {

    protected Knoten[] unterknoten;

    public ErweiterbarerKnoten(){
        this.unterknoten=new Knoten[0];
    }

    public ErweiterbarerKnoten addKnoten(Knoten k){
        Knoten[] neueUnterknoten = new Knoten[unterknoten.length+1];
        for (int i = 0;i<unterknoten.length;i++){
            neueUnterknoten[i]=unterknoten[i];
        }
        neueUnterknoten[unterknoten.length]=k;
        this.unterknoten=neueUnterknoten;
        return this;
    }
}
