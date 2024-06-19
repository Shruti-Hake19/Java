package jprograms;

import java.util.Scanner;

public class Evenodd {
    public static void main(StringDeclare[]args){
        Scanner eveodd=new Scanner(System.in);
        System.out.println("Enter a numbers");
        int n1= eveodd.nextInt();
        if(n1/2==0){
           System.out.println("number is even");
        }
        else{
            System.out.println("no.is odd");
        }
    }
}
