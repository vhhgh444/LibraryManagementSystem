package com.company;

import java.util.Scanner;

public class CWH_81_Handling_Specific_Exception {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind=sc.nextInt();


        System.out.println("Enter the number you want to dewvide that value with");
        int number=sc.nextInt();
        try{
            System.out.println("The value at array index is: "+marks[ind]);
            System.out.println("The value of array valur/number is:- "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurd");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurd");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occurd");
            System.out.println(e);
        }


    }
}
