package com.company;

abstract class Pen1{
    abstract void write();
    abstract void refill();
}

class fountainpen1 extends Pen1{
    void write(){
        System.out.println("Write with the pen.");
    }
    void refill() {
        System.out.println("Refill the pen");
    }
    void changeNib(){
        System.out.println("When the ink finish you should change the nib for reusable");
    }
}
class Monkey1{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting....");
    }
}

interface BasicAnimal1{
    void eat();
    void sleep();
}
class Human1 extends Monkey1 implements BasicAnimal1{
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


public class problem11 {
    public static void main(String[] args) {

        // Q1 & Q2:-making an abstract class pen and after that extend it in another classs name fountainpen.
        fountainpen1 fp=new fountainpen1();
        fp.refill();
        fp.changeNib();
        fp.write();

        Human1 harry=new Human1();
        harry.eat();
        harry.sleep();

    }
}
