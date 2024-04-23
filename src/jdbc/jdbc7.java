package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc7 {
    // Insert 삽입
    public static void main(String[] args) {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        // 연결
        try (Connection conn = DriverManager.getConnection(url, user, password)){
            String sql = """
                    INSERT INTO users (userId, username, userpassword, age, email)
                    VALUES (?, ?, ?, ?, ?)
                    """;

            // ? 위치 = Index, 값은 타입에 맞게 지정
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,"winter");
            pstmt.setString(2,"겨울");
            pstmt.setString(3,"12345");
            pstmt.setInt(4, 30);
            pstmt.setString(5,"winter@abc.com");

            // 쿼리 실행 + 실행되었을 때 행 수를 리턴
            // 정상적으로 실행될 경우 1을 리턴
            int rows = pstmt.executeUpdate();
            System.out.println("rows = " + rows);

            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
