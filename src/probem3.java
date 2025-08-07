package com.company;
import java.util.Locale;
import java.util.Scanner;

public class probem3 {
    public static void main(String[] args) {

        // Q1:- lower case transformation
       /* String a1=new String("Anuj");
        String lstring=a1.toLowerCase();
        System.out.println(lstring);
        */

        // Q2:- Space replace with underscore

        /*String text="You are a nice looking persion";
        System.out.println(text.replace(' ','_'));

         */

        // Q3: repalcement of string in between the sentence
       /* String text="Dear <|name|>,Thanks a lot";
        text=text.replace("<|name|>","Harry");
        System.out.println(text);

        */

        // Q4: detect the double and triple spaces in a string
       /* String name="Anuj Samanta is a good   boy";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

        */

        // Q5:- Escape sequence in letter format
        String letter="Dear harry,\n\tThis java couses is nice.\n\tThanks";
        System.out.println(letter);

    }
}
