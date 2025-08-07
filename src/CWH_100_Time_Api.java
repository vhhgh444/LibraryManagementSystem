package com.company;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class CWH_100_Time_Api {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);

        LocalTime t=LocalTime.now();
        System.out.println(t);
    }
}
