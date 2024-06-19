package oops;

abstract class CarAbstractEx {
    CarAbstractEx(){
        System.out.println("Car is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");}
}

//Creating a Child class which inherits Abstract class
class Thar extends CarAbstractEx{
    void run(){

        System.out.println("running safely..");
    }
}

//Creating a Test class which calls abstract and non-abstract methods

class TestAbstraction2{
    public static void main(String args[]){
        CarAbstractEx obj = new Thar();
        obj.run();
        obj.changeGear();
    }
}
