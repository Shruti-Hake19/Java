package Constructorss;

public class ConstructorEx1 {
    int x;

    // below is a class constructor for the ConstructorEx1 class
    public ConstructorEx1(){

        int x=5 ; // Set the initial value for the class attribute x
    }

    public static void main(String []args){

        ConstructorEx1 obj = new ConstructorEx1(); // Create an object of class ConstructorEx1 (This will call the constructor)
        System.out.println(obj.x);
    }
}
