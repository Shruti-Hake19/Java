package List;

import java.util.List;

public class filterdataEx {
    public static void main(String[]args){

        // filter the employee data , print the data

        List<Employee> emps = List.of(new Employee(101,"shruti",25000)
        ,new Employee(105,"priti",3000)
        ,new Employee(110,"Sakshi",20000));

        emps.stream()
                .filter( emp1 -> emp1.empName.startsWith("s"))
                .forEach( emp1 -> System.out.println(emp1));

        // filter the employee data,collect the data in list format.( Emp salary > 20000)

        // List<Employee> employees =

    }
}
