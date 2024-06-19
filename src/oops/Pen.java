package oops;

public class Pen
{
    String color;
    String type;  //ballpen, gel;

    public void write(){
        System.out.println("Writing something");
        System.out.println(this.color);
        System.out.println(this.type);

    }

    public void print(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

