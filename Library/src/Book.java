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
}
