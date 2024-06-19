package InitilizingObject;

//3.Initialization  of object through a constructor

public class Client {

    int id;
    String name;

    void insert(int i,String n){
        id=i;
        name=n;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[]args)
    {
        Client c1 = new Client();
        c1.insert(101,"Shreya");
        c1.display();
    }

}
