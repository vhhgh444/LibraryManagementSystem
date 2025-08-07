package com.company;
import java.util.Scanner;

public class CWH_33_Variable_Arguments {

//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    static int sum(int ...arr){
        //Available as int[] arr;

        int result=0;

        for(int a:arr){
            result +=a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Wellcome to Varargs Tutorial");
        System.out.println("The sum of nothing:- "+sum());
        System.out.println("The sum of a and b is:- "+sum(4,5));
        System.out.println("The sum of a,b and c:- "+sum(4,5,9));

    }
}
