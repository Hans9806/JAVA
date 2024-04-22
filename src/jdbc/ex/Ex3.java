package jdbc.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
연습문제 : 사용자 정보 업데이트
요구사항: 사용자로부터 userId, username, password, age, email을 입력받아 해당
userId를 가진 사용자의 정보를 업데이트하세요.

사용자로부터 다음 정보를 입력받습니다:
userId: 업데이트할 사용자 ID
username: 새 사용자 이름
password: 새 비밀번호
age: 새 나이
email: 새 이메일 주소
입력받은 정보를 데이터베이스의 users 테이블에 업데이트합니다.
 */
public class Ex3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Scanner scanner = new Scanner(System.in)
        ){
            System.out.print("userId: ");
            String userId = scanner.nextLine();

            System.out.print("username: ");
            String userName = scanner.nextLine();

            System.out.print("userPassword: ");
            String userPassword = scanner.nextLine();

            System.out.print("age: ");
            int age = scanner.nextInt();

            scanner.nextLine();

            System.out.print("email: ");
            String email = scanner.nextLine();

            String sql = """
                    UPDATE users SET userName = ?, userPassword = ?, age = ?, email = ?
                    WHERE userId = ?
                    """;
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.setString(2,userPassword);
            pstmt.setInt(3,age);
            pstmt.setString(4,email);
            pstmt.setString(5,userId);

            int rows = pstmt.executeUpdate();
            if (rows == 1) {
                System.out.println(rows +"개의 행을 업데이트 했습니다.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
