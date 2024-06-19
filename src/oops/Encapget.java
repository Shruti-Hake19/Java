package oops;

public class Encapget {
    public static void main(String[] args) {
        Encapsulation1 ob1 = new Encapsulation1();

       ob1.setsId(11);
       ob1.setsName("Shruti");
       ob1.setMathMarks(60.35);
       ob1.setScienceMarks(70);

       System.out.println(ob1.getsId() + " " + ob1.getsName()  +" "+ ob1.getMathMarks() +" "+ ob1.getScienceMarks());

    }
}