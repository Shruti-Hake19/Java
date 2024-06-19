package classAndObject;

//Program to demonstrate the use of static variable
public class StaticStudent1 {

    int rollNo; //instance variable
    String name;
   static String college = "DeogiriCollege";  //static variable


     //  constructor
    StaticStudent1(int r, String n){
      rollNo = r;
      name = n ;
    }

    //method to display the values
    void disp(){
        System.out.println(rollNo+ "  " +name+ " " +college);
    }

    public static void main(String[]args){
        StaticStudent1 s = new StaticStudent1(100,"Kranti");
        StaticStudent1 s2 = new StaticStudent1(200,"Bhakti");

     //we can change the college of all objects by...
//        StaticStudent1.college="MGM College";

        s.disp();
        s2.disp();
    }
}
