package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class CWH_35_Method_Practice {
//    static void multiplication(int n){
//        for(int i=1;i<=10;i++){
//            System.out.format("%d X %d= %d\n",n,i,n*i);
//        }
//    }

//    static void pattern1(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//    }
//    static int sumRec(int n){
//        if(n==1){
//            return 1;
//        }
//        return n+ sumRec(n-1);
//    }


    //    static int fib(int n){
//        /*if(n==1){
//            return 0;
//        }
//        else if (n==2) {
//            return 1;
//
//        }  */
//
//        if(n==1||n==2){
//            return n-1;
//        }
//       return fib(n-1)+fib(n-2);
//    }
//    static void pattern1_Rec(int n) {
//
//        if (n > 0) {
//            pattern1_Rec(n - 1);
//            for (int i = 0; i < n; i++) {
//                System.out.println("*");
//            }
//            System.out.println();
//        }
//    }
    static void farenhite_to_celcius(int n){
        float farenhite_to_celcius=(n*1.8f)+32;
        System.out.println(farenhite_to_celcius);
    }

    public static void main(String[] args) {
//        {
        //Problem 1:-

//            multiplication(7);

        //Problem 2:-
        //pattern1(4);

        //Problem 3:-

//           int c= sumRec(3);
//            System.out.println(c);


        //Problem 5:-
//    int result=fib(7);
//       System.out.println(result);

        //Problem 8:-
      //  pattern1_Rec(9);

        //Problem 9:-
        System.out.println("the value in fahrenheit is:-  ");
        farenhite_to_celcius(8);

    }
}

