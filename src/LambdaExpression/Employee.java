package LambdaExpression;

public class Employee {
    int empid;
    double empSalary;
    String empName;

    public Employee(int empid, String empName, double empSalary) {

        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empSalary=" + empSalary +
                ", empName='" + empName + '\'' +
                '}';
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
