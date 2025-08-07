package com.company;
import java.util.Scanner;

public class CWH_27_Array_interesting_operations {
    public static void main(String[] args) {



      /*  String [] students={"Anuj","Tuhin","Debu","Asif","NNirmalya","Arpan","Jitu"};
        System.out.println(students.length);
        System.out.println(students[5]); */

        int [] marks={56,89,87,85,87,84,85};
        System.out.println(marks.length);
        System.out.println(marks[5]);
        //Displaying the array
        for(int i=0;i < marks.length;i++){
            System.out.println(marks[i]);
        }

        //Display the array in reverse order
        System.out.println("Printing the array using loop in reverse order: ");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //For each loop
        System.out.println("Printing using for each loop:- ");
        for(int element:marks){
            System.out.println(element);
        }


    }
}
