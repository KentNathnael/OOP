import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<Book> borrowed;
    public Library(){
        books = new ArrayList<>();
        borrowed = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library : " + book.getJudul());
    }
    public void borrowBook(Borrower borrower, Book book){
        borrowed.add(book);
        books.remove(book);
        System.out.println(borrower.getNama() + "borrowed: " + book.getJudul());
    }

    public void returnBook(Borrower borrower, Book book){
        books.add(book);
        borrowed.remove(book);
        System.out.println(borrower.getNama() + "returned: " + book.getJudul());
    }

    public void displayLibraryBooks(){
        System.out.println("Title: " + books.);
        System.out.println("ISBN: " + getISBN());
        System.out.println("Author: " + author.getNama());
        System.out.println("Biography: " + author.getDescription());
    }
}
