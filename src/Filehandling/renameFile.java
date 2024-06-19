package Filehandling;

import java.io.*;

/*  rename a File   */
public class renameFile {
    public static void main(String[]args){

        File f = new File("C:\\Users\\hakes\\OneDrive\\Desktop\\FileHandling.txt");
        File r = new File("C:\\Users\\hakes\\OneDrive\\Desktop\\FileHand2.txt");

        if(f.exists())
        {
            System.out.println(f.renameTo(r));
        }
       else
        {
            System.out.println("File does not exist...!");
        }
    }

}
