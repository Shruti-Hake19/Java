package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamMapMethodEx {
    public static void main(String[]args){

        //Integer
        List<Integer> marks = Arrays.asList(45,80,67,10);
        marks.stream()
                .map( mark -> mark + 2)    //add +2
                .forEach( m -> System.out.println(m));

        Collections.sort(marks);
        System.out.println(marks);



         //String
        List<String> names = Arrays.asList("som","kedar","Badri","Raj","Aar");
        names.stream()
                .map( name -> name + "nath")
                .forEach( n -> System.out.println(n));

            //Data Sort
            //1st approach : (Collections.sort())
           Collections.sort(names);
           System.out.println("sorting ascending" +names);

           System.out.println("***********************");

           Collections.sort(names,Collections.reverseOrder());
           System.out.println("Sorting descending By Collections" +names);

           //or
          Collections.sort(names, Comparator.reverseOrder());
          System.out.println("Sorting descending By Comparator" +names);






    }
}
