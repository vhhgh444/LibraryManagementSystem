package com.company;
import java.util.Scanner;

class Circle{
    Circle(int r) {
        System.out.println("i am circle parameterized constructor ");
        this.radius = r;
    }

    public int radius;
    public double are(){
        return Math.PI*this.radius*this.radius;
    }

}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        System.out.println("I am Cylinder1 Parameterized Constructor");
        this.height=h;

    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.radius*this.height;
    }


}
public class CWH_52_Practice_Of_Inheritance {
    public static void main(String[] args) {

        //Problem 1:-
        //Circle objc=new Circle(12);
        Cylinder1 obj=new Cylinder1(12,4);

    }
}
