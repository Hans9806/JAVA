package generic.ex.ex5;

public class Movie implements Media {
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

    @Override
    public String getDetails() {
        return "Director : "+director;
    }
}
