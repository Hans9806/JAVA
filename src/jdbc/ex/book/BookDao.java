package jdbc.ex.book;

import jdbc.dao.MemberDto;

import java.util.List;

public interface BookDao {

    void insert(BookDto book);
    void delete(String isbn);

    void update(BookDto book);


    BookDto getBookByIsbn(String isbn);

    BookDto getBookByTitleOrAuthor(String input);

    BookDto getBookByTitleAuthor(String title, String author);

    List<BookDto> getAllBooks();
}

