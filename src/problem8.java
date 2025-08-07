package com.company;
import java.util.Scanner;

class Employee_A{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void  setName(String n){
        name=n;
    }
}

class Cellphone {
    public void ringing(){
        System.out.println("Ring....");
    }
    public void vibrating(){
        System.out.println("Vibrating....");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle1{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class Tommy_Vecetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }public void run (){
        System.out.println("Run run run ......");
    }
    public void fire(){
        System.out.println("Enemy spotted fire the enemy");
    }
}
class Circle1{
    int r;
    public float area(){
        return 3.141f*r;
    }
    public float perimeter(){
        return 2*3.141f*r;
    }
}
public class problem8 {
    public static void main(String[] args) {

        // Q1:- Making class of Employee and print it's details

       /* Employee_A anuj=new Employee_A();
        anuj.setName("Anuj Samanta");
        anuj.salary=180000;
        System.out.println("The change name is:- "+anuj.getName());
        System.out.println("The salary of Anuj is:- "+anuj.getSalary());

        */

        // Q2:- Making a class cellphone to print ringing and vibrating using methods

        /*Cellphone samsung=new Cellphone();
        samsung.ringing();
        samsung.vibrating();
         */

        // Q3:- Calculate the area, side, perimeter of a square

       /* Square sq=new Square();
        sq.side=4;
        System.out.println("The area of the square is:- "+sq.area());
        System.out.println("The perimeter of the square is:- "+sq.perimeter());
        */

        // Q4:- Calculate the area, side,perimeter of a rectangle
       /* Rectangle1 rec=new Rectangle1();
        rec.length=5;
        rec.breadth=4;
        System.out.println("The area of the rectangle is:- "+rec.area());
        System.out.println("The perimeter of the rectangle is:- "+rec.perimeter());
        */

        // Q5:- Create class of Tommy Vecetti with different functions
       /* Tommy_Vecetti tv=new Tommy_Vecetti();
        tv.hit();
        tv.run();
        tv.fire();
        */

        // Q6:- Calculate the area,perimeter of the circle
        Circle1 cir=new Circle1();
        cir.r=4;
        System.out.println("The area of the circle is:- "+cir.area());
        System.out.println("The perimeter of the circle is:- "+cir.perimeter());


    }
}
