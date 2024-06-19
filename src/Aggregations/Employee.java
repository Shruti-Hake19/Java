package Aggregations;

public class Employee {

    int id;
    String name;

    Address1 address1;

    public Employee(int id, String name,Address1 address1) {
        this.id = id;
        this.name = name;
        this.address1 = address1;
    }
        void display(){
            System.out.println(id + " " + name + " " + address1.bNo + " " + address1.city + " " + address1.State + " " + address1.country );
        }

        public static void main(String[]args){
            Address1 add1 = new Address1("Pune","Maharashtra","India",10);
        Employee emp = new Employee(101,"Shruti",add1);

        emp.display();

        }

    }

