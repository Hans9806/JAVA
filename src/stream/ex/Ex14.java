package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
    문제: 도서관 책 관리 시스템

    도서관에는 여러 장르의 책들이 있으며, 각 책은 제목, 장르, 저자, 출판년도, 페이지 수 정보를 가지고 있습니다. 책 정보를 관리하고, 특정 조건에 맞는 책들을 찾아내는 작업이 필요합니다.

    요구사항
    - 모든 책의 평균 페이지 수를 계산하세요.
    - 장르가 "소설"인 책들만 추려서, 이들의 평균 출판년도를 계산하세요.
    - 2010년 이후에 출판된 책들 중 페이지 수가 300페이지 이상인 책의 제목들을 출력하세요.
    - 각 장르별로 책이 몇 권씩 있는지 계산하세요.
    - 가장 많은 책이 출판된 장르를 찾으세요.
    */
public class Ex14 {

       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           List<Book> books = Arrays.asList(
                   new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                   new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                   new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                   new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                   new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                   new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
           );

           while (true) {
               System.out.println("1. 모든 책의 평균 페이지 수 계산");
               System.out.println("2. 특정 장르 책의 평균 출판년도 계산");
               System.out.println("3. 특정 연도 이후 풀판된, 최소 페이지 이상 책의 제목 출력");
               System.out.println("4. 각 장르별 책의 수 계산");
               System.out.println("5. 가장 많은 책이 출판된 장르 찾기");
               System.out.println("0. 종료");
               System.out.print("실행할 작업을 선택하세요: ");
               int option = scanner.nextInt();

               switch (option) {
                   case 1:
                       int avgPage = (int) books.stream()
                               .mapToInt(Book::pages)
                               .average()
                               .orElse(0);
                       System.out.println("모든 책의 평균 페이지 수: "+avgPage);
                       break;
                   case 2:
                       System.out.print("평균 출판년도를 계산할 장르를 고르세요: ");
                       String bookGenre = scanner.next();
                       double avgYear = books.stream()
                               .filter(book -> book.genre().equals(bookGenre))
                               .mapToInt(Book::publishYear)
                               .average()
                               .orElse(0);
                       System.out.println("[ "+bookGenre+" ] 장르 책의 평균 출판년도: "+avgYear);
                       break;
                   case 3:
                       System.out.print("조회할 최소 연도를 입력하세요: ");
                       int year = scanner.nextInt();
                       System.out.print("최소 페이지를 입력하세요: ");
                       int page = scanner.nextInt();

                       List<String> titles = books.stream()
                               .filter(book -> book.publishYear() >= year && book.pages() >= page)
                               .map(Book::title)
                               .toList();
                       System.out.println(year + "년 이후 출판되고 "+ page+ "페이지 이상인 책의 제목들: "+titles);
                       break;
                   case 4:
                       Map<String, Long> count = books.stream()
                               .collect(Collectors.groupingBy(Book::genre,
                                       Collectors.counting()));
                       System.out.println("각 장르별 책의 수: "+count);
                       break;
                   case 5:
                       String mostGenre = books.stream()
                               .collect(Collectors.groupingBy(Book::genre,
                                       Collectors.counting()))
                               .entrySet().stream()
                               .max(Map.Entry.comparingByValue())
                               .map(Map.Entry::getKey)
                               .orElse("");
                       System.out.println("가장 많은 책이 출판된 장르: "+mostGenre);
                       break;
                   case 0:
                       System.out.println("프로그램을 종료합니다.");
                       return;
                   default:
                       System.out.println("잘못된 입력입니다.");
               }
               System.out.println();
           }
       }
    public record Book(String title, String genre, String author, int publishYear, int pages) {}
}
