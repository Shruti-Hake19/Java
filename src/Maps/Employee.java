package Maps;

    public class Employee implements Comparable<Set.Employee> {
        int empid;
        double empSalary;
        String empName;

        public Employee(int empid, String empName, double empSalary) {

            this.empid = empid;
            this.empName = empName;
            this.empSalary = empSalary;
        }

        @Override
        public int compareTo(Set.Employee ob) {
            //return Integer.compare(this.empid,ob.empid);
            return this.empName.compareTo(ob.empName);
            //  return Double.compare(ob.empSalary,this.empSalary);
        }
    }
