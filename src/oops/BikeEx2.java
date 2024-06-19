package oops;

//Creating a child class
public class BikeEx2 extends VehicleEx2{


    //defining the same method as in the parent class
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[]args){

        BikeEx2 obj2 = new BikeEx2(); //creating object
        obj2.run(); //calling method


    }
}
