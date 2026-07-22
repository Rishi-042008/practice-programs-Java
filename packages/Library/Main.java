package Library;
import Library.books.Book;
import Library.members.Member;
public class Main {
    public static void main(String[] args) {
        Book a = new Book("Mahabharatha", "veda vyasa", 105);
        Book b = new Book("Think_before_talk", "Raj Shamani", 106);

        Member e1 = new Member("Rishi", 98);
        Member e2 = new Member("Rahul", 83);
        
        e1.Displaymember();
        e2.Displaymember();

        a.display();
        b.display();

    }
}
