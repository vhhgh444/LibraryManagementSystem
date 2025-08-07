package com.company;
import java.util.Scanner;
public class CWH_23_For_Loop {
    public static void main(String[] args) {

//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }
        System.out.println("Enter n number to print all odd numbers:- ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:- ");
        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//           if (i/2!=0){
//                System.out.println(i);
//           }
//            else {
//             System.out.println("Nothing");
//            }
//            System.out.println(2*i+1);
        //}

//        for(int i=5;i>0;i--){
//            System.out.println(i);
//        }

        for(int i=n;i>0;i--){
            System.out.println(i);
        }


    }
}
