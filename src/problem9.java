package com.company;
import java.util.Scanner;

class Cylinder2{
    private int radius;
    private int height;

    public Cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
       // return 2*3.14*radius*radius + 2*3.14*radius*height;
        return 2*Math.PI*radius*radius + 2*3.14*radius*height;
    }
    public double volume(){
       //return 3.14*radius*radius*height;
       return Math.PI*radius*radius*height;
    }
}
class Rectangle7 {
    private int length;
    private int breadth;

    public Rectangle7() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle7(int length, int breadth) {
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

class Sphere{
    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }
}


public class problem9 {
    public static void main(String[] args) {

       // Q1:- Use of getters and setters to get and set radius of a cyliender
        /*
        Cylinder2 mycylinder2=new Cylinder2();
        mycylinder2.setHeight(15);
        int h=mycylinder2.getHeight();
        System.out.println(h);
        mycylinder2.setRadius(14);
        int r=mycylinder2.getRadius();
        System.out.println(r);
         */

        // Q2:- Calculate surface ara and volume of the cylinder

       /*
        Cylinder2 mycylinder2=new Cylinder2();
        mycylinder2.setHeight(15);
        int h=mycylinder2.getHeight();
        System.out.println(h);
        mycylinder2.setRadius(9);
        int r=mycylinder2.getRadius();
        System.out.println(r);

        System.out.println(mycylinder2.surfaceArea());
        System.out.println(mycylinder2.volume());
        */

        // Q3:- Use a constructor to repeat Q1

       /*
        Cylinder2 mycylinder2=new Cylinder2(15,9);
        System.out.println(mycylinder2.getRadius());
        System.out.println(mycylinder2.getHeight());
        System.out.println(mycylinder2.surfaceArea());
        System.out.println(mycylinder2.volume());
        */

        // Q4:- Overload a constructor for rectangle using it's breadth and length

        /*
        Rectangle7 r=new Rectangle7(12,56);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
         */

        // Q5:- Repeat all the cases for sphere as same as Q1.

        Sphere sp=new Sphere(8);
        System.out.println(sp.getRadius());
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());

    }
}



