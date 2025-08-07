package com.compay;
import java.util.Scanner;

public class problem7 {

    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d=%d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n+ sumRec(n-1);
    }
    static void reverse_pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static int fib(int n){
        /*if(n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
         */
        if(n==1||n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    static int sum(int ...arr){
        //Available as int[] arr;

        int result=0;

        for(int a:arr){
            result +=a;
        }
        return result;

    }
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
           for(int i=0;i<n;i++){
               System.out.print("*");
           }
            System.out.println();
       }
    }

    public static void main(String[] args) {

        // Q1:- Multiplication table of a number n
        //multiplication(7);

        // Q2:- Pattern program using method
        //pattern1(4);

        // Q3:- Rcursive function to calculate sum of first n natural number

        //int c=sumRec(3);
        //System.out.println(c);

        // Q4:-
        //reverse_pattern1(4);

        // Q5:- Fibonacci series
       // int result=fib(7);
       // System.out.println(result);

        // Q6:- Average of a set of numbers
       // System.out.println("The average of the three numbers is:- "+sum(4,8,9)/3);

        // Q8:- Pattern program using recurssion
        pattern1_rec(4);
    }
}
