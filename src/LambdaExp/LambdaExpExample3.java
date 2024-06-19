package LambdaExp;

//A lambda expression can have zero or any number of arguments.
interface Sayable{
    public String say();
}

public class LambdaExpExample3 {
    public static void main(String[]args){
        Sayable s = () -> {
            return "I have nothing to say anything";
        };
        System.out.println(s.say());
    }
}
