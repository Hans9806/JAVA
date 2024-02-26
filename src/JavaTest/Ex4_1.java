package JavaTest;

public class Ex4_1 {
    public static void main(String[] args) {
        int[][] score = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                sum += score[i][j];
            }
        }
        System.out.println(sum);
    }
}
