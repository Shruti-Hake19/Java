package LearnJava;

public class PassArgToMtd {
    static void add(int a, int b)
    {
       int result;
       result=a+b;
       System.out.println(result);
     //  return 0;
    }
    public static void main(String[]args){

        //Directly passing the constants
     PassArgToMtd.add(10,20);
    }
}
