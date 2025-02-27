public class Movie {
    private String title;
    private String ID;
    Director director;

    public Movie(String title, String ID, Director director){
        this.title = title;
        this.ID = ID;
        this.director = director;
    }

    public String getID() {
        return ID;
    }
    public String getTitle(){
        return title;
    }
    public Director getDirector() {
        return director;
    }
}
