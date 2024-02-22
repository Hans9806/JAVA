package inheritance.ex;

public class Book {
    protected String title;
    protected String author;
    protected int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void displayInfo() {
        System.out.println("제목: "+title+", 저자: "+author+", 출판 연도: "+year);
    }

}
