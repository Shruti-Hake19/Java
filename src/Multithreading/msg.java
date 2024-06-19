package Multithreading;

// block level synchronized
public class msg {

    public void show(String name)
    {                             //Home
        ;;;;;  //100 line of code

        synchronized (this)
        {
            for(int i=1; i<=3; i++)
            {
                System.out.println("How are you " +name);
            }
        }
        ;;;;;; //100 Line of code
    }                      //School

}
class OurThread extends Thread
{
    msg m;
    String name;
    OurThread(msg m, String name) //Constructor
    {
        this.m=m;
        this.name=name;
    }

    @Override
    public void run()
    {
        m.show(name);
    }
}
class Synkblock
{
    public static void main(String[]args)
    {
        msg m=new msg();
        OurThread t1 = new OurThread(m,"Shruti");
        OurThread t2 = new OurThread(m,"Priti");

        t1.start();
        t2.start();
    }
}
