package jdbc.board.ex;

import jdbc.board.Board;
import jdbc.board.BoardEx8;

import java.sql.*;
import java.util.Scanner;

/*
 [연습문제1]
 앞에서 구현한 게시판에서 다음 내용과 같이 새 사용자를 가입하기 기능을 추가해보세요.

 [실행내용]
 1. 메인 메뉴에 '4.]oin' 메뉴를 다음과 같이 추가한다.

 ```
 메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Join | 5.Exit
 메뉴선택:
 ```

 2. '4.Join' 메뉴를 선택했을 때 새 사용자 정보를 입력받도록 하고. 보조 메뉴를 다음과 같이 출력한다.
 ```
 [새 사용자 입력]
 아이디: java
 이름 : 김자바
 비밀번호: 12345
 나이 : 26
 이메일 : java@mycompany.com

 -------------------------------------------------------------------
 보조메뉴: 1.Ok | 2.Cancel
 메뉴선택: 2
 ```

 3. User 클래스를 선언하고, 입력된 새 사용자 정보를 User 객체 에 저장한다.

 4. 보조 메뉴에서 '1.Ok'를 선택하면 새 사용자는 데이터베이스 users 데이블에 저장된다.
 성공적으로 가입되면 다시 목록으로 되돌아온다.

 5. 보조 메뉴에서 '2.Cancel'을 선택하면 새 사용자 정보를 무시하고 다시 목록으로 되돌아온다.
  */
public class Ex1 {
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // 생성자
    public Ex1() {
        // 인스턴스 생성되면서 객체 연결하고 예외 생기면 메시지 출력 후 종료
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String dbUser = "root";
        String dbPassword = "1234";
        try {
            conn = DriverManager.getConnection(url, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
    }

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------");

        // DB 게시판 테이블에서 역순 정렬하여 출력하기
        String sql = """
                SELECT boardNo, title, content, writer, date
                FROM boards ORDER BY boardNo DESC
                """;

        // SQL 명령문 및 결과 셋 자원 생성 및 정리
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // 결과 셋에서 행마다 게시글 객체 생성
            while (rs.next()) {
                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5)
                );

                // 행마다 출력
                System.out.printf("%-6s%-12s%-16s%-40s\n",
                        board.getBoardNo(),
                        board.getWriter(),
                        board.getDate(),
                        board.getTitle());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        mainMenu(); // 메인메뉴 출력
    }

    public void mainMenu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("메인메뉴 : 1. Create | 2. Read | 3. Clear | 4. Join | 5. Exit");
        System.out.print("메뉴선택 : ");
        String menuNo = scanner.nextLine();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> join();
            case "5" -> exit();
        }
    }

    private void create() {
        // 게시글 입력받아 객체 생성
        System.out.println("[새 게시물 생성]");
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        System.out.print("내용 : ");
        String content = scanner.nextLine();
        System.out.print("글쓴이 : ");
        String writer = scanner.nextLine();

        Board board = new Board(title, content, writer);

        // 보조 메뉴 출력
        System.out.println("------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        // 글쓰기 Ok 한 경우
        if (menu.equals("1")) {
            String sql = """
                    INSERT INTO boards (title, content, writer)
                    VALUES (?, ?, ?)
                    """;

            // 객체에서 필드를 가져와 동적 SQL 완성
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

        // 게시글 목록 출력
        list();
    }

    private void read() {
        System.out.println("[게시물 읽기]");
        System.out.print("게시글번호 : ");
        int boardNo = Integer.parseInt(scanner.nextLine());

        String sql = """
                SELECT boardNo, title, content, writer, date
                FROM boards WHERE boardNo = ?
                """;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // SQL문 실행
            pstmt.setInt(1, boardNo);
            ResultSet rs = pstmt.executeQuery();

            // 결과 처리
            if (rs.next()) {
                // 게시글 객체 생성
                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5)
                );
                // 게시글 상세내용 출력
                System.out.println("-----------------------------------");
                System.out.println("글번호 : " + board.getBoardNo());
                System.out.println("글제목 : " + board.getTitle());
                System.out.println("글내용 : " + board.getContent());
                System.out.println("글쓴이 : " + board.getWriter());
                System.out.println("쓴날짜 : " + board.getDate());
                System.out.println("-----------------------------------");

                // 보조메뉴 출력
                System.out.println("보조메뉴 : 1. Update | 2. Delete | 3. List");
                System.out.print("메뉴선택 : ");
                String menu = scanner.nextLine();

                // 상세 게시글에서 수정, 삭제 기능 (게시글 객체 전달)
                if (menu.equals("1")) {
                    update(board);
                } else if (menu.equals("2")) {
                    delete(board);
                }
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        // 게시글 목록
        list();
    }

    private void update(Board board) {
        // 수정 내용 입력받기
        System.out.println("[수정할 내용 입력]");
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) board.setTitle(title);

        System.out.print("내용 : ");
        String content = scanner.nextLine();
        if (!content.isEmpty()) board.setContent(content);

        System.out.print("글쓴이 : ");
        String writer = scanner.nextLine();
        if (!writer.isEmpty()) board.setWriter(writer);

        // 보조 메뉴 출력
        System.out.println("------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        // 게시글 수정
        if (menu.equals("1")) {
            String sql = """
                    UPDATE boards
                    SET title = ?, content= ?, writer= ?
                    WHERE boardNo = ?
                    """;
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.setInt(4, board.getBoardNo());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

    }

    private void delete(Board board) {
        System.out.print("정말 삭제하시겠습니까? (y/n)");
        String response = scanner.nextLine();
        if (response.equals("y")) {
            String sql = "DELETE FROM boards WHERE boardNo = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, board.getBoardNo());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
    }

    private void clear() {
        // 보조 메뉴 출력
        System.out.println("-------------------------------------------");
        System.out.println("모든 게시글을 삭제합니다. 정말 삭제하시겠습니까?");
        System.out.println("보조메뉴 : 1. Ok | 2. Cancel");
        System.out.println("메뉴 선택 : ");
        String menu = scanner.nextLine();

        if (menu.equals("1")) {
            String sql = "TRUNCATE TABLE boards";
            try (PreparedStatement pstmt = conn.prepareStatement(sql);){
                int rows = pstmt.executeUpdate();
                System.out.println("모두 "+rows+"개의 게시글이 삭제되었습니다.");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        list();
    }

    private void join() {
        System.out.println("[새 사용자 입력]");
        System.out.println("아이디 : ");
        String userId = scanner.nextLine();
        System.out.println("이름 : ");
        String name = scanner.nextLine();
        System.out.println("비밀번호 : ");
        String password = scanner.nextLine();
        System.out.println("나이 : ");
        int age = scanner.nextInt();
        System.out.println("이메일 : ");
        String email = scanner.nextLine();

        // 보조 메뉴 출력
        System.out.println("-------------------------------------------");
        System.out.println("보조메뉴 : 1. Ok | 2. Cancel");
        System.out.println("메뉴 선택 : ");
        String menu = scanner.nextLine();

        if (menu.equals("1")) {
            String sql = """
                    INSERT INTO users (userId, username, userPassword, age, email)
                    VALUES (?, ?, ?, ?, ?)
                    """;

            try (PreparedStatement pstmt = conn.prepareStatement(sql);){
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


    private void exit() {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.exit(0);     // 종료
        }
    }

    public static void main(String[] args) {
        BoardEx8 boardEx = new BoardEx8();
        boardEx.list();
    }
}
