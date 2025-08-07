package com.company;


class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you "+this.getName());
        while(true){
          // System.out.println("I am a thread");
            System.out.println("Thank you: "+this.getName());
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyThr2 extends Thread{
    public MyThr2(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you "+this.getName());
        while(true){
            // System.out.println("I am a thread");
            System.out.println("Thank you: "+this.getName());
        }
    }
}
public class CWH_74_Thread_Priorities {
    public static void main(String[] args) {
//
//        MyThr1 t1=new MyThr1("Anuj1");
//        MyThr1 t2=new MyThr1("Anuj2");
//        MyThr1 t3=new MyThr1("Anuj3");
//        MyThr1 t4=new MyThr1("Anuj4");
//        MyThr1 t5=new MyThr1("Anuj5");
//
//        t5.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
        MyThr1 t1=new MyThr1("Anuj");
        MyThr2 t2=new MyThr2("Tuhin");
        t1.start();
//        try {
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
