package JavaTest;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.println("두 번째 정수를 입력하세요 : ");
        int b = scanner.nextInt();

        System.out.println("사칙연산 기호중 하나를 입력하세요(+,-,*,/) :");
        String op = scanner.next();

        double result = 0;

        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }else  {
                result = a / b;
                }
                break;
            default:
                System.out.println("잘못 입력하였습니다.");
                break;
        }
        System.out.println("결과 "+result);
    }
}
