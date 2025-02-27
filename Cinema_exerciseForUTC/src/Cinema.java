import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies;
    public Cinema(){
        movies = new ArrayList<>();
    }
    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.println("Movie added to cinema: " + movie.getTitle());
    }
    public void rentMovie(Viewer viewer, Movie movie){
        viewer.addRented(movie);
        movies.remove(movie);
        System.out.println(viewer.getName() + " rented: " + movie.getTitle());
    }
    public void returnMovie(Viewer viewer, Movie movie){
        movies.add(movie);
        viewer.returnRented(movie);
        System.out.println(viewer.getName() + "returned: " + movie.getTitle());
    }
    public void displayAvailableMovies(){
        System.out.println("Movies in Cinema:");
        for(Movie movie : movies){
            System.out.println("Title: " + movie.getTitle());
            System.out.println("ID: " + movie.getID());
            System.out.println("Director: " + movie.getDirector().getNama());
            System.out.println("Biography: " + movie.getDirector().getDescription());
            System.out.println("-------------------------------------------------");
        }
    }
}
