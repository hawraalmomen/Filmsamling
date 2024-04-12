import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> moviedata = new ArrayList<>();

    private Movie[] collection;
    int count = 0;

    public MovieCollection() {
        this.collection = new Movie[5];

    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, double lengthInMinutes, String genre) {
        collection[count++] = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);



    }
    public Movie [] getCollection(){
        return collection;
    }

    public void searchMovie(String input) {
        for(Movie movie : collection) {
            if(movie.getTitle().toLowerCase().contains(input.toLowerCase())) {
                System.out.println("Find movie: " + movie.getTitle());
            }
        }
    }





}
