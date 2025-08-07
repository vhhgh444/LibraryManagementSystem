package com.company;
import java.util.Scanner;


class Practice12A extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Practice12B extends Thread{
    public void run(){
        while (true){
            System.out.println("Well Come");
        }
    }
}
public class problem12 {
    public static void main(String[] args) {

        Practice12A p1=new Practice12A();
       // p1.setPriority(6);
        Practice12B p2=new Practice12B();
       // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
        //p1.start();
        //p2.start();

    }

}
