public class MovieCollection {

    private Movie[] collection;
    int count = 0;

    public Movie() {
        this.collection = Movie[3];

    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, double lengthInMinutes, String genre) {
        collection[count++] = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

        public Movie [] getCollection(){
            return collection;
        }

    }




}
