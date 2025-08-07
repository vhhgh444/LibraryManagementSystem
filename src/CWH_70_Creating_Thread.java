package com.company;


class MyThread1 extends Thread{
    @Override
    public void run(){
        while (true){
        System.out.println("My Cooking thread is running");
        System.out.println("I am Happy");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Thread2 for Chatting with her");
            System.out.println("I am Sad");
        }
    }
}

public class CWH_70_Creating_Thread {
    public static void main(String[] args) {

        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();

        t1.start();
        t2.start();

    }
}
