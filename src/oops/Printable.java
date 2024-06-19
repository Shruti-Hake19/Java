package oops;

interface Printable {

    void print();

}
 interface Showable {
    void show();
}
class A implements Printable,Showable{

    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[]args){
        A a = new A();
        a.print();
        a.show();
    }
}
