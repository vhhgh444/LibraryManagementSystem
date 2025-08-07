package com.company;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Take the input from the user:- ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Choosen by user1:- ");
        String user1=sc.nextLine();
        System.out.println("Choosen by user2:- ");
        String user2=sc.nextLine();
        if(user1=="Rock"&& user2=="Paper"){
            System.out.println("User2 won the game");
        }
        if(user1=="Paper" && user2=="Rock"){
            System.out.println("User1 win the match");
        }
        if(user1=="Rock"&& user2=="Sciser"){
            System.out.println("User1 won the game");
        }
        if(user1=="Sciser" && user2=="Rock"){
            System.out.println("User2 win the match");
        }
        if(user1=="Sciser"&& user2=="Paper"){
            System.out.println("User1 won the game");
        }
        if(user1=="Paper" && user2=="Sciser"){
            System.out.println("User2 win the match");
        }
        else if (user1==user2) {
            System.out.println("The game is draw");

        }
        else{
            System.out.println("You are fool");
        }
    }
}
