package com.company;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("Taking the marks of five subject:- ");
        Scanner sc=new Scanner(System.in);
        System.out.println("The marks in Math is:- ");
        int Math =sc.nextInt();
        System.out.println("The marks in Chem is:- ");
        int Chem =sc.nextInt();
        System.out.println("The marks in Phy is:- ");
        int Phy =sc.nextInt();
        System.out.println("The marks in Eng is:- ");
        int Eng=sc.nextInt();
        System.out.println("The marks in Beng is:- ");
        int Beng=sc.nextInt();
        int sum= Math + Chem + Phy + Eng + Beng;
        float percent= (sum/500f)*100;

        System.out.println("The percentage of getting through the student marks is:- " +percent);


    }
}
