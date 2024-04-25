package jdbc.ex.book;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class BookMain {
    private static Scanner scanner = new Scanner(System.in);
    private static BookDao bookDao;

    public static void main(String[] args) {
        bookDao = new BookDaoImpl(DatabaseUtil.getConnection());

        while (true) {
            System.out.print("""
                    1. 도서 추가
                    2. 도서 삭제
                    3. 도서 수정
                    4. 도서 조회
                    5. 종료
                    메뉴 선택 :   """);
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> insert();
                case "2" -> delete();
                case "3" -> update();
                case "4" -> select();
                case "5" -> {DatabaseUtil.close(); return;}
            }
        }
    }

    private static void select() {
        while (true) {
            System.out.println("조회할 방법을 고르세요");
            System.out.println("--------------------------------");
            System.out.println("""
                    1. 모든 도서 조회
                    2. ISBN으로 특정 도서 조회
                    3. 저자나 제목으로 도서 조회
                    """);
            String list = scanner.nextLine();

            switch (list) {
                case "1" -> alllist();
                case "2" -> isbnList();
                case "3" -> titleOrAuthorList();
            } break;
        }
    }

    private static void titleOrAuthorList() {
        System.out.println("제목 또는 저자를 입력하세요 > ");
        String input = scanner.nextLine();

        BookDto bookDto = null;

        // 입력값이 제목이거나 저자 중 하나에 해당하는지 확인
        bookDto = bookDao.getBookByTitleOrAuthor(input);
        if (bookDto != null) {
            System.out.println("도서가 발견되었습니다. ");
            System.out.println("ISBN: " + bookDto.getIsbn());
            System.out.println("제목: " + bookDto.getTitle());
            System.out.println("저자: " + bookDto.getAuthor());
            System.out.println("출판연도: " + bookDto.getPublish_year());
            System.out.println("장르: " + bookDto.getGenre());
        } else {
            // 제목이나 저자로 검색되지 않았을 경우
            System.out.println("해당하는 도서가 없습니다.");
        }
    }


    private static void isbnList() {
        System.out.println("조회할 ISBN을 입력하세요 > ");
        String isbn = scanner.nextLine();
        BookDto bookDto = bookDao.getBookByIsbn(isbn);
        System.out.println("제목: "+ bookDto.getTitle());
        System.out.println("저자: "+ bookDto.getAuthor());
        System.out.println("출판연도: "+ bookDto.getPublish_year());
        System.out.println("장르: "+ bookDto.getGenre());
    }

    private static void alllist() {
        List<BookDto> allBooks = bookDao.getAllBooks();
        for (BookDto book : allBooks) {
            System.out.printf("%20s %30s %30s %5d %20s \n",
                    book.getIsbn(), book.getTitle(), book.getAuthor(),
                    book.getPublish_year(), book.getGenre());
        }
    }


    private static void update() {
        System.out.print("수정할 책의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        BookDto book = bookDao.getBookByIsbn(isbn);

        if (book != null) {
            System.out.print("새 제목을 입력하세요: ");
            String title = scanner.nextLine();
            if (!title.isEmpty()) book.setTitle(title);

            System.out.print("새 저자를 입력하세요: ");
            String author = scanner.nextLine();
            if (!author.isEmpty()) book.setAuthor(author);

            System.out.print("새 출판연도를 입력하세요: ");
            int publish_year = scanner.nextInt();
            if (publish_year != 0) book.setPublish_year(publish_year);

            scanner.nextLine();

            System.out.print("새 장르를 입력하세요: ");
            String genre = scanner.nextLine();
            if (!genre.isEmpty()) book.setGenre(genre);

            bookDao.update(book);
            System.out.println("책의 정보가 변경되었습니다.");
        } else {
            System.out.println("존재하지 않는 책의 정보입니다.");
        }
    }

    private static void insert() {
        System.out.println("[도서 추가]");
        System.out.print("ISBN 입력: ");
        String isbn = scanner.nextLine();
        System.out.print("제목 입력: ");
        String title = scanner.nextLine();
        System.out.print("저자 입력: ");
        String author = scanner.nextLine();
        System.out.print("출판연도 입력: ");
        int publish_year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("장르 입력: ");
        String genre = scanner.nextLine();
        System.out.println("도서가 추가 되었습니다.");


        BookDto bookDto = new BookDto(isbn, title, author, publish_year, genre);

        bookDao.insert(bookDto);
    }

    private static void delete() {
            System.out.print("삭제할 책의 ISBN 번호를 입력하세요: ");
            String isbn = scanner.nextLine();
            if (bookDao.getBookByIsbn(isbn) != null) {
                bookDao.delete(isbn);
                System.out.println(isbn +"도서가 삭제되었습니다." );
            } else {
                System.out.println("존재하지 않는 도서입니다.");
            }

    }
}
