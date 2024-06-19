package InitilizingObject;

public class Rectangle {

    int length;
    int width;


    void area(int l,int w){
        length=l;
        width=w;
    }

    void calArea()
    {
        System.out.println(length*width);
    }

    public static void main(String[]args){
  Rectangle r = new Rectangle();
  r.area(5,2);
  r.calArea();

    }
}
