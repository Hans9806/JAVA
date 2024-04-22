package jdbc.ex;

import java.sql.*;

public class Ex1_1 {
    // 연습문제 scott DB에서 10번 부서에 일하는 직원의 이름과 직무, 연봉을 조회하여 출력하세요.
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM emp WHERE deptno = 10");) {

            // 4. 결과 처리
            while (rs.next()) {
                String ename = rs.getString(2); // = rs.getString("ename")
                String job = rs.getString(3);   // = rs.getString("job")
                int sal = rs.getInt(6);         // = rs.getInt("sal")
                System.out.println("이름: "+ename+", 직무: "+job+", 연봉: "+sal);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
