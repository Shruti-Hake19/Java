package jprograms;

import java.util.Scanner;

// addition of two numbers
public class Addition {
    public static void main(StringDeclare[]args){
        Scanner add=new Scanner(System.in);
        System.out.println("Enter first no.");
        int num1= add.nextInt();
        System.out.println("Enter second no.");
        int num2= add.nextInt();
        System.out.println("addition is:" +(num1+num2));
    }
}
