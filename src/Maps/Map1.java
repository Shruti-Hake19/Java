package Maps;

import Set.Employee;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {

        Map<Integer, Employee> collmap = new HashMap<>();

        Employee ob1 = new Employee(1, "Shruti", 25000);
        Employee ob2 = new Employee(2, "Priti", 2000);
        Employee ob3 = new Employee(3, "Sakshi", 25000);

//        System.out.println(collmap);
//        Set<Integer> Keys=collmap.keySet();

        collmap.put(1,ob1);
        collmap.put(2,ob2);
        collmap.put(3,ob3);

        //for(Map.Entry<Integer,Employee> obj : coll7map.entrySet());
        for (Map.Entry<Integer, Employee> obj: collmap.entrySet())
        {
            System.out.println(obj.getKey());
            Employee e = obj.getValue();
           // System.out.println(e.empid+" " + e.empName+" " + e.empSalary) ;
        }

        {

            //System.out.println(obj.)

        }

    }

}
