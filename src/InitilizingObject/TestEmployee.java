package InitilizingObject;

// OR for Employee class

public class TestEmployee {

    public static void main(String[]args){

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.insertRecord(100,"Rani");
        e2.insertRecord(200,"Priya");

        e1.displayRecord();
        e2.displayRecord();
    }
}
