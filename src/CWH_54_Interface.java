package com.company;
import java.util.Scanner;

interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int a=45;
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle,HornBicycle{
    public int x=5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
   public void applyBrake(int decrement){
        System.out.println("Apply Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("kabhi Khushi kavi Gum pee pee pee pee....");
    }
    public void blowHornmhn(){
        System.out.println("M hoon naa po po.....");
    }
}
public class CWH_54_Interface {
    public static void main(String[] args) {
        AvonCycle cycleAnuj=new AvonCycle();
        cycleAnuj.applyBrake(1);
        //System.out.println(cycleAnuj.a);

        cycleAnuj.blowHornK3g();
        cycleAnuj.blowHornmhn();
        System.out.println(cycleAnuj.x);

    }
}
