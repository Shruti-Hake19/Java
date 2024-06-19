package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Q.9  Write a java program add String
"Java" 10-times into ArrayList./
 */
public class Q9 {
    public static void main(String[]args){
        ArrayList <String> List1  = new ArrayList<>(10);

       // Arrays.asList("Python","Javascript");

//        List1.add("python");
//         List1.add("Javascript");
        //System.out.println("ArrayList " +List1);


        // adding "java" 10-times in arraylist

        for (int i=0 ; i<10 ; i++)
        {
            List1.add("Java");
        }
        System.out.println(List1);


    }
}
