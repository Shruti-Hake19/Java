package Constructorss;

//example of default constructor which displays the default values

public class DefaultEx2 {
    int id;
    String name;

    //method to display the value of id and name
    void display(){
        System.out.println(id+ " " +name);
    }

    public static void main(String[]args)
    {
        //creating objects
        DefaultEx2 ob = new DefaultEx2();

        //displaying values of the object
        ob.display();

    }

}
