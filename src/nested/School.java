package nested;

public class School {

    static class Student {
        // 필드
        private String name;
        private int score;

        // 생성자
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // 메서드
        public void introduce() {
            System.out.println("안녕하세요, " + name +"입니다.");
        }
    }
    //
    public static void main(String[] args) {
        School.Student student = new School.Student("홍길동", 80);
    }
}
