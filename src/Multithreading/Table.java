package Multithreading;

/* Method level synchronization */
public class Table {

    public synchronized void printTable(int n)  // t1 and t2
    {
        for (int i=1; i<=10; i++)
        {
            System.out.println(n*i);
        }
    }
}
class thread1 extends Thread
{
    Table t;
    thread1(Table t)
    {
      this.t = t;
    }

    @Override
    public void run() {
       t.printTable(5);
    }
}
class thread2 extends Thread
{
    Table t;
    thread2(Table t)
    {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(2);
    }
}

class Main{
    public static void main(String[]args){
        Table obj = new Table();

        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);

        t1.start();
        t2.start();
    }
}
