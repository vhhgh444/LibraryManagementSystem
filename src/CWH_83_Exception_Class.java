package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return super.toString() + "I am toString()";
    }
    public String geMessage(){
        return super.getMessage() + "I am getMessage()";
    }
}

public class CWH_83_Exception_Class {
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        if (a<9){
            try{
            throw new MyException();
        }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }

    }
}
