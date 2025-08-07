package com.company;
import java.util.Scanner;
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Cahnge the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class CWH_60_PracticeSet_Chapter11 {
    public static void main(String[] args) {

        FountainPen pen=new FountainPen();
        //Problem1:-
        pen.write();
        pen.refill();
        //Problem2:-
        pen.changeNib();

        //Problem 3:-
        Human anuj=new Human();
        anuj.eat();
        anuj.sleep();
        anuj.speak();

        //Problem 5:-
        Monkey m1=new Human();
        m1.bite();
        m1.jump();

        BasicAnimal lovish=new Human();
        lovish.eat();
        lovish.sleep();

    }
}
