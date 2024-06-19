package oops;

//Example of instance initializer block

public class car {
    int speed;
    car(){
        System.out.println("The speed of car is : " +speed);
    }
    {
        speed = 90;
    }
    public static void main(String[]args){
        car c1 = new car();
        car c2 = new car();

    }
}
