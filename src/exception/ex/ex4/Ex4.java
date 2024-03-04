package exception.ex.ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
연습문제 4: 간단한 산수 퀴즈 앱

요구사항:
- 프로그램은 사용자에게 총 3개의 덧셈 문제를 제시합니다. 예를 들어, "3 + 5 = ?", "2 + 7 = ?", "4 + 6 = ?"와 같은 문제입니다.
- 사용자는 각 문제에 대한 답을 입력해야 합니다.
- 사용자가 입력한 답이 숫자가 아니면, InvalidInputException이라는 사용자 정의 예외를 발생시키고, "잘못된 입력입니다. 숫자로만 답해주세요."라는 메시지를 출력해야 합니다.
- 모든 문제에 대한 답변이 완료되면, "총 3문제 중 X문제를 맞혔습니다!"라는 메시지를 표시합니다. 여기서 X는 사용자가 맞힌 문제의 수입니다.

예상 실행 결과
===
문제 1: 3 + 5 = ?
답변: 8
문제 2: 2 + 7 = ?
답변: nine
잘못된 입력입니다. 숫자로만 답해주세요.
문제 3: 4 + 6 = ?
답변: 10

총 3문제 중 2문제를 맞혔습니다!
 */

public class Ex4 {
    public static void main(String[] args) {
        int [][] problems = {{3,5},{2,7},{4,6}};

        int correctCount = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < problems.length; i++) {
            System.out.printf("문제 %d: %d + %d = ? \n",i+1,problems[i][0],problems[i][1]);
            System.out.println("답변: ");

            try {
                int answer = scanner.nextInt();
                if (answer == problems[i][0] + problems[i][1]) {
                    correctCount++;
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("잘못된 입력입니다. 숫자로만 입력해주세요");
            }
        }
        System.out.printf("총 %d 문제 중 %d문제를 맞혔습니다! \n",problems.length, correctCount);
    }
}
