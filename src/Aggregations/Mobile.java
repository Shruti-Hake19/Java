package Aggregations;

public class Mobile {

    String Model;
    int prize;
    String color;

    Person person;

    public Mobile(String model, int prize, String color, Person person) {
        Model = model;
        this.prize = prize;
        this.color = color;
        this.person = person;
    }

    void disp(){
        System.out.println(Model + " " + prize + " " +color + " " + person.id + " "+ person.name + " " + person.height);
    }

    public static void main(String[]args){
        Person p = new Person(101,"Raj",5);
        Mobile m = new Mobile("Realme",17000,"Silver",p);

        m.disp();
    }
}
