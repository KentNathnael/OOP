import java.awt.print.Book;

public class Borrower{
    String nama;
    public Borrower(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }

    public void displayBorrowedBooks(){
        System.out.println(getNama() + "'s Borrowed Books: ");
        Book displaybook = new Book();
        displaybook.
    }

    public void printBook(){
        System.out.println("Title: " + getJudul());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Author: " + author.getNama());
        System.out.println("Biography: " + author.getDescription());
    }
}
