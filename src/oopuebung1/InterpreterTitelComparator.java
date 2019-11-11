package oopuebung1;

import jdk.management.resource.internal.UnassignedContext;

import java.util.Comparator;

public class InterpreterTitelComparator implements Comparator<CompactDisc> {
    @Override
    public int compare(CompactDisc c1, CompactDisc c2){
        int naturalOrder = c1.compareTo(c2);
        if(naturalOrder != 0) return naturalOrder;
        else return(c1.getTitel().compareTo(c2.getTitel()));
    }
}
