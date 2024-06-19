package Filehandling;

import java.io.*;

                          /*  Read Data From a File   */

public class fileReader {

    public static void main(String[]args)  throws IOException {

//        try
//        {
            FileReader r = new FileReader("C:\\Users\\hakes\\OneDrive\\Desktop\\FileHandling.txt");
//            try
//            {
                int i;
                while ((i=r.read())!=-1)
                {
                    System.out.println((char)i);
                }
//            }
//            finally
//            {
//                r.close();
//                System.out.print("File closed");
//            }
//        }
//        catch (IOException i)
//        {
//            System.out.println("Exception handled...");
//        }
    }
}
