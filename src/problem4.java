package  com.company;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

        // Q1:-Outcome of the given question
        /*int a=10;
        if (a==11){
            System.out.println("I am 11");
        }
        else {
            System.out.println("I am not 11");
        }
         */

        // Q2:- Check the student is pass or fail
       /* System.out.println("Enter the marks of three subjects:- ");
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2= sc.nextInt();
        int s3=sc.nextInt();
        int total=s1+s2+s3;
        float percent=(total/300f)*100;
        System.out.println(percent);
        if(s1>=33 && s2>=33 && s3>=33){
            System.out.println("He passed in all subject");
        }
        if (percent>=40.0) {
            System.out.println("He passed in the full exam");
        }
        else {
            System.out.println("Failed in the exam");
        }
        */

        // Q3:- Calculate income tax
       /* System.out.println("Enter the salary of the employees:- ");
        Scanner sc=new Scanner(System.in);
        float salary=sc.nextFloat();
        if(salary==250000){
            System.out.println("The tax payment by the employee is:- "+2.5+0);
        }
        else if (salary>250000 && salary<=500000) {
            System.out.println("The tax pay by the employee is:- "+salary*0.05f);
        }
        else if (salary>500000 && salary<=1000000) {
            System.out.println("The tax pay by the employee is:- "+salary*0.2f);
        }
        else if (salary<1000000) {
            System.out.println("The tax pay by the employee is:- "+salary*0.3f);
        }
        else {
            System.out.println("If you have not pay slary from the company you don't pay any tax");
        }
        */

        // Q4:- Find out the day of the week
        System.out.println("The day of the week is:- ");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thrusday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }

    }
}
