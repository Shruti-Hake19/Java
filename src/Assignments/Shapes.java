package Assignments;

public class Shapes {
    public double CalculateArea() {
        return 0;
    }
}

     class Circle extends Shapes{      //Circle subclss
        private double radius;


        public Circle(double radius){
            this.radius=radius;

        }

        @Override
        public double CalculateArea() {
            return Math.PI*radius*radius;
        }
    }


     class Rectangle extends Shapes{          //Rectangle subclss
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

        @Override
        public double CalculateArea() {
            return width*height;
        }
    }



     class Triangle extends Shapes{      //Triangle Subclss
    private double base;
    private  double height;

    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

        @Override
        public double CalculateArea() {
            return 0.5*base*height;
        }
    }


