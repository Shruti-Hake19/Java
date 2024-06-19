package Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sum {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Set.of(12,34,56,78,80));
        System.out.println(lhs);
        int sum=0;

        for(Integer in:lhs)
        {
            sum = sum+in;
        }
        System.out.println(sum);
    }

}