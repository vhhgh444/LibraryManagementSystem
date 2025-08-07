package com.company;
import java.util.Scanner;


class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;
    }

    public double volume(){
        return 3.142*radius*radius*height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
 class Rectangle {

     private int length;
     private int breadth;

     public Rectangle() {
         this.length = 4;
         this.breadth = 5;
     }

     public Rectangle(int length, int breadth) {
         this.length = length;
         this.breadth = breadth;
     }

     public int getLength() {
         return length;
     }

     public int getBreadth() {
         return breadth;
     }
 }
public class CWH_44_AcessModifiers_Constructors {
    public static void main(String[] args) {


        // Problem 1:-


       //Cylinder myCylinder=new Cylinder();
//        myCylinder.setHeight(12);
       // int h=myCylinder.getHeight();
        //System.out.println(h);

       // myCylinder.setRadius(9);
        //int r=myCylinder.getRadius();
       // System.out.println(r);


        //Problem 2:-

        //System.out.println(myCylinder.surfaceArea());
        //System.out.println(myCylinder.volume());


        //P0roblem 3:-
        Cylinder myCylinder=new Cylinder(9,12);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());


        //Problem 4:-

        Rectangle r=new Rectangle(12,56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());



    }
}
