package com.company;

class Library{

    String[] books;
    int no_of_books;
    String [] student;
    int noOfStudent;
    Library(){
        this.books=new String[100];
        this.no_of_books=0;
        this.student=new String[2000];
        this.noOfStudent=0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available books are:- ");
        for(String book : this.books){
            if (book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

    void issueBook(String book){
            for(int i=0;i<this.books.length;i++){
                if (this.books[i].equals(book)){
                    System.out.println("The book has been issued!");
                    this.books[i]=null;
                    return;
            }
                System.out.println("* "+book);

            }
        System.out.println("This book does not exist");
        }

        void returnBook(String book){
//        this.books[no_of_books]=book;
            addBook(book);
        }
    void addStudent(String student){
        this.student[noOfStudent]=student;
        noOfStudent++;
        System.out.println(student+" can accessed the book");
    }
    void showAvailableStudents(){
        System.out.println("Issued Student who are accessed the book:- ");
        for(String student : this.student){
            if (student==null){
                continue;
            }
            System.out.println("* "+student);
        }
    }
    }

    // For Students who will issued book from library


public class CWH_51_Online_Library {
    public static void main(String[] args) {

        /* You have to implement a library using Java Class Library
        Methods:- issueBook,returnBook,addBook
        Properties:-Array to store the available books.
        Array to store the issued books
         */

        // Book Available in Library

        Library centralLibrary=new Library();
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("Data Structure");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("BAsic Mathametics");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("C++");
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.addStudent("Anuj");
        centralLibrary.addStudent("Arpan");
        centralLibrary.addStudent("Jitu");
        centralLibrary.addStudent("Tuhin");
        centralLibrary.addStudent("Snehasish");
        centralLibrary.showAvailableStudents();

    }
}
