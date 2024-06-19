package Practice;

public class ChangeVal {
//    //final int x=5;
//    int y=5;
//    public static void main(String[]args){
//        ChangeVal ob =new ChangeVal();
//       // ob.x=30; // cannot assign a value to final variable
//        ob.y=20;  // here override the existing value
//        //System.out.println(ob.x);
//        System.out.println(ob.y);
//    }
//}
    int x=5;
public static void main(String[]args){
    ChangeVal ob1=new ChangeVal();
    ob1.x=30;
    ChangeVal ob2= new ChangeVal();
    System.out.println(ob1.x);
    System.out.println(ob2.x);
}
}