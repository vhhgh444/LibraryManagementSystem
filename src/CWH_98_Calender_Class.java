package co.comapny;


import java.util.Calendar;

public class CWH_98_Calender_Class {
    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.getCalendarType());
 //        System.out.println(c.getTimeZone());


        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}
