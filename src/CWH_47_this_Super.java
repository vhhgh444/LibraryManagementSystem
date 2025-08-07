package com.company;
import java.util.Scanner;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a=v;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor");

    }
}
public class CWH_47_this_Super {
    public static void main(String[] args) {

        EkClass e=new EkClass(95);

        DoClass d=new DoClass(5);
        System.out.println(e.getA());


    }
}
