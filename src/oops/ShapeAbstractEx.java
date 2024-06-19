package oops;

abstract class ShapeAbstractEx {
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends ShapeAbstractEx{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle1 extends ShapeAbstractEx{
    void draw(){
        System.out.println("drawing circle");
    }
}
//In real scenario, method is called by programmer or user

class TestAbstraction1{
    public static void main(String args[]){
        ShapeAbstractEx s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();

        ShapeAbstractEx s1 = new Rectangle();
        s1.draw();
    }
}
