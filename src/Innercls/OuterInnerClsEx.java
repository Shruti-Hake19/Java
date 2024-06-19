package Innercls;

  class Outerclass {   // Outer class
    int x = 10 ;

    class  Innerclass{     // Inner class

        int y = 20 ;
    }
}
public class OuterInnerClsEx{
     public static void main(String[]args){

         Outerclass Outer = new Outerclass();   //object of Outer class
        Outerclass.Innerclass Inner = Outer.new Innerclass();    // object of Inner class


         System.out.println(Outer.x);
         System.out.println(Inner.y);
         System.out.println(Outer.x + Inner.y);



     }

}


