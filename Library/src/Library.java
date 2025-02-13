import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library(){
        books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library : " + book.getJudul());
    }
    public void borrowBook(Borrower borrower, Book book){
        if(books.isEmpty()){
            System.out.println("There is no book to be borrowed");
        }
        else{
            borrower.borrowBook(book);
            books.remove(book);
            System.out.println(borrower.getNama() + " borrowed: " + book.getJudul());
        }
    }

    public void returnBook(Borrower borrower, Book book){
        books.add(book);
        borrower.returnBook(book);
        System.out.println(borrower.getNama() + " returned: " + book.getJudul());
    }

    public void displayLibraryBooks(){
        if(books.isEmpty()){
            System.out.println("There is no book to be borrowed");
        }
        else{
            System.out.println("Book in Library: ");
            for(Book book : books){
                System.out.println("Title: " + book.getJudul());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println("Author: " + book.getAuthor().getNama());
                System.out.println("Biography: " + book.getAuthor().getDescription());
                System.out.println("----------------------------");
            }
        }
    }
}
