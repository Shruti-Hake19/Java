package Reflections;

import java.util.ResourceBundle;

public class ResourceBndl {
    public static void main(String[]args)
    {
        // Default language
        ResourceBundle rs = ResourceBundle.getBundle("Application");
        System.out.println(rs.getString("wish"));

        //French language
        ResourceBundle rsl = ResourceBundle.getBundle("Application");
        System.out.println(rsl.getString("wish1"));

        //Canda Language
        ResourceBundle rs1 = ResourceBundle.getBundle("Application");
        System.out.println(rs1.getString("wish2"));
    }
}
