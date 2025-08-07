package com.company;
import java.util.Scanner;


class myBase{
    myBase(){
        System.out.println("I am a constructor");

    }
    myBase(int x){
        System.out.println("I am an overloaded constructor with value of x as: "+x);

    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class myDerived extends myBase{
    myDerived(){
        //super(0);
        System.out.println("I am a derived class constructor");
    }
    myDerived(int x,int y){
        super(x);
        System.out.println("I am an overloaded Derived constructor with value of y as: "+y);
    }

    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class childofDeroived extends myDerived{
    childofDeroived(){
        System.out.println("I am a child of derived constructor");
    }
    childofDeroived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded Derived constructor with value of z as: "+z);

    }
}
public class CWH_46_Constructorsin_Inheritance {
    public static void main(String[] args) {

        myBase b=new myBase();
        //myDerived d=new myDerived();
        //myDerived d=new myDerived(4,9);
       // childofDeroived cd=new childofDeroived();
        childofDeroived cd=new childofDeroived(4,8,9);

    }
}
