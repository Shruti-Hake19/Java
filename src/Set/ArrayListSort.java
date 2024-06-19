package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Shruti", 25000);
        Employee e2 = new Employee(2, "Priti", 22000);

        Employee e3 = new Employee(3, "Sakshi", 23000);
        Employee e4 = new Employee(4, "Priya", 20000);

        ArrayList<Employee> ob = new ArrayList<>(List.of(e4, e2, e1, e3));

        System.out.println("------Before Sorting----");

for (Employee emp : ob )
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