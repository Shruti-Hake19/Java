package LambdaExp;

//Java Lambda Expression Example: Multiple Parameters
interface Addable{

    public int add(int a,int b);
}

public class LambdaExpExample5 {
    public static void main(String[]args) {

        // Multiple parameters in lambda expression
        Addable a1 = (a, b) -> (a + b);
        System.out.println(a1.add(10, 20));


        // Multiple parameters with data type in lambda expression
        Addable a2 = (int a, int b) -> (a + b);
        System.out.println(a2.add(100,200));

    }
}
