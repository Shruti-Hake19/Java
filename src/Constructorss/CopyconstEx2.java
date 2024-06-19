package Constructorss;

//Copying values without constructor
public class CopyconstEx2 {

    int id;
    String name;
     CopyconstEx2(int i, String n){
         id=i;
         name=n;
     }

     CopyconstEx2(){

     }

     void display(){
         System.out.println(id+" "+name);
     }

     public static void main(String[]args){
         CopyconstEx2 c1 = new CopyconstEx2(1,"Priya");
         CopyconstEx2 c2 = new CopyconstEx2();

         c2.id= c1.id;
         c2.name= c1.name;

         c1.display();
         c2.display();
     }
}
