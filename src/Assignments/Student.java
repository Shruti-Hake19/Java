package Assignments;
interface people{
 void learn();
}
 class Student implements people {

  @Override
  public void learn() {
   System.out.println("Student class Method.....");
  }

  class Employee implements people{

   @Override
   public void learn() {
    System.out.println("Employee class method....");
   }
  }


  class faculty {
   people people;

   public void setPeople(Assignments.people people) {
    this.people = people;
   }

   public Assignments.people getPeople() {
    return people;
   }
   public void disp(){
    people.learn();

   }
  }



  public static void main(String[]args){
   people p = new Student();
   p.learn();
   people p1 = new Assignments.Employee();
   p1.learn();

   }
  }
