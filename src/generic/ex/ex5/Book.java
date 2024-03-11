package generic.ex.ex5;

public class Book implements Media {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDetails() {
        return "Author : " + author;
    }
}
