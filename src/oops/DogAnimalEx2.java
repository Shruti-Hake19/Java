package oops;

public class DogAnimalEx2 extends AnimalEx2{
    void eat(){
        System.out.println("eating bread....");
    }
    void bark(){
        System.out.println("Barking....");
    }
    void work(){
        super.eat();
        bark();
    }
}
