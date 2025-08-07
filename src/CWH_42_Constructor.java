package com.company;
import java.util.Scanner;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id=45;
        name="Your_name_here";
    }
    public MyMainEmployee(String myName, int myId){
        id=myId;
        name="Your_name_here";
        name=myName;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
       this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}
public class CWH_42_Constructor {
    public static void main(String[] args) {
        MyMainEmployee anuj=new MyMainEmployee("Programming with Anuj",56);
        //MyMainEmployee anuj=new MyMainEmployee();
       // anuj.setName("Anuj Samanta");
        // anuj.getName();

        System.out.println(anuj.getId());
        System.out.println(anuj.getName());


    }
}
