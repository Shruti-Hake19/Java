package jprograms;

import java.util.Scanner;

public class Exception {
    public static void main(String[]a){
        System.out.println("java cls");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        System.out.println("Enter a number");
        int num1= sc.nextInt();
        System.out.println(num/num1);
        int c=num/num1;

        try {
          c= num/num1;
        }
        catch (ArithmeticException e){
            System.out.println("num cant divided by 0" );
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
