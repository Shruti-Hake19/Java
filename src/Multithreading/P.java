package Multithreading;

//By implementing Runnable interface
public class P implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++)//child thread job
        {
            System.out.println("Child Thread");
        }
    }
}


class Q{
      public static void main(String[]args){
         P r =  new P();

         Thread t = new Thread(r);
         t.start();

         for(int i = 1; i <= 5; i++)
         {
             System.out.println("Main Thread");
         }

      }
}
