package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[]args){

        HashSet <Employee> Emp = new HashSet<>();

        Employee ob1 = new Employee(1,"Shruti",25000);
        Employee ob2 = new Employee(2,"Priti",2000);
        Employee ob3 = new Employee(3,"Sakshi",25000);

        Emp.add(ob1);
        Emp.add(ob2);
        Emp.add(ob3);
        //System.out.println(Emp);

        Iterator itr = Emp.iterator();
        while (itr.hasNext())
        {
            Employee e =(Employee) itr.next();
            System.out.println(e.empid+" "+e.empName+" "+e.empSalary);
        }

    }
}
