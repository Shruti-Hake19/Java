package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist1 {
    public static <abc> void  main(String[]args){

        Student s1 = new Student("Shruti",1,100);
        Student s2 = new Student("Sakshi",2,200);
        Student s3 = new Student("Priya",3,300);

        LinkedList<Student> sd = new LinkedList<>(List.of(s3,s2,s1));

        Iterator itr = sd.iterator();
        while (itr.hasNext())
        {
            Student st =(Student) itr.next();
          System.out.println(st.stdId+ " " +st.stdName+ " " +st.stdRollno);
        }
        }
    }

