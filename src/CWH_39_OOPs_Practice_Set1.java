package com.company;
import java.util.Scanner;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getNam(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

}

class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("Calling Tuhin");
    }
}
class rectangle{
    int length;
    int breadth;
    public int area(){
       return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class CWH_39_OOPs_Practice_Set1 {
    public static void main(String[] args) {

        /*
        //Problem 1:-
        Employee anuj=new Employee();
        anuj.setName("Anuj Samanta");
        anuj.salary=545;
        System.out.println(anuj.getSalary());
        System.out.println(anuj.getNam());

        //Problem 2:-
        cellphone samsung=new cellphone();
        samsung.ring();
        samsung.vibrate();
        samsung.callfriend();


        //Problem 3:-
        rectangle sq=new rectangle();
        sq.length=5;
        sq.breadth=8;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

         */

        //Problem 5:-

        Tommy player1=new Tommy();
        player1.run();
        player1.hit();
        player1.fire();;


    }
}
