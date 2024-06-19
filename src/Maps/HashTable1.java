package Maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTable1 {
    public static void main(String[] args) {

        Hashtable<Integer,String> collehash = new Hashtable<>(Map.of(10,"java",20,"JavaScript",30,"C programming"));

        for (Map.Entry<Integer,String> collhash  :collehash.entrySet())
        {
            System.out.println(collhash);

        }
        System.out.println("Methods of Hashtable..Remove......");
        collehash.remove(20);
        System.out.println(collehash);

        System.out.println("*********Add***********");
        collehash.put(40,"Css");
        collehash.put(50,"Html");
        collehash.put(60,"C#");
        System.out.println(collehash);

        System.out.println("******** Updated value ******");
        collehash.put(40,"C++");
        System.out.println(collehash);

        System.out.println("**********Ckeck and Returns ************");
        collehash.contains(40);
        collehash.containsKey(70);
        collehash.containsValue("html");
        System.out.println(collehash);

}
}

