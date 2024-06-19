package oops;

public class Address {
  int bNo;
  String area;
  String city;
  Address(int bNo, String city, String area){
    this.bNo=bNo;
    this.area=area;
    this.city=city;

  }
  void Print(){
    System.out.println(bNo);
    System.out.println(area);
    System.out.println(city);
  }
  }



  class Employee {
  int id;
  String name;
  String address;
  double salary;

  void Disp(){
    System.out.println( "id: " +id);
    System.out.println("name: " +name);
    System.out.println("address: " +address);
    System.out.println("salary: " +salary);
  }

  Employee(int id,String name, String address,double salary){
    this.id=id;
    this.name=name;
    this.address=address;
    this.salary=salary;
  }


public static void main(String[]args){
Employee ob=new Employee(1,"shruti","pune",20000);
ob.Disp();
Address add=new Address(100,"Pune","Warje");
add.Print();
  }
}


