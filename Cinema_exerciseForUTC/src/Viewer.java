import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String name;
    private List<Movie> rented;

    public Viewer(String name){
        this.name = name;
        rented = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addRented(Movie movie){
        rented.add(movie);
    }

    public void displayRentedMovies(){
        System.out.println(name + "'s Rented Movies:");
        for(Movie movie : rented){
            System.out.println("Title: " + movie.getTitle());
            System.out.println("ID: " + movie.getID());
            System.out.println("Director: " + movie.getDirector().getNama());
            System.out.println("Biography: " + movie.getDirector().getDescription());
            System.out.println("-------------------------------------------------");
        }
    }
    public void returnRented(Movie movie){
        rented.remove(movie);
    }
}
