package Variables;

public class allvarEx {
    int a = 100;      //instance variable
    static boolean b=true;   //static variable

    public static void main(String[] args)
    {
        double d = 20.5;         //local variable
        System.out.println(d);

        allvarEx t = new allvarEx();
        System.out.println(t.a);

        System.out.println(allvarEx.b);
    }

}
