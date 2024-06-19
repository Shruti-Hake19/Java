package Practice;

public class Orange {
    int id;
    String shape;
    String color;
    String taste;

    void Print(){
        System.out.println("Id : " + id);
        System.out.println("Shape: "   + shape);
        System.out.println("color: "   + color);
        System.out.println("taste: " + taste);
    }

    Orange(int id, String shape, String color,String taste){
        this.id=id;
        this.shape=shape;
        this.color=color;
        this.taste=taste;

    }

}
