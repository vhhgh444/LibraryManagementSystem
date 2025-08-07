package com.company;
import java.util.Scanner;

interface myCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Hello Good Morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recording in 4k interface");
    }
}
interface myWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling...."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }

}

class MySmartphone extends MyCellPhone implements myCamera,myWifi{
   public void takeSnap(){
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record Snap");
    }

    /*public void record4kVideo(){
    System.out.println("Taking Sanp Video in 4k");
    }
     */
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
public class CWH_57_Default_Methods {
    public static void main(String[] args) {

        MySmartphone ms=new MySmartphone();
        ms.record4kvideo();
        String[] ar=ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }


    }
}
