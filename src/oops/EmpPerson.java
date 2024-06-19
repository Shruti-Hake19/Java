package oops;

public class EmpPerson extends PersonSuperEx1{
    float salary;
    EmpPerson(int id, String name,float salary) {
        super(id, name); //reusing parent constructor
        this.salary = salary;
    }
    void display(){
        System.out.println(id+ " " + name + " " + salary);
    }
}
