package com.company.Constructors;
import java.util.Scanner;

class Book{
    String title;
    String  Author;
    Book [] book = new Book[3];
    String userTitle;
    boolean found=false;
    Scanner sc = new Scanner(System.in);
    void Kitab(){

        for (int i=0;i<book.length;i++){
            book[i]= new Book();
            System.out.println("Enter the book title :");
            book[i].title=sc.next();
            System.out.println("Enter the author of the book:");
            book[i].Author=sc.next();
        }
    }
    void Display(){
        for (int i=0;i<book.length;i++){
            System.out.println(" Title = "+book[i].title+", by "+book[i].Author);
        }
    }
    void Search(){
        System.out.println("Enter the book you need to find :");
        userTitle=sc.next();
        for (int i=0;i<book.length;i++){
            if(userTitle.equals(book[i].title)){
                found=true;
                System.out.println("The book is found");
                System.out.println(" Title = "+book[i].title+", by "+book[i].Author);
                break;
            }
        }
        if(found==false){
            System.out.println("The book is not found");
        }
    }
}
public class Book_finding_using_oops {
    public static void main(String[] args){
        Book x = new Book();
        x.Kitab();
        x.Display();
        x.Search();
    }
}
