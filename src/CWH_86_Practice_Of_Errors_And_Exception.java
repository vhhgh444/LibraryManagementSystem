package com.company;


import java.util.Scanner;

public class CWH_86_Practice_Of_Errors_And_Exception {
    public static void main(String[] args) {

        //Problem 1:-
        // Syntax error-->int a=7
        /*
        Logical Error--->
        int age =78;
        int year-born=2000-70;
         */

        //System.out.println(6/8);

        //Problem 2:-
        try{
            int a=666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

        //Problem 3:-
        boolean flag=true;
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc =new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of Index");
                index = sc.nextInt();
                System.out.println("The value of marks[index]is " + marks[index]);
                break;

            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }


        }


    }
}
