package classAndObject;

//Program to demonstrate the use of an instance variable
// which get memory each time when we create an object of the class.

public class Counter {
      int count=0; //will get memory each time when the instance is created
    int count2=1;
    Counter(){

        count++; //incrementing value
        count2--;  //decrementing value

        System.out.println(count);
        System.out.println(count2);
    }
    public static void main(String[]args){
        Counter c1= new Counter();

    }
}
