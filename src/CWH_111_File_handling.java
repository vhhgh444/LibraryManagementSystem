package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_File_handling {
    public static void main(String[] args) {


        // Code to create a new file
       /* File myFile=new File("cwh111file.text");
        try {
            myFile.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        // Code to write to a file

        try {
            FileWriter fileWriter=new FileWriter("cwh111file.text");
            fileWriter.write("This is the first file from the java course\n Ok now bye");
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        // Code to read a file
        File myFile=new File("cwh111file.text");
        try {
            Scanner sc=new Scanner(myFile);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */


        File myFile=new File("cwh111file.text");
        if (myFile.delete()){
            System.out.println("I have deleted : "+myFile.getName());
        }
        else{
            System.out.println("Some problem occurd while deleting the file");
        }


    }
}
