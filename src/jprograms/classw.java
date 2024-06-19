package jprograms;

import java.util.Scanner;

public class classw {
    public static void main(StringDeclare[]args){
        int score;
        Scanner ob1=new Scanner(System.in);
        System.out.println("Enter score");
        score= ob1.nextInt();
        if(score>60){
            System.out.println("you have passed...");
        }
       /* else{
            System.out.println("you have failed");
        }*/
    }
}
