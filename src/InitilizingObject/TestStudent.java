package InitilizingObject;

 //1.Initialization through reference

public class TestStudent {

    public static void main (String[] args){


        //Creating objects
        Student s1 = new Student();  // initialize the object through a reference variable.
        Student s2 = new Student();


        //Initializing objects

        s1.id=100;  //Initializing an object means storing data into the object.
        s1.name= "Shruti";
        s2.id = 200;
        s2.name="Priti";

        //Printing data
        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);
    }
}
