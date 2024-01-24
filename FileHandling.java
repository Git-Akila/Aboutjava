//import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class FileHandling {
    public static void main(String args[])throws IOException {
        //Check the file is Available or not
        File file=new File("D://IO file/test.txt");
        if(file.exists()){
            System.out.println("File Exists");
        }
        else {
            System.out.println("File Doesn't Exists");
        }
        //Creating New File
        /* File file = new File("D://IO file/test.txt");
        file.createNewFile();
        if (file.exists()) {
            System.out.println("File created Successfully");
        }

        //Write inside a File
        File file=new File("D://IO file/test.txt");
        if(file.exists()){
            FileWriter filew=new FileWriter("D://IO file/test.txt");
           filew.write("Akila.");
           filew.write('S');
           System.out.println("Successfully inserted");
           filew.close();}

 //REad a file
        File file= new File("D://IO file/test.txt");

        Scanner a=new Scanner(file);
        while(a.hasNextLine()){
            System.out.println(a.nextLine());
        }*/
      //Delete the file
      File file=new File("D://IO file/test.txt");
      if(file.delete()){
        System.out.println("File is:"+file.getName());}
      else{
        System.out.println("The File cannot delete");}
    }
}
