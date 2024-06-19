package classAndObject;

//Java Program to demonstrate the use of a static method.
public class StaticMethod1 {

    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of static variable
    static void change(){
        college = "mgm";
    }
    //constructor to initialize the variable
    StaticMethod1(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}

//Test class to create and display the values of object

    public static void main(String args[]){
        StaticMethod1.change();//calling change method
        //creating objects
        StaticMethod1 s1 = new StaticMethod1(111,"Riya");
        StaticMethod1 s2 = new StaticMethod1(222,"Priya");
        StaticMethod1 s3 = new StaticMethod1(333,"Soni");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}


