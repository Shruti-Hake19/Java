package InitilizingObject;

//2.Initialization through method

public class Employee {

    int empId;
    String empName;

    void insertRecord(int id,String name){
        empId=id;
        empName= name;
    }

    void displayRecord(){
        System.out.println(empId+" "+empName);
    }

    //OR
    public static void main(String[]args){

      Employee e1 = new Employee();
      Employee e2 = new Employee();

      e1.insertRecord(1,"Shruti");
      e2.insertRecord(2,"Priti");

      e1.displayRecord();
      e2.displayRecord();

    }

}
