package Constructorss;

//Program to demonstrate the use of the parameterized constructor.

public class ParameterizedEx {

    int id;
    String name;

    //create a parameterized constructor
    ParameterizedEx(int i,String n){
     id=i;
     name=n;
    }

    //method to display the values
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[]args){

        //creating objects and passing values
        ParameterizedEx p1 = new ParameterizedEx(1,"Shruti");
        ParameterizedEx p2 = new ParameterizedEx(2,"Pooja");

        //calling method to display the values of object
        p1.display();
        p2.display();
    }
}
