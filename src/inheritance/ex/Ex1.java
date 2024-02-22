package inheritance.ex;

public class Ex1 {
    public static void main(String[] args) {
        Book book = new Book("홍길동전", "홍길동", 1911);
        ReferenceBook referenceBook = new ReferenceBook("슬기로운 생환","선생님",1972,"도덕");

        book.displayInfo();
        referenceBook.displayInfo();
    }
}
