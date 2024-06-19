/*Q.1 Create two ArrayList of String type,
  then returns a List of common elements
    which are present in both Lists.*/



package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[]args){
        List <String> List1 = List.of("Shruti","Priti","Sakshi","Bhagyashree","abc");
        List <String> List2 = List.of("Shruti", "Pooja","Rani","Priti","abc");

        System.out.println("List1"+List1);
        System.out.println("List2"+List2);

        //common element

//        List1.retainAll(List2);
//        System.out.println("Common Elements" +List1);

        //or

        System.out.println("Common Elements:");
       System.out.println(List1.stream()
                .filter(List2::contains)
                .collect(Collectors
                        .toList()));


    }
}
