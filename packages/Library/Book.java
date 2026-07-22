package Library.books;

public class Book{
    String Title;
    String Author;
    int isbn;

    public Book(String Title , String Author , int isbn) {
        this.Author=Author;
        this.isbn=isbn;
        this.Title = Title;
    }
    public String getAuthor(){
        return Author; 
    }
    public String getTitle(){
        return Title;
    }
    public int getisbn(){
        return isbn;
    }
    public void display(){
        System.out.println("Author = "+Author);
        System.out.println("Title = "+Title);
        System.out.println("International book number = "+isbn);
    }
    
}
