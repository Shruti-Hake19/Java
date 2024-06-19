package GetterSetter;

public class GetMain {
    public static void main(String[]args){

        // Create object of GetSet class
        GetSet G = new GetSet();

        // Setting the name by calling setter method
        G.setName("Shruti");

        // Getting the name by calling setter method
        System.out.println(G.getName());


        G.setRollNo(100);
        System.out.println(G.getRollNo());
    }
}
