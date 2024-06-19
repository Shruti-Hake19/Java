package LearnJava;

// main within same class:
public class ClassName {
    int id = 1;        // instance variable or data member or field

    String name;
}
class Tes{     //2nd class

    public static void main(String[]args){
        ClassName ob = new ClassName();  //Creating an object of ClassName
        System.out.println(ob.id);
        System.out.println(ob.name);

    }
}



