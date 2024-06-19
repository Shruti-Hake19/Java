package Assignments;

import java.util.ArrayList;
import java.util.List;

/*Q.5 Take the ArrayList with 5-even numbers.
        i. Print the sum of all numbers.
        ii. print the avg of all numbers.*/

public class Q5 {
    public static void main(String[]args){

        List<Integer> Numbers = List.of(2,4,6,8,10);

        int sum=0;
        for (int i = 0; i<Numbers.size() ; i++)
        {
            sum = Numbers.get(i);
        }
       System.out.println(Numbers);
        System.out.println(sum);

    }
}
