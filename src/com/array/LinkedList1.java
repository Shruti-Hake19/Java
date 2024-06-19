package com.array;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main (String[]args) {

        LinkedList<String> obj = new LinkedList<>();
        obj.add("Shruti");
        obj.add("Priti");
        obj.add("Sakshi");
        obj.add("Hake");
        obj.add("Vaishnavi");
        for (String str : obj)

        System.out.println("Forword Direction");
        ListIterator<String> str=obj.listIterator();

        while (str.hasNext()){

            System.out.println(str.next());
        }

        System.out.println("Backword Direction");

        while ((str.hasPrevious()));

        System.out.println(str.previous());
    }

}
