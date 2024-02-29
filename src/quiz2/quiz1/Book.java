package quiz2.quiz1;

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
        System.out.println("Title: "+this.title+",Author: "+this.author+", Year: "+this.year);
    }
}
