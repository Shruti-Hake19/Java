package Test;
import java.util.HashSet;
import java.util.*;
public class Q2 {

    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println("Size of HashSet :   "+hs.size());
        int max=0;
        int min=0;

        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num > max) {
                max = num;
            }
            min=Collections.min(hs);
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

}
