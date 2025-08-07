package com.company;


class Employee1{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is:- "+id);
        System.out.println("My name is:- "+name);
        System.out.println("The Salary is:- "+salary);

    }
    public int getSalary(){
        return salary;
    }
}

public class CWH_38_OOPS_Own_Class_Making {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee1 Anuj=new Employee1();//Instantiating a new Employee Object
        Employee1 John=new Employee1();

        //Setting Attributes for Anuj
        Anuj.id=12;
        Anuj.name="Anuj Samanta";
        Anuj.salary=30000;

        //Setting Attributes for John
        John.id=45;
        John.name="Arpan";
        John.salary=40000;

        //Printing the Attributes

        Anuj.printDetails();
        John.printDetails();
        System.out.println("The salary of John is:- ");
        int salary=John.getSalary();
        System.out.println(salary);
//        System.out.println(Anuj.id);
//        System.out.println(Anuj.name);


    }
}
