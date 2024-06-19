package LambdaExp;


//here we are not implementing Java lambda expression.
// Here, we are implementing an interface without using lambda expression.
 interface Drawable {
      void draw();
}

public class LambdaExpExample {
    public static void main(String[] args) {

        int width = 10;


        //without lambda Expression, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };

        d.draw();
    }
 }