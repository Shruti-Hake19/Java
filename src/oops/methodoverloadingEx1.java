package oops;

public class methodoverloadingEx1 {

// 1. Method Overloading: By changing no. of arguments

//    static int add (int a, int b){
//        return a+b;
//    }
//    static int add (int a,int b, int c){
//        return a+b+c;
//    }
//
//    public static void main(String[]args){
//           System.out.println(methodoverloadingEx1.add(10,20));
//           System.out.println(methodoverloadingEx1.add(20,30,50));
//
//
//    }
//

//   2.Method Overloading: By changing data type of arguments
    static int plusMethod(int x, int y){
        return x+y;
    }
    static double plusMethod(double x,double y){
        return x+y;
    }
    public static void main(String[]args){

        System.out.println(methodoverloadingEx1.plusMethod(10,20));
        System.out.println(methodoverloadingEx1.plusMethod(2.2,1.1));
    }
}
