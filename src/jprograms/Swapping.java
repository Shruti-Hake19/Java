package jprograms;

import java.util.Scanner;

public class Swapping {
    public static void main(StringDeclare[]args){
        int x,y,temp;
        Scanner swap=new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x=swap.nextInt();
        y= swap.nextInt();

        System.out.println("Before swapping ");
         System.out.println(+x);
         System.out.println(+y);

         temp=x;
         x=y;
         y=temp;

       System.out.println("After swapping:");
       System.out.println( +x);
       System.out.println( +y);
    }

}
