package com.array;

public class ArrayMethod {

    int[] m1()
    {
        System.out.println("M1 method....");
        int [] a = {13,22,45};
        return a;
    }

    void m2(double d[])
    {
        System.out.println("M2 method....");
        for ( double dd  : d)
        {
            System.out.println(dd);
        }
    }


    public static void main(String[] args) {
        ArrayMethod a1 = new ArrayMethod();
        int[] aryint = a1.m1();
        for (int intp : aryint) {
            System.out.println(intp);
        }
        double[] arrd = {16.6, 34.6, 67.8};
        a1.m2(arrd);
    }
}
