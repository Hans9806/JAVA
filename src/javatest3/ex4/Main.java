package javatest3.ex4;

import java.util.Scanner;

class InvalidEmailException extends Exception{
    public InvalidEmailException(String message) {
        super (message);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("이메일 주소를 입력하세요 : ");
            String email = scanner.nextLine();

            if (!email.contains("@")) {
                throw new InvalidEmailException("유효하지 않은 이메일 주소입니다.");
            }
            System.out.println("이메일 주소가 유효합니다.");
        } catch (InvalidEmailException e) {
            System.out.println("예외 발생 : "+e.getMessage());
        }
        scanner.close();
    }
}
