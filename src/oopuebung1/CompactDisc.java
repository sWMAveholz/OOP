package oopuebung1;

import java.util.Arrays;
import java.util.Comparator;

public class CompactDisc implements Comparable<CompactDisc> {

    private final static String[] TO_REMOVE = {"der", "die", "das", "ein", "eine", "einer", "eines", "the", "a"};

    private String interpret;
    private String titel;
    private int erscheinungsjahr;
    private String plattenlabel;

    public CompactDisc(String interpret, String title, int erscheinungsjahr, String plattenlabel){
        this.interpret = interpret;
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.plattenlabel=plattenlabel;
    }

    public String getInterpret(){
        return interpret;
    }

    public String getTitel() {
        return titel;
    }

    public int getErscheinungsjahr(){
        return erscheinungsjahr;
    }

    public String getPlattenlabel() {
        return plattenlabel;
    }

    @Override
    public String toString(){
        return "Interpret: " + interpret + "Titel: " + titel + "Erscheinungsjahr: " + erscheinungsjahr + "Plattenlabel: " +plattenlabel;
    }

    @Override
    public int hashCode() {
        int result = (interpret == null) ? 0 : interpret.toLowerCase().hashCode();
        result = 31 * result + ((titel == null) ? 0 : titel.toLowerCase().hashCode());
        return result;
    }

    @Override
    public int compareTo(CompactDisc other) {
        String[] toRemove = Arrays.copyOf(TO_REMOVE,TO_REMOVE.length);
        Arrays.sort(toRemove);

        String interpretLC = this.interpret.toLowerCase();
        String otherinterpretLC = other.interpret.toLowerCase();
        String interpretFT = interpretLC.split(" ")[0];
        String otherinterpretFT = otherinterpretLC.split(" ")[0];

        if (Arrays.binarySearch(toRemove,interpretFT)>=0){
            interpretLC = interpretLC.substring(interpretFT.length());
        }

        if (Arrays.binarySearch(toRemove, otherinterpretFT)>=0){
            otherinterpretLC = otherinterpretLC.substring(otherinterpretFT.length());

        }

        return interpretLC.trim().compareTo(otherinterpretLC.trim());
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }

        CompactDisc other = (CompactDisc) obj;
        if(this.interpret==null){
            if (other.interpret != null) return false;
        }
        else if(!this.interpret.toLowerCase().equals(other.interpret.toLowerCase()))return false;

        if(this.titel == null){
            if (other.titel !=null) return false;
        }
        else if(!this.titel.toLowerCase().equals(other.titel.toLowerCase())) return false;
        return true;
    }


}
