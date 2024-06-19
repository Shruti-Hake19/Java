package List;

import java.util.List;

public class LambdaEx {
    public static void main(String[]args){

        List<Student> stds = List.of( new Student("Shruti", 1, 100)
                ,new Student("Shreya", 2, 200)
                , new Student("Sakshi", 3, 300));

        //stds.forEach( s -> System.out.println(("stdName" + stds.getName )));
        stds.forEach( s -> System.out.println(s));



    }
}
