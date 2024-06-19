package Constructorss;

//program to initialize the values from one object to another object.
public class copyConstEx {

    int id;
    String name;

    //constructor to initialize integer and string
    public copyConstEx(int i, String n){
        id=i;
        name=n;
    }

    //constructor to initialize another object
    public copyConstEx(copyConstEx s){
        id=s.id;
        name=s.name;
    }

    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[]args){

        copyConstEx obj1 = new copyConstEx(100,"Rani");
        copyConstEx obj2 = new copyConstEx(obj1);

        obj1.display();
        obj2.display();

    }

}
