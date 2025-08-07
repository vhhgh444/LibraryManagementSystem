package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class problem14 {
    public static void main(String[] args) {


        // Q1:- Write a code for making an arraylist
        ArrayList arr=new ArrayList();
        arr.add("S1");
        arr.add("S2");
        arr.add("S3");
        arr.add("S4");
        arr.add("S5");
        arr.add("S6");
        arr.add("S7");
        arr.add("S8");
        arr.add("S9");
        arr.add("S10");
        for (Object o:arr){
            System.out.println(o);
        }

        // Q2:- Print the time using date class in proper hours,minutes,seconds format
        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // Q3:- Using calendar class print the format

        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // Q4:- Solve Q2 using java.time api
        LocalTime t=LocalTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String myDate=t.format(df);
        System.out.println(myDate);

        // Q5:- making a set
        HashSet<Integer>s=new HashSet();
        s.add(51);
        s.add(52);
        s.add(53);
        s.add(54);
        s.add(55);
        s.add(56);
        System.out.println(s);
    }
}
