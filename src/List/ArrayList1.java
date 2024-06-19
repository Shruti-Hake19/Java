package List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayList1 {
    public static <obj> void main(String[] args) {

        Student s1 = new Student("Shruti", 1, 100);
        Student s2 = new Student("Shreya", 2, 200);
        Student s3 = new Student("Sakshi", 3, 300);
        Student s4 = new Student("Kranti", 4, 400);

        ArrayList<Student> stud = new ArrayList<>(List.of(s4, s2, s3, s1));


        Iterator a = stud.iterator();

        while (a.hasNext()) {
            Student s = (Student) a.next();
            System.out.println(s.stdRollno + " " + s.stdName + " " + s.stdId);
        }
        System.out.println("************************");

        //Collections.sort(stud);
        for (Student ob : stud) {
            System.out.println(ob.stdRollno + " " + ob.stdName + " " + ob.stdId);
        }

        //Collections.sort(stud);

        System.out.println("**********************");

        ArrayList<Integer> obj = new ArrayList<>(List.of(40, 50, 20, 30));
        System.out.println(obj);

        //Collections.sort(obj);
        //Collections.min(obj);//
       // Collections.addAll(stud);//

        for (Integer ob : obj);
        {

           System.out.println(obj);
        }
    }
}