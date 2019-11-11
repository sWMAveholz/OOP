package oopuebung1;

import java.util.Comparator;

public class YearOfPublicationComparator implements Comparator<CompactDisc>{


    @Override
    public int compare(CompactDisc c1, CompactDisc c2) {

        if(c1.getErscheinungsjahr()<c2.getErscheinungsjahr()) return -1;
        else if(c1.getErscheinungsjahr()>c2.getErscheinungsjahr()) return 1;
        else return 0;
    }
}
