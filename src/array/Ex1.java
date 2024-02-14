package array;

public class Ex1 {
    public static void main(String[] args) {
        // 학생들 점수가 10, 20, 30, 40, 50 점
        // 배열을 선언하고, 모든 학생의 합계점수와 평균점수를 구해보세요.
        int[] scores = {10, 20, 30, 40, 50};

        int sum = 0;

        // sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        System.out.println("합계점수 : " + sum);
        System.out.println("평균점수 : " + sum / (double) scores.length);
    }
}
