package Multithreading;

public class SchedularA extends Thread{
    @Override
    public void run() {

        String n = Thread.currentThread().getName();
        for(int i = 1; i<=3; i++ ){
            System.out.println(n);
        }

    }
}
class SchedularB{
    public static void main(String[]args){
        SchedularA t1 = new SchedularA();
        SchedularA t2 = new SchedularA();
        SchedularA t3 = new SchedularA();

        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");

        t1.start();
        t2.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for(int i = 1; i<=3; i++ ){
            System.out.println(n);
        }
    }
}
