package com.company;
import java.util.Scanner;


class Circle2{
    Circle2(int r){
        System.out.println("I am a Circle parameterized constructor");
        this.radius=r;
    }
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cyliender extends Circle2{
    Cyliender(int r,int h){
        super(r);
        System.out.println("I am a cylinder parameterized constructor ");
        this.hight=h;

    }
    public int hight;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.hight;
    }
}
class Rectangel{
    int length;
    int widith;
    Rectangel(int l,int w){
        this.length=l;
        this.widith=w;
    }
    public double area(){
        return widith*length;
    }
}
class Cuboid extends Rectangel{
    int height;
    Cuboid(int l,int w,int h){
        super(l,w);
        this.height=h;
    }
    public double volume(){
        return length*widith*height;
    }
}
public class problem10 {
    public static void main(String[] args) {

       // Q1 & Q3:- Create a class circle and use inheritance to create another class Cylinder from it and also calculate area and volume.
        //Circle2 obj1=new Circle2(12);
       /* Cyliender obj=new Cyliender(12,4);
        System.out.println(obj.area());
        System.out.println(obj.volume());
        */

        // Q2 & Q4:- Create a class of rectangle and use inheritance to create another class Cuboid from it and also calculate area and volume.

        Cuboid obj=new Cuboid(5,7,9);
        System.out.println(obj.area());
        System.out.println(obj.volume());

    }
}
