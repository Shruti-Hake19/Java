package List;

import java.util.*;

public class SortAllWayEx {
    public static void main(String[]args){

        //1st Approach : Collections.sort

        List<String> names = Arrays.asList("Shruti","Priti","Sakshi","Rani","Aarti");

        System.out.println("Before Sprting" +names);
//
//        Collections.sort(names);
//        System.out.println("Sorting ascending order" +names);
//
//        Collections.sort(names,Collections.reverseOrder());
//        System.out.println("sorting descending order by Collections" +names);
//
//        //or
//        Collections.sort(names, Comparator.reverseOrder());
//        System.out.println("sorting descending order by Comparator" +names);

          //2nd Approach : List.sort
           //
           //

           //
           //

         // names.sort((Comparator.reverseOrder()));
         // System.out.println("sorting descending order" +names);

          //3rd Approach : Stream.sort
           names.stream()
                   .sorted(Comparator.naturalOrder())
                   .forEach( name -> System.out.println(names));

           names.stream()
                   .sorted(Comparator.reverseOrder())
                   .forEach( n -> System.out.println(n));

    }
}
