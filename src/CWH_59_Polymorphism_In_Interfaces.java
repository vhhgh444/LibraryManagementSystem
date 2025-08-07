package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
interface myCamera2{
    void takeSnap();
    void recordVideo();
}
interface myWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling...."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }

}

class MySmartphone2 extends MyCellPhone2 implements myCamera2,myWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record Snap");
    }

    public void record4kVideo(){
        System.out.println("Taking Sanp Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networklist={"Anuj","Arpan","Tuhin","Jitu"};
        return networklist;
    }

    @Override
    public String[] getNetwork() {
        return new String[0];
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to"+network);
    }
}

public class CWH_59_Polymorphism_In_Interfaces {
    public static void main(String[] args) {

        myCamera2 cm1=new MySmartphone2();
        //cm1.getNetworks(); --> not allowed
        cm1.recordVideo();

        MySmartphone2 s=new MySmartphone2();
        s.getNetwork();
        s.recordVideo();
        System.out.println("Saw the last 4 dighit of the number:- ");
        s.callNumber(1826);

    }
}
