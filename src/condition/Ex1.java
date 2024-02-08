package condition;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 환율 계산하기
        // 달러 환율이 1327원이다.
        // 달러를 0원 입금 받으면 => "환전할 금액이 없습니다."
        // 양수일 때 환전금액은 "00000원 입니다."
        // 음수일 때 "잘못 입력하셨습니다"

        Scanner scanner = new Scanner(System.in);
        int dollar = scanner.nextInt();
    }
}
