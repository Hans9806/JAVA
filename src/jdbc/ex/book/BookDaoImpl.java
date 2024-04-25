package jdbc.ex.book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {
    Connection conn;
    public BookDaoImpl(Connection conn) {
        this.conn = conn;  }

    @Override
    public void insert(BookDto book) {
        String sql = """
                INSERT INTO books (isbn, title, author, publish_year, genre)
                VALUES (?, ?, ?, ?, ?)
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4, book.getPublish_year());
            pstmt.setString(5, book.getGenre());

            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String isbn) {
        String sql = """
                DELETE FROM books WHERE isbn = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, isbn);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(BookDto book) {
        String sql = """
                UPDATE books SET title = ?, author = ?, publish_year = ?, genre =? WHERE isbn = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getPublish_year());
            pstmt.setString(4, book.getGenre());
            pstmt.setString(5, book.getIsbn());

            pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public BookDto getBookByIsbn(String isbn) {
        String sql = """
                SELECT isbn, title, author, publish_year, genre FROM books WHERE isbn = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new BookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );

            }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BookDto getBookByTitleOrAuthor(String input) {
        return null;
    }

    @Override
    public BookDto getBookByTitleAuthor(String title, String author) {
        String sql = """
                SELECT isbn, title, author, publish_year, genre FROM books 
                WHERE title = ? OR author =?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new BookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
            }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<BookDto> books = new ArrayList<>();
        String sql ="SELECT * FROM books";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                BookDto book = new BookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }
}
