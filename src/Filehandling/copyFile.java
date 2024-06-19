package Filehandling;

import java.io.*;

public class copyFile {
    public static void main(String[]args) throws IOException {

        FileInputStream r = new FileInputStream("C:\\Users\\hakes\\OneDrive\\Desktop\\FileHand2.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\hakes\\OneDrive\\Desktop\\copyFile.txt");//create file or perform write operation

        int i;
        while((i=r.read())!=-1);
        {
            w.write((char)i);
        }
        System.out.println("Data copied successfully...!");
    }
}
