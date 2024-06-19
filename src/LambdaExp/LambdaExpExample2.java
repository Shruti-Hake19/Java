package LambdaExp;

//here implement the above example with the help of Java lambda expression.
@FunctionalInterface  //It is optional

interface Drawable2{
     void draw();
}

public class LambdaExpExample2 {
    public static void main (String[]args){
        int width=30;

        //with lambda
        Drawable2 d2 = () -> {
            System.out.println("Drawing "+width);
        };
         d2.draw();
    }
}
