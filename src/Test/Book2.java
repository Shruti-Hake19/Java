package Test;

import java.util.ArrayList;
import java.util.List;

public class Book2 {
    public static void main(String[]args){
        Book b1= new Book(10,"java",200.0);
        Book b2= new Book(20,"Php",100.0);
        Book b3= new Book(30,"Html",250.30);
        Book b4= new Book(40,"Python",220.0);

        ArrayList<Book> Bk = new ArrayList<>(List.of(b1,b2,b4,b3));
        System.out.println(Bk);
    }
}
