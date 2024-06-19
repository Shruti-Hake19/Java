package Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {

        LinkedList<Integer> obj = new LinkedList<>(List.of(20, 50, 10, 30, 40));

        System.out.println("***** Before reverse order *****");
        System.out.println(obj);

        System.out.println("****** After Reverse Order  ******");

        Collections.reverse(obj);

        for (Integer ob : obj) {
            System.out.println(ob);
        }

    }
}