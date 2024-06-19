package Multithreading;

public class A extends Thread {
    @Override
    public void run() {         // Define Thread

        try {
            for (int i = 1; i <= 5; i++)//child thread job
            {
                System.out.println("Shruti");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException i)
        {

        }
    }

    class B
    {
        public static void main(String[] args) throws InterruptedException {
            A obj = new A();
            obj.start();   // here obj call start method and also execute run method.

            for (int i = 1; i <= 5; i++)//Main thread job
            {
                System.out.println("Priti");
                Thread.sleep(1000);
            }
        }
    }
}