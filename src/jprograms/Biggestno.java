package jprograms;

import java.util.Scanner;

public class Biggestno {
    public static void main(StringDeclare[] args){
        Scanner big=new Scanner(System.in);
        System.out.println("Enter any three no.");
        int n1= big.nextInt();
        int n2=big.nextInt();
        int n3= big.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is biggest");
        }
        else if (n2>n1 && n2>n3) {
            System.out.println(n2+" is biggest");
        }
        else {
            System.out.println(n3+" is biggest");
        }

    }
}
