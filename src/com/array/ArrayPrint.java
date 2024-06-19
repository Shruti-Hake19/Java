package com.array;

public class ArrayPrint {

    public static void main(String[] args) {

        int[] numArray = new int[4];

        String [] strarray = {"aaa", "bbb"};

        //print the data
        //first approch
        numArray[0] = 10;
        numArray[1] = 20;
        numArray[2] = 30;
        numArray[3] = 40;

        System.out.println(numArray[0]);
        System.out.println(numArray[1]);
        System.out.println(numArray[2]);
        System.out.println(numArray[3]);

        System.out.println("**************");

        // second approch
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
        System.out.println("**************");

        // third approch
        for (int a : numArray)
        {
            System.out.println(a);
        }
        System.out.println("**************");
        for (String s:strarray)
        {
            System.out.println(s);
        }
    }
}