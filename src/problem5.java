package com.company;
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {


        // Q1:- Pattern programing
       /* int n=4;
        for( int i=n;i>0;i--){
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
            System.out.print("\n");
        }
        */

        // Q2:- Sum of first n even numbers using while loop

        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<n){
            sum= sum + (2*i);
            i++;
        }
        System.out.print("The sum of even numbers is:- ");
        System.out.println(sum);
         */

        // q3 & Q4:- Multiplication table of a given number n and reverse order
      /*  int n=5;
       // for(int i=1;i<=10;i++){
            for(int i=10;i>0;i--){
            System.out.printf("%d X %d=%d\n", n,i,n*i);
        }
       */

        // Q5:- Factorial of a number
      /*  System.out.println("Enter the value of n:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int factorial=1;
        while(i<=n){
            factorial*=i;
            i++;
        }
        System.out.println(factorial);
       */

        // Q9:- Sum of the multiplication table of 8;
        int n=8;
        int sum=0;
         for(int i=1;i<=10;i++){
        //for(int i=10;i>0;i--){
          sum+= n*i;
         }
        System.out.println(sum);
    }
}
