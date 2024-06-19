package Filehandling;


import java.io.File;

                         /*  File Information  */
public class FileInfo {

    public static void main(String[]args)
    {
        File f = new File("C:\\Users\\hakes\\OneDrive\\Desktop\\FileHandling.txt");

        if(f.exists())
        {
            System.out.println("File Name : " +f.getName());
            System.out.println("File Location : " +f.getAbsolutePath());
            System.out.println("File Writable :" +f.canWrite());
            System.out.println("File Readable :" +f.canRead());
            System.out.println("File size:" +f.length());

            System.out.println("File Removed :" +f.delete());
        }
        else
        {
            System.out.println("File does not exist...!");
        }
    }
}
