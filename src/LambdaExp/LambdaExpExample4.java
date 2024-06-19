package LambdaExp;

interface Sayable2{
     String say(String name);
}
public class LambdaExpExample4 {
    public static void main(String[]args){

        // Lambda expression with single parameter.

        Sayable2 s3 = (name) -> {
            return "Hello " +name;
        };
        System.out.println(s3.say("Shruti"));

    }
}

