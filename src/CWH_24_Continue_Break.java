package com.company;
import java.util.Scanner;
public class CWH_24_Continue_Break {
    public static void main(String[] args) {

        //Break and Continue using loop:-

//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("Java is Great");
//
//            if (i == 2){
//                System.out.println("Ending Loop");
//                continue;
//            }
//        }
        int i = 0;

            do {
                i++;
                if (i == 2) {
                    System.out.println("Ending Loop");
                   continue;
                }
                System.out.println(i);
                System.out.println("Java is Great");



            }while(i<5);
            System.out.println("Loops End here");
        }
    }