package exception.ex.ex2;


import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
/*
    연습문제 2: 사용자 정의 예외와 예외 떠넘기기

요구사항:
InvalidAgeException이라는 사용자 정의 예외를 생성합니다.
사용자로부터 나이를 입력받는 프로그램을 작성합니다.
나이가 18세 미만일 경우, InvalidAgeException을 발생시키고 "미성년자는 접근할 수 없습니다."라고 출력합니다.
이 예외는 메소드를 호출한 곳에서 처리해야 합니다(throws 사용).

예상 실행 결과
===
나이를 입력하세요: 16
미성년자는 접근할 수 없습니다.

나이를 입력하세요: 20
접근이 허용되었습니다.

 */
public class Ex2 {
        }
    public static void main(String[] args) {
        try {
            checkAge();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkAge() throws InvalidAgeException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이를 입력하세요: ");
        int age = scanner.nextInt();

        if(age < 18) {
           throw new InvalidAgeException("미성년자는 접근할 수 없습니다");
        } else {
            System.out.println("접근이 허용되었습니다.");
        }
    }
}
