package oops;

//Creating a child class
public class BikeOverridingEx1 extends VehicleOverridingEx1 {

    public static void main(String[] args) {

        //creating an instance of child class
        BikeOverridingEx1 obj = new BikeOverridingEx1();

        //calling the method with child class instance
        obj.run();


    }
}