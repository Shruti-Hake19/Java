package jprograms;

import java.util.Scanner;

public class Loop {
    public static void main(StringDeclare[] args){
        int num=0;
        Scanner loop=new Scanner(System.in);
          // System.out.println("Enter a  number");
         //  int no= loop.nextInt();
        do {
            System.out.println("Enter +ve no");
        num= loop.nextInt();
        }while(num<=0);
        System.out.println("you have entered +ve no");
    }
}
