package com.array;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int [] int1 = {10,40,20,90,80,60};

        int[] int2 = Arrays.copyOfRange(int1,3,int1.length);
        int[] int3 = new int[int1.length];
        System.arraycopy(int1,1,int3,1,3);
        for (  int j : int3)
        {
            System.out.println(j);
        }
        Arrays.sort(int2);
        for (  int i : int2)
        {
            System.out.println(i);
        }
        int[] source = {1, 2, 3, 4, 5};
        int[] target = new int[3];
        System.arraycopy(source, 1, target, 0, 3); // Copy elements 2, 3, and 4 to the target array
        for (  int v : target)
        {
            System.out.println(v);
        }

    }
}
