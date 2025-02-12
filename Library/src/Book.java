public class Book {
    String judul;
    String ISBN;
    Author author;
    public Book(String judul, String ISBN, Author author){
        this.judul =  judul;
        this.ISBN = ISBN;
        this.author = author;
    }
    public String getJudul(){
        return judul;
    }
    public String getISBN(){
        return ISBN;
    }
    public  Author getAuthor(){
        return author;
    }
    public void printBook(){
        System.out.println("Title: " + getJudul());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Author: " + author.getNama());
        System.out.println("Biography: " + author.getDescription());
    }
}
