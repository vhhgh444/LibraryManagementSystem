package com.company;
import java.util.Scanner;

public class CWH_15_Practice_Chapter3 {

    public static void main(String[] args) {

        //problem1:-

//        String name="Manoj";
//        name=name.toLowerCase();
//        System.out.println(name);


        //Problem 2:-
//        String text="To Lower Case";
//        text=text.replace(" ","_");
//        System.out.println(text);

        //Problem3:-
        String letter="Dear name, Thanks a lot!";
        letter=letter.replace("name","manoj");
        System.out.println(letter);



        //Problem 4:-

        String myString="This string contain  double and triple   spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5:-

        String myLetter="Dear Anuj,\n\t This Java course is nice.\n\t Thanks";
        System.out.println(myLetter);

    }
}
