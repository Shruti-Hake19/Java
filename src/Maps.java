import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static void main(String[]args){

        HashMap<Integer,String> collmap = new HashMap<>();

        collmap.put(1,"Java");
        collmap.put(2,"c#");
        collmap.put(3,"Ruby");

        //System.out.println(collmap);

        HashMap<Integer,String> CollNew = new HashMap<>(collmap);
        CollNew.put(5,"Test");
       // System.out.println(CollNew);


        LinkedHashMap<Integer,String> Linkmap = new LinkedHashMap<>(Map.of(12,"Shruti",13,"Hake"));
       // System.out.println(CollNew);
       // System.out.println(Linkmap);

        HashMap<Integer,String> obj = new HashMap<>();
        Linkmap.putAll(collmap);
        System.out.println(Linkmap);
    }
}
