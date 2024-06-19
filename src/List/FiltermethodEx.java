package List;

import java.util.List;

public class FiltermethodEx {
    public static void main(String[]args){
        List<Integer> numbers = List.of(1,2,6,8,12,5,2);

        System.out.println("Filtering the even data and printing");
        numbers.stream()
                .filter(num1 -> num1 % 2 == 0)
                .forEach(num -> System.out.println(num));

        System.out.println("Filtering the even data and collect as list  format & printing");

//        List<Integer> listeven = numbers.stream()
//                .filter()
//                .forEach();


    }
}
