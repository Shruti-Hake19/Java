package oops;

abstract class BikeAbstractEx1 {

    abstract void run();

}

class Honda4 extends BikeAbstractEx1 {
    void run() {
        System.out.println("running safely");
    }

    public static void main(String args[]) {
        BikeAbstractEx1 obj = new Honda4();
        obj.run();
    }
}