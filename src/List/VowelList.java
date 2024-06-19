package List;
import jprograms.Vowel;

import javax.swing.plaf.basic.BasicListUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class VowelList implements Comparable {
    public static <vowels, v> void main(String[]args){

        List<String> vowels = new ArrayList<>();

        vowels.add("A");
        vowels.add("O");
        vowels.add("E");
        vowels.add("I");

        System.out.println(vowels);

        for(String v : vowels )
        {
           System.out.println(v);

        }

        System.out.println("***************");
        System.out.println("-------   After Sorting   ----------");

        Collections.sort(vowels);
       // Collections.addAll(vowels);
        //Collections.max(vowels);


        Iterator itr = vowels.iterator();

        while (itr.hasNext())
        {
          vowels v = (vowels) itr.next();
          System.out.println(v);
        }



    }

    @Override
    public int compareTo(Object v) {
        return 0;
    }
}
