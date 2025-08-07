package com.company;

import java.util.Scanner;

public class CWH_79_All_TypeessOf_Error {
    public static void main(String[] args) {

        // Syntax Error

       // int a=5
      //  c=0;

        //Logical Error demo
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

        // Runtime Error
        int k;
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("Integer part of 1000 divides by k is:- "+1000/k);


    }
}
