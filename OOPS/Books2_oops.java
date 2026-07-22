package com.company.OOPS;
import java.util.Scanner;


class Book{
    String title;
    int pages;
    Book(String title,int pages){
        this.title=title;
        this.pages=pages;
    }
    void printDetails(){
        System.out.println("Title of the book = "+title);
        System.out.println("Number of pages = "+pages);
    }
}
public class Books2_oops {
    public static void main(String[] args){
        Book [] mahabharata ={
                new Book("MAHABHARATHA",1000000000),
                new Book("RAMAYANA",100000000),
                new Book("BHAGAVADHGEETHA",1000000)
        };
        for (Book i:mahabharata){
            i.printDetails();
        }

    }
}