package Set;

import java.util.Comparator;

public class Employee implements Comparable<Employee>  {
    public int empid;
    public double empSalary;
    public String empName;
    public Employee(int empid,String empName,double empSalary){

        this.empid=empid;
        this.empName=empName;
        this.empSalary=empSalary;
    }

    @Override
    public int compareTo(Employee ob) {
        //return Integer.compare(this.empid,ob.empid);
       return this.empName.compareTo(ob.empName);
    //  return Double.compare(ob.empSalary,this.empSalary);
    }
}
