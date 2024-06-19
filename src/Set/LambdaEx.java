package Set;

import List.Employee;

import java.util.HashSet;
import java.util.Set;

public class LambdaEx {
    public static void main(String[]args){
        Set<Employee> Emp = new HashSet<>();
        Employee ob1 = new Employee(1,"Shruti",25000);
        Employee ob2 = new Employee(2,"Priti",2000);
        Employee ob3 = new Employee(3,"Sakshi",25000);

        Emp.add(ob1);
        Emp.add(ob2);
        Emp.add(ob3);

        //Emp.forEach( e->System.out.println("empname"+Emp.));

    }

}
