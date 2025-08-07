package com.company;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Q1:- Sum of three numbers
      /*  System.out.println("Taking the value from user:- ");
        Scanner sc=new Scanner(System.in);
        System.out.println("The first value is:- ");
        int a=sc.nextInt();
        System.out.println("The second value is:- ");
        int b=sc.nextInt();
        System.out.println("The third value is:- ");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("The sumation of the three number is:- "+sum);
       */

        // Q2:- Calculate the CGPA
       /* System.out.println("Enter the marks of the subjects:- ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Subject1:- ");
        int s1 = sc.nextInt();
        System.out.println("Enter the marks of Subject2:- ");
        int s2 = sc.nextInt();
        System.out.println("Enter the marks of Subject3:- ");
        int s3 = sc.nextInt();
        float CGPA = (s1 + s2 + s3) / 30f;
        System.out.println(CGPA);
        */

        // Q3:- Taking name from user as an input
       /* System.out.println("What is your name:- ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("Hello " +name+ " have a good day!");
        */

        // Q4:- Km to Mile converter
        /*System.out.println("Enter the value in Km:- ");
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        double mile=(a*0.621371);
        System.out.println(mile);
         */

        // Q5:- Check the input value is integer or not
        System.out.println("Enter the value from the user:- ");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
