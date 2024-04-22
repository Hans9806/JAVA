package jdbc.ex;

import java.sql.*;

public class Ex1_2 {
    // 연습문제.
    // scott DB에서 10번 부서에 일하는 직원의 이름과 직무, 연봉을 조회하여 출력하세요.
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        String query = "SELECT ename, job, sal FROM emp " +
                "WHERE deptno = 10";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query);
        ) {
            while (rs.next()) {
                System.out.println("이름: " + rs.getString("ename")
                        + " 직무: " + rs.getString("job")
                        + " 연봉: " + rs.getInt("sal")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}