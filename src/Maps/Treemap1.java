package Maps;

import Set.Employee;

import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {
    public static void main(String[]args){

        TreeMap<Integer, Employee> a = new TreeMap<>();

        Employee ob1 = new Employee(3, "Shruti", 25000);
        Employee ob2 = new Employee(2, "Priti", 2000);
        Employee ob3 = new Employee(1, "Sakshi", 25000);

        a.put(3,ob1);
        a.put(1,ob2);
        a.put(2,ob3);
        System.out.println(a);

        // Set Integer>keys=a.keySet();

        for(Map.Entry<Integer,Employee> ob:a.entrySet())
        {
            System.out.println(ob.getKey());
            Employee e = ob.getValue();
            System.out.println(e.empid+" " + e.empName+" " + e.empSalary) ;
        }
    }
}
