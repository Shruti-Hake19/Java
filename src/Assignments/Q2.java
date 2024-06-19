/*Q.2 Create two ArrayList of String type,
 then returns a List of common elements ,
 First List unique elements, Second List Unique Elements.*/

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {

        List<String> List1 = List.of("abc", "pqr", "xyz", "Shruti", "Priti","abc");
        List<String> List2 = Arrays.asList("abc", "pqr", "Sakshi","pqr");

        System.out.println("Common Elements are :");
        System.out.println(List1.stream()
                .filter(List2::contains)
                .collect(Collectors
                        .toList()));

//        List2.retainAll(List1);
//        System.out.println(List2);


        //List1 Unique Elements
        List<String> UniqueString1
                = List1.stream().distinct().collect(
                Collectors.toList());
         System.out.println("Unique strings in Listr1 are : ");

        for (int i = 0; i < UniqueString1.size(); ++i) {
           // System.out.println("Unique strings in Listr1 are : ");
            System.out.println(UniqueString1.get(i));
        }

        List<String> UniqueString2
                = List2.stream().distinct().collect(
                Collectors.toList());
        System.out.println("Unique strings in Listr2 are : ");
        for (int i = 0; i < UniqueString2.size(); ++i) {

            System.out.println(UniqueString2.get(i));
        }




    }
}
