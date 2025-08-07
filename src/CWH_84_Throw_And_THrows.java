package com.company;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
    public String geMessage(){
        return "Radius cannot be negative";
    }
}

public class CWH_84_Throw_And_THrows {

    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result=Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {

       try{
//           int c= divide(6,0);
//            System.out.println(c);
           double ar=area(6);
           System.out.println(ar);
       }
       catch (Exception e){
           System.out.println("Exception");
       }





    }
}
