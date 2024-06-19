package Aggregations;

public class Student {

    int rollNo;
    String name;
     Address1 address1;

     public Student(int rollNo, String name,Address1 address1){

         this.rollNo=rollNo;
         this.name=name;
         this.address1=address1;
     }

     void print(){
         System.out.println(rollNo + " " + name + " " + address1.bNo + " " + address1.city + " " +address1.State + " " + " bNo is :" +address1.country);
     }

     public static void main(String[]args){

         Address1 add = new Address1("Nagar","Maharashtra","India",200);
         Student s1 = new Student(100,"Kranti",add);

         s1.print();

     }


}
