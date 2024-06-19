package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("Shruti");
        name.add("Priti");
        System.out.println(name);

        Iterator it= name.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
