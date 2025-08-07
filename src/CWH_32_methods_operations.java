package com.company;
import java.util.Scanner;

public class CWH_32_methods_operations {

    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+a+ " bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning "+a+ " bro!");
        System.out.println("Good Morning "+b+ "bro!");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int [] arr){
        arr[0]=98;
    }

//        static void tellJoke(){
//            System.out.println("How do trees get on the Internet?\n"+"Login");
//        }
//
//
        public static void main(String[] args) {
//           // tellJoke();
             // int [] marks={52,56,79,89,77,73};
//            int x=45;
            //change2(marks);
            //System.out.println("The value of X  after running change is:- "+marks[0]);

            //Method Overloading:-

            foo();
            foo(3000);
            foo(6000,9000);



        }
    }

