package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
    연습문제 2: 사용자 삭제
    요구사항: 사용자로부터 userId를 입력받아 해당 userId를 가진 사용자의 데이터를 데이터베이스에서 삭제하세요.

    - 사용자로부터 userId를 입력받습니다.
    - 해당 userId를 가진 사용자의 데이터를 users 테이블에서 삭제합니다.
     */
public class Ex4 {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/jdbc";
            String user = "root";
            String password = "1234";

            String sql = """
                    DELETE FROM users WHERE userId = ?
                    """;
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Scanner scanner = new Scanner(System.in)
            ){
                System.out.print("삭제할 userId를 입력하세요: ");
                String userId = scanner.nextLine();

                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,userId);

                int rows = pstmt.executeUpdate();
                if (rows == 1) {
                    System.out.println(rows+"개의 행이 삭제되었습니다.");
                }
            } catch (SQLException e) {
                System.out.println("SQL 예외 발생: "+ e.getMessage());
            }
        }
}
