package generic.ex.ex4;

public class Movie implements Media{
    private String title;

    private String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
    @Override
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return director;
    }
}
