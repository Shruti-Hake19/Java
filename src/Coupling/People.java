package Coupling;


/// Loose coupling
public interface People {
     void print();

}

class Student implements People {

    public void print() {
        System.out.println("Student class...");
    }
}

    class Employee implements People{


        public void print()
        {
            System.out.println("Employee class.....");
        }
    }


