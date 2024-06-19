package Practice;

 class Fruits {
     int id;
     String name;
     String color;
     String taste;

     public Fruits(int id, String name, String color, String taste) {
         this.id = id;
         this.name = name;
         this.color = color;
         this.taste = taste;
     }

     public void Fruitsinfo() {
         System.out.println(id);
         System.out.println(name);
         System.out.println(color);
         System.out.println(taste);
     }


     public static void main(String[] args) {
         Fruits ob = new Fruits(1, "Orange", "Orange", "Sour");
         ob.Fruitsinfo();
     }
 }
