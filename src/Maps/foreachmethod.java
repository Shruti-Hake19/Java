package Maps;

import Set.Employee;

import java.util.ArrayList;
import java.util.List;

public class foreachmethod {
    public static void main(String[]aregs){
        ArrayList<Integer> collfor = new ArrayList<>(List.of(10,40,20,50,30));
        collfor.forEach(System.out::println);

        System.out.println(" ************* ");

        ArrayList<Employee> emp = new ArrayList<>();

        Set.Employee ob1 = new Set.Employee(3, "Shruti", 25000);
        Set.Employee ob2 = new Set.Employee(2, "Priti", 2000);
        Set.Employee ob3 = new Set.Employee(1, "Sakshi", 25000);

        emp.add(1,ob1);
        emp.add(3,ob2);
        emp.add(2,ob3);

        System.out.println(emp);




    }
}
