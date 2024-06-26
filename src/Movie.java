public class Movie {
    //Attributter
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private double lengthInMinutes;
    private String genre;

    //Konstruktør
    public Movie(String title, String director, int yearCreated, boolean isInColor, double lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;

    }
    //Getter-metoden

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String newDirector) {
        this.director = newDirector;
    }

    public int getYearCreated() {
        return yearCreated;

    }

    public void setYearCreated(int newYearCreated) {
        this.yearCreated = newYearCreated;

    }

    public boolean IsInColor() {
        return isInColor;

    }

    public void setIsInColor(boolean newIsInColor) {
            this.isInColor = newIsInColor;

    }

    public double getLengthInMinutes() {
        return lengthInMinutes;

    }

    public void setLengthInMinutes(double newLengthMinutes) {
        this.lengthInMinutes = newLengthMinutes;
    }

    public String getGenre() {
        return genre;

    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }
}

