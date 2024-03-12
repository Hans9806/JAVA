package generic.ex.ex5;

public class Music implements Media {
    private String title;
    String artist;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDetails() {
        return "Artist : "+ artist;
    }
}
