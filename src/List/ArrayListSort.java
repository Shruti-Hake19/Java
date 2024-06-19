package List;

import Set.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {

        Set.Employee e1 = new Set.Employee(1, "Shruti", 25000);
        Set.Employee e2 = new Set.Employee(2, "Priti", 22000);

        Set.Employee e3 = new Set.Employee(3, "Sakshi", 23000);
        Set.Employee e4 = new Set.Employee(4, "Priya", 20000);

        ArrayList<Set.Employee> ob = new ArrayList<>(List.of(e4, e2, e1, e3));

        System.out.println("------Before Sorting----");

        for (Set.Employee emp : ob )
        {
            System.out.println(emp.empid+ " " +emp.empName+"  " +emp.empSalary);
        }

        System.out.println(("-----After Sorting------------"));
        Collections.sort(ob);
        for (Employee emp : ob )
        {
            System.out.println(emp.empid+ " " +emp.empName+"  " +emp.empSalary);
        }

    }

}
