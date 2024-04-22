package jdbc.ex;

import java.sql.*;
import java.util.Scanner;

/* 삭제 출력예시
삭제할 사용자 ID를 입력하세요: abcdef
해당 사용자 ID를 가진 사용자가 없습니다.

삭제할 사용자 ID를 입력하세요: spring
발견된 사용자 정보:
ID: spring
이름: 봄봄
이메일: spring@abc.com
나이: 25
이 사용자를 정말 삭제하시겠습니까? (y/n): n

삭제할 사용자 ID를 입력하세요: spring
발견된 사용자 정보:
ID: spring
이름: 봄봄
이메일: spring@abc.com
나이: 25
이 사용자를 정말 삭제하시겠습니까? (y/n): y
사용자 ID spring의 정보가 성공적으로 삭제되었습니다.
*/
public class Ex6 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        String selectSql = "SELECT * FROM users WHERE userId = ?";
        String deleteSql = "DELETE FROM users WHERE userId = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Scanner scanner = new Scanner(System.in);){
            System.out.print("삭제할 사용자 ID를 입력하세요: ");
            String userId = scanner.nextLine();

            PreparedStatement selectPstmt = conn.prepareStatement(selectSql);
            selectPstmt.setString(1, userId);
            ResultSet rs = selectPstmt.executeQuery();

            if (rs.next()) {
                System.out.println("발견된 사용자 정보:");
                System.out.println("ID: " + rs.getString("userID"));
                System.out.println("ID: " + rs.getString("username"));
                System.out.println("ID: " + rs.getString("email"));
                System.out.println("ID: " + rs.getInt("age"));

                System.out.print("이 사용자를 정말 삭제하시겠습니까? (y/n): ");
                String confirm = scanner.nextLine();

                if (confirm.equalsIgnoreCase("y")) {
                    PreparedStatement deletePstmt = conn.prepareStatement(deleteSql);
                    deletePstmt.setString(1, userId);
                    int rows = deletePstmt.executeUpdate();
                    if (rows > 0) {
                        System.out.println("사용자 ID " + userId + "의 정보가 성공적으로 삭제되었습니다.");
                    }
                    deletePstmt.close();
                }
            } else {
                System.out.println("해당 사용자 ID를 가진 사용자가 없습니다.");
            }

            selectPstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("에러가 발생했다" + e.getMessage());
        }
    }
}
