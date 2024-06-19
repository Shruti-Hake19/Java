package Filehandling;

import java.io.File;
import java.io.IOException;

                          /* Creating new File */

public class CreateFile {
    public static void main(String[]args) throws IOException {

        File f = new File("C:\\Users\\hakes\\OneDrive\\Desktop\\FileHandling.txt");
//        try {
            if (f.createNewFile()) {
                System.out.println("File Successfully Created...!");
            } else {
                System.out.println("File Already Exist....!");
            }
//        }
//            catch(IOException i)
//            {
//                System.out.println("Exception Handled...!");
//            }
        }
    }


