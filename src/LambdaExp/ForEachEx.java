package LambdaExp;

import java.util.ArrayList;

public class ForEachEx {
    public static void main(String[]args){

        ArrayList <Integer> list = new ArrayList<>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(60);

        list.forEach( (s) -> System.out.println(s));

        }
    }

