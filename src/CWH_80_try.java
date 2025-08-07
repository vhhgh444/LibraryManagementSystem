package com.company;

public class CWH_80_try {
    public static void main(String[] args) {
        int a=6000;
        int b=0;

        // Without using try
       /* int c=a/b;
        System.out.println("the result is "+c);
        */

        // with try or using try
       try{
        int c=a/b;
            System.out.println("the result is "+c);
        }
        catch (Exception e) {
            System.out.println("We failed to devide");
            System.out.println(e);
        }


    }
}
