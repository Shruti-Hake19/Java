package Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TwoArrayList {
    public static void main(String[]args){
        ArrayList<String> str = new ArrayList<>(List.of("Shruti","Priti","Sakshi"));
        ArrayList<String> str2 = new ArrayList<>();
        str2.add("Radha");
        str2.add("Shweta");
        str2.add("Riya");
        str2.add("Shruti");

        str.addAll(str2);

        System.out.println(str);
        TreeSet<String> treset = new TreeSet<>(str);
        System.out.println(treset);


    }
}
