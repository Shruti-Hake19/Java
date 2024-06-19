package LambdaExp;

//Java Lambda Expression Example: with or without return keyword
interface Addable2{
    int add(int a,int b);
}
public class LambdaExpExample6 {
    public static void main(String[]args){

        // Lambda expression without return keyword.
        Addable2 ad2 = (a,b) -> (a+b);
        System.out.println(ad2.add(30,40));

        // Lambda expression with return keyword.
        Addable2 ad3 = (int a, int b) -> {
            return (a+b);
        };
        System.out.println(ad3.add(50,50));
    }
}
