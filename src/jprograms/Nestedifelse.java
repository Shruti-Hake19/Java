package jprograms;

import java.util.Scanner;

public class Nestedifelse {
    public static void main(StringDeclare[] args) {
        int num;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number");
        num = ob.nextInt();
        if (num >= 1) {
            System.out.println("number is positive");

            if (num / 2 == 0) {
                System.out.println(" and even");
            }
         else {
            System.out.println(" and odd");
        }
    }

        else{
                System.out.println("number is negative");
            }
        }
    }
