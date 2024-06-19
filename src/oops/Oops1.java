package oops;

public class Oops1 {
    public static void main(String args[]){

        Pen pen1 = new Pen();
        pen1.color="Blue";    //accessing properties
        pen1.type="Gel pen";

//        pen1.write();   //accessing method

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ballpen";

        pen2.print();  //two object (p1 & p2) access same method
        pen1.print();

        System.out.println("......................");

        pen1.write();  //one object access two different methods
        pen1.print();
    }


}
