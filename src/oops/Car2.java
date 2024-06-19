package oops;

public class Car2 {

    int speed;

    Car2(){
        System.out.println("Constructor is invoked..");
    }
    {
        System.out.println("instance initializer block invoked");
    }
    public static void main(String[]args){
        Car2 c1 = new Car2();
    }

}
