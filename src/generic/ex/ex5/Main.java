package generic.ex.ex5;


import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        List<Media> myMediaList = new ArrayList<>();
        myMediaList.add(new Book("1984", "George Orwell"));
        myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));

        List<Book> myBookList = new ArrayList<>();
        myBookList.add(new Book("메밀꽃 필무렵", "황순원"));
        myBookList.add(new Book("노인과 바다", "헤밍웨이"));

        printMediaDetails(myMediaList);
        printMediaDetails(myBookList);
    }
    /*
        미디어 정보 출력 메소드 구현:
        printMediaDetails라는 이름의 static 메소드를 구현합니다.
        이 메소드는 List<? extends Media> 타입의 매개변수를 받고,
        리스트 내의 모든 미디어 정보를 출력합니다.

        Media 인터페이스에는 getTitle() 메소드가 정의되어 있으며,
        Book과 Movie 클래스는 각각의 추가 정보(예: 저자, 감독)를
         출력할 수 있는 메소드를 가지고 있습니다
     */
    private static void printMediaDetails(List<? extends Media> myMediaList) {
        // 객체지향적인 방법
        for (Media media : myMediaList) {
            System.out.println("Title : " + media.getTitle());
            System.out.println(media.getDetails());
        }


     /*   // instanceOf 로 타입체크하는 방법
        for (Media media : myMediaList) {
            System.out.println("Title : " + media.getTitle());
            // 책이면 author
            if (media instanceof Book) {
                System.out.println("Author : " + ((Book) media).author);
                // 영화면 director
            } else if (media instanceof Movie) {
                System.out.println("Director : " + ((Movie) media).director);
            }
            System.out.println();

        }*/
    }
}