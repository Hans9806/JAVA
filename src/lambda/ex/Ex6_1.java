package lambda.ex;

import java.util.function.Function;

public class Ex6_1 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("홍길동", 90, 96),
                new Student("이몽룡", 95, 93)
        };
        double avgEnglish = avg((student) -> {
            return student.getEnglishScore();
        }, students);
        double avgMath = avg((student) -> {
            return student.getMathScore();
        }, students);

        System.out.println("영여 평균 = " + avgEnglish);
        System.out.println("수학 평균 = " + avgMath);
    }
    static double avg(Function<Student, Integer> function, Student[] students) {
        // 전체를 더해서
        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }
        // 전체 길이만큼 나누면 평균
        double avg = (double) sum / students.length;
        return avg;
    }
    static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}
