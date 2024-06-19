package Constructorss;

//program to overload constructors
public class OverloadingEx {
    int id;
    String name;
    int age;

    //creating two arg constructor
    OverloadingEx(int i,String n){
        id=i;
        name=n;
    }

    //creating three arg constructor  
    OverloadingEx(int i,String n, int a){
        id=i;
        name=n;
        age=a;
    }

    void display(){
        System.out.println(id+ " " +name+" "+age);
    }
    public static void main(String[]args){
         OverloadingEx obj = new OverloadingEx(1,"Shruti",23);
         OverloadingEx obj2 = new OverloadingEx(2,"Priti");

         obj2.display();
         obj.display();

    }
}
