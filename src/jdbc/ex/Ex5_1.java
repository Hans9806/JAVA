package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

/* 수정 출력예시

사용자 ID를 입력하세요:summer
새 사용자 이름을 입력하세요: 초여름
새 비밀번호를 입력하세요: 1234
새 나이를 입력하세요: 25
새 이메일 주소를 입력하세요: cho@summer.com
사용자 ID summer의 정보가 성공적으로 업데이트되었습니다.

사용자 ID를 입력하세요:summer
새 사용자 이름을 입력하세요: 초여름
새 비밀번호를 입력하세요: (사용자가 입력 없이 엔터)
새 나이를 입력하세요: 25
새 이메일 주소를 입력하세요: (사용자가 입력 없이 엔터)
사용자 ID summer의 정보가 성공적으로 업데이트되었습니다.

- 비밀번호와 이메일주소는 기존값을 유지
*/
public class Ex5_1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String sql = "SELECT * FROM users WHERE userId = ?";
        String updateSql = """
                UPDATE users SET username = ?, userPassword = ?, age = ?, email = ? WHERE userId = ? 
                """;
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Scanner scanner = new Scanner(System.in);
        ){
            System.out.print("사용자 ID를 입력하세요: ");
            String userId = scanner.nextLine();

            PreparedStatement pstmt2 = conn.prepareStatement(sql);
            pstmt2.setString(1, userId);
            ResultSet rs = pstmt2.executeQuery();

            if (rs.next()) {
                String oldPassword = rs.getString("userPassword");
                String oldEmail = rs.getString("email");

                System.out.print("새 사용자의 이름을 입력하세요: ");
                String username = scanner.nextLine();

                System.out.print("새 비밀번호를 입력하세요: ");
                String userPassword = scanner.nextLine();
                if (userPassword.isEmpty()) {
                    userPassword = oldPassword;
                }

                System.out.print("새 나이를 입력하세요: ");
                int age = scanner.nextInt();

                scanner.nextLine();

                System.out.print("새 이메일 주소를 입력하세요: ");
                String email = scanner.nextLine();
                if (email.isEmpty()) {
                    email = oldEmail;
                }

                PreparedStatement pstmt = conn.prepareStatement(updateSql);

                pstmt.setString(1, username);
                pstmt.setString(2, userPassword);
                pstmt.setInt(3, age);
                pstmt.setString(4, email);
                pstmt.setString(5, userId);

                int rows = pstmt.executeUpdate();
                if (rows > 0) {
                    System.out.println("사용자 ID " +userId + "의 정보가 성공적으로 업데이트되었습니다.");
                }
                pstmt.close();
            }
            pstmt2.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("에러가 발생했다" + e.getMessage());
        }
    }
}
