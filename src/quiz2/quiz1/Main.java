package quiz2.quiz1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.J.R.Tolkien",1954);
        ReferenceBook referenceBook = new ReferenceBook("Math Handbook","John Doe",1999,"Mathematics");

        book.displayInfo();
        referenceBook.displayInfo();
    }
}
