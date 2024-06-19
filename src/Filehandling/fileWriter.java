package Filehandling;

import java.io.*;
//import java.io.FileWriter;
//import java.io.IOException;

/*     Write on File    */
public class fileWriter {

    public static void main(String[]args) {
        try
        {
            FileWriter f = new FileWriter("C:\\Users\\hakes\\OneDrive\\Desktop\\FileHandling.txt") ;
            try
            {
                f.write("Java Programming is the most Popular language");
            }
            finally
            {
                f.close();
            }
            System.out.println("Successfully Data Wrote in File");
        }
        catch (IOException i)
        {
            System.out.println(i);
        }
    }
}
