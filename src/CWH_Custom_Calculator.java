package com.company;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return"Can't add 8 and 9";
    }

    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return"Input canbe greater than 100000";
    }

    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class CannotDivideByException extends Exception{
    @Override
    public String toString(){
        return"Can't devide by 0";
    }

    @Override
    public String getMessage(){
        return "I am getMessage";
    }
}
class CustomCalculator {
    double add(double a,double b)throws InvalidInputException,MaxInputException{
       if (a>100000||b>1000000){
           throw new MaxInputException();
       }

        if (a==8||b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }
    double subtract(double a,double b){
        return a-b;
    }
    double multiplication(double a,double b){
        return a*b;
    }
    double division(double a,double b) throws  CannotDivideByException{
        if (b==0){
            throw new CannotDivideByException();
        }
        return a/b;
    }

}
public class CWH_Custom_Calculator {
    public static void main(String[] args)throws InvalidInputException ,CannotDivideByException,MaxInputException{
        /*
        You have to create a custom calculator which throws into the following Operations:-
        1. +-->Addition
        2. -  --->Subtraction
        3. * -->Multiplication
        4. / --->Division
        Which throws the following exceptions:-
        1. Invalid input Exception
        2. Can not divide by 0 Exception
        3. max Input Exception if any of the input is greater than 100000
        4. Max multiplier Reached Exception ->  Don't allow any multiplication input to the greater than 7000
         */
        CustomCalculator c=new CustomCalculator();
       // c.add(8,9);
        c.division(6,0);


    }
}
