package library.lang.ex.ex6;

public class Ex6 {
    public static void main(String[] args) {
        // OS에 따라 key 값이 다를 수 있음
        String home = System.getenv("USERPROFILE");
        System.out.println("사용자 홈 디렉토리 : "+ home);
    }
}
