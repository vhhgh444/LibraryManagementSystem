package com.company;


import java.util.List;

class Book{
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;
}
class user{
    private int sid;
    private String name;
    List<Book> borrowedBooks;
}
class admin extends user{
    void addBook(Book book);
    void removeBook(int bookID);
}
class Library1{
    List <Book>books;
    List<user>users;
    void addBook(Book book);


}
public class Library_management {
    public static void main(String[] args) {

    }
}
