package Set;
import java.util.*;
import java.util.HashSet;

public class ListMapSetEx {
    public static void main(String[]args){

        HashSet<String> nam = new HashSet <String>(List.of("Priti","Riya","Riya"));
        nam.add("Shruti");
        nam.add("Kranti");
        nam.add(null);
        System.out.println(nam);

         System.out.println("**********  By Using Iterator  ********");

        Iterator<String> abc= nam.iterator();

        while (abc.hasNext())
      {

            System.out.println(abc.next());

      }

        System.out.println("********  By Using For Loop  **********");

        nam.add("sssss");
        nam.remove("Riya");


           for(String Li:nam)
           {
              System.out.println(Li);
           }

    }
}
