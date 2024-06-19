package LambdaExp;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[]args){

        ArrayList <Integer> num = new ArrayList<>();
        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);

        num.forEach( (n) -> {System.out.println(n);} ); //lambda expression
    }
}
