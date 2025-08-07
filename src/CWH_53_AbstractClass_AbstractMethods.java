package com.company;
import java.util.Scanner;
abstract class Parent2{
    public Parent2(){
        System.out.println("I am the Constructor of base2");
    }
    public void sayHallo(){
        System.out.println("Hallo");
    }
    abstract public void greet();
}

class Child2 extends Parent2{
    public void greet(){
        System.out.println("Good Morning");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class CWH_53_AbstractClass_AbstractMethods {
    public static void main(String[] args) {

        Child2 c=new Child2();

    }
}
