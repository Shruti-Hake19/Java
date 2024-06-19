package SortData;

import java.util.Arrays;
import java.util.List;

public class MethodRefEx {
    public static void main(String[]args){

        List <String> names = List.of("Shruti","Priti","Sakshi","Rani");

        //By using Method reference
        names.forEach(n -> System.out.println(n));

        System.out.println("*****************");

        // By using method reference
        names.forEach(System.out::println);

        List<Employee> emp = Arrays.asList(new Employee(101,"Shruti",30000)
                ,new Employee(105,"Priti",25000)
                ,new Employee(110,"Rani",10000));

        emp.forEach(e -> System.out.println(e));
        System.out.println("****************");
        emp.forEach(System.out::println);

        System.out.println("**************");
        List<Integer> numbers = Arrays.asList(2,4,5,6,1,3,9);
        numbers.sort(Integer::compareTo);
        numbers.forEach(System.out::println);

        System.out.println("******************");
       // names.sort(String::compareTo);
    }
}
