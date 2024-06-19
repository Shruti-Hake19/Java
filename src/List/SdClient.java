package List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SdClient {
    public static void main(String[]args){

        Student ob1=new Student("Shruti",10,1);
        Student ob2=new Student("Priti",20,2);
        Student ob3=new Student("Hake",30,3);

         HashSet<Student> SData=new HashSet<Student>(List.of(ob3,ob1,ob2));


//        SData.add(ob1);
//        SData.add(ob2);
//        SData.add(ob3);


        System.out.println("********");

        Iterator itr = SData.iterator();

        while(itr.hasNext())
        {
      Student s =(Student) itr.next();
            System.out.println(s.stdId+" "+s.stdName+ "  "+s.stdRollno);
        }

    }
}