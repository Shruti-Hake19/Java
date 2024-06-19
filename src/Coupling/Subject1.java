package Coupling;

class Subject1 {
    Topics t = new Topics();
    public void startReading()
    {
        t.underStand();
    }

}
class Topics{
    public void underStand()
    {
        System.out.println("Tight Coupling....");
    }

}
class Teacher{
   public static void main(String[]args) {
       Subject1 s = new Subject1();
       s.startReading();
   }
}