package com.company;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
    //void thisMethod2();
}

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on the phone");
    }

        }
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 pm");
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }

}
public class CWH_108_Java_annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        NewPhone phone=new NewPhone();
        phone.showTime();
        phone.sum(5,6);

    }
}
