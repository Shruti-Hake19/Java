package Set;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap1{
public static void main(String[]args){
    TreeMap<Integer,String> t = new TreeMap<>();
    t.put(10,"java");
    t.put(11,"java");
    t.put(12,"java");
    t.put(13,"java");
    t.put(14,"java");

    SortedMap<Integer,String> ab = t.subMap(11,12);
    System.out.println(ab);

    SortedMap<Integer,String> h = t.headMap(13);
    System.out.println(h);

    SortedMap<Integer,String> sm = t.tailMap(11);
    System.out.println(sm);

   // Collections.sort(t.comparator.thenComparing());

}
}


