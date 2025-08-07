package com.company;
import java.util.Scanner;


public class problem13 {
    public static void main(String[] args) {

        // Q1:-Write a java program to demonstrate syntax,logical & runtime errors.

        // Syntax Error:- int a=7
        // Logical Error:-
        int age=70;
        int year_born=2000-70;
        // Runtime Error:-
        //System.out.println(6/0);

        // Q2:- Write a java program which prints "Haha" for Arithmetic Exception and "Hello" for illigal arguments.
        try {
            int a=666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hello");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        // Q3:- Write a java program which accessing an array and until a valid index is given.
       /* boolean flag=true;
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;
        while (flag){
            try {
                System.out.println("Enter the value of the index:- ");
                index = sc.nextInt();
                System.out.println("The value of the marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        */

    }
}
