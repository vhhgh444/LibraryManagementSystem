package com.company;
import java.util.Scanner;


class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am Setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Animal{
    String x;

    public String getX() {return x;}


    public void setX(String x) {
        System.out.println("To check the property of an animal:- ");
        this.x = x;
    }
}
class Dog extends Animal{
    String y;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
public class CWH_45_Inheritance {
    public static void main(String[] args) {

        /*
        //Creating an object of base class

        //Base b=new Base();
       Derived b=new Derived();
        b.setX(4);
        System.out.println(b.getX());


        //Creating an object of derived class
       Derived d=new Derived();
        d.setY(43);
        d.setX(3);
        System.out.println(d.getY());
        System.out.println(d.getX());

         */

       // Animal an=new Animal();
       /* Dog an=new Dog();
        an.setX("They should have sharp teeth");
        System.out.println(an.getX());


        */
        Dog d=new Dog();
        d.setX("They should have sharp teeth");
        d.setY("The Dog had sharp teeth so it's lie in the category of an animal");
        System.out.println(d.getY());
        System.out.println(d.getX());
    }
}
