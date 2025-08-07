package com.company;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CWH_DateTimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDAte=dt.format(df);
        System.out.println(myDAte);
    }
}
