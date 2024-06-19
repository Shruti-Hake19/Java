package Innercls;

public class InnerclssEx {

    private int a=10, b=20;
    void m1()
    {
        System.out.println("M1 Method....");
    }

    public class Innercls
    {
       private int x=200, y=300;
    }
    void m2()
    {
       m1();
        System.out.println("value of a" +a);
        System.out.println("value of b" +b);
        System.out.println(" m2 Method...");
        System.out.println("value of a" +a);
        System.out.println("value of a" +b);
    }

    public static void main(String[]args){
        InnerclssEx obj = new InnerclssEx();
        //obj.m1();
       // obj.m2();
        InnerclssEx.Innercls ob = obj.new Innercls();

        System.out.println(ob.x+ob.y+obj.a + obj.b);




    }
}
