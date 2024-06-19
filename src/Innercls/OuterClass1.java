package Innercls;

public class OuterClass1 {
    private int a=20, b=30;
    void m1()
    {
        System.out.println("Outer class Method...");
    }
    public class Inner{
       private int x=10, y=20;
        void m2()
        {
            System.out.println("Inner Class Method");
            System.out.println("Outer Class variable in inner Class: " +(a+b) );
            m1();
        }
    }
    public static void main(String[]args){
        OuterClass1 ob = new OuterClass1();
        ob.m1();
        OuterClass1.Inner in = ob.new Inner();
         in.m2();
    }
}
