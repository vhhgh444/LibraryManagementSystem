package com.company;

import java.util.Scanner;

public class CWH_06_Exercise {
    public static void main(String[] args) {

        System.out.println("Check the percentage of the student:- ");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of subject1:- ");
        int s1=sc.nextInt();
        System.out.print("enter the number of subject2:- ");
        int s2=sc.nextInt();
        System.out.print("enter the number of subject3:- ");
        int s3=sc.nextInt();
        System.out.print("enter the number of subject4:- ");
        int s4=sc.nextInt();
        System.out.print("enter the number of subject5:- ");
        int s5=sc.nextInt();

       int total=(s1+s2+s3+s4+s5);

       float percent=total/5f;

        System.out.println("Total marks of the student is:- ");
        System.out.println(total);
        System.out.println("The percentage of the student in CBSE board exam is:- ");
        System.out.println(percent);

    }
}
