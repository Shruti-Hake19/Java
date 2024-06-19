package Assignments;

public class ShapesClient {
    public static void main(String[]args){
        Circle circleob = new Circle(4);
        System.out.println("Area of circle: " +circleob.CalculateArea());

        Rectangle ob=new Rectangle(12,34);
        System.out.println("Area of rectangle is: " +ob.CalculateArea());

        Triangle tri=new Triangle(5,9);
        System.out.println("Area of triangle is: " +tri.CalculateArea());

    }
}
