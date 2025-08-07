package com.company;
import java.util.Scanner;


class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class CWH_40_Acess_Modifier {
    public static void main(String[] args) {

        MyEmployee anuj=new MyEmployee();
//        anuj.id=45;
//        anuj.name="Anuj Samnata";

        anuj.setName("Anuj Samanta");
        System.out.println(anuj.getName());

    }
}
