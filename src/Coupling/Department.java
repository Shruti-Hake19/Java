package Coupling;

public class Department {
    public static void main(String[] args) {
        People p = new Student();
        p.print();
        People p1 = new Employee();
        p1.print();

    }
}
