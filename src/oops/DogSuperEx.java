package oops;

public class DogSuperEx extends AnimalSuperEx {

    String color = "White";

    void printcolor(){
        System.out.println("The color of child class is "+color); //prints color of Dog class
        System.out.println("The color of the parent class is " + super.color);   //prints color of Animal class
    }
    public static void main (String[]args){
        DogSuperEx d = new DogSuperEx();
        d.printcolor();
    }
}
