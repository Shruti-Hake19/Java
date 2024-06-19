package Coupling;

// Loose coupling
public interface Topic {          //Interface
    void understand();
}
class Topic1 implements Topic {
    public void understand()
    {
        System.out.println(" Class Topic1 implements Topic class");
    }
} class Topic2 implements Topic {
    public void understand()
    {
        System.out.println("Class Topic2 implements Topic class");
    }
}
class Subject {
    public static void main(String[] args)
    {
        Topic t = new Topic1();
        t.understand();
        Topic t1 = new Topic2();
        t1.understand();

    }
}


