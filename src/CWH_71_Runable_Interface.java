package com.company;

class MyThreadrunable implements Runnable{
    public void run(){
        System.out.println("I am a thread 1 not a threat");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a thread 2 not a threat ");
    }
}
public class CWH_71_Runable_Interface {
    public static void main(String[] args) {

        MyThreadrunable t1=new MyThreadrunable();
        Thread s1=new Thread(t1);
        MyThreadRunnable2 t2=new MyThreadRunnable2();
        Thread s2=new Thread(t2);
        s1.start();
        s2.start();

    }
}
