package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda1 {
    public static void main(String[]args){
       // List<Integer> numbers = Arrays.asList(10,20,30,40,50);
       List<Integer> numbers= List.of(10,20,30,50);
       numbers.forEach(num->System.out.println(num));

      // List<Integer> emp
    }
}
