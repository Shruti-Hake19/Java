package Practice;

public class MethodEx {
    static void CheckedAge(int age){
       if(age>18)
       {
           System.out.println("allowed for owtting");
       }
       else
       {
           System.out.println("Not allowed for owtting ");
       }
    }
    public static void main(String[] args){
        CheckedAge(21);
    }
}
