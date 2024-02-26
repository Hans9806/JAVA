package JavaTest;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int guestNumber;
        int tryCount = 0;

        do {
            System.out.println("1 ~ 100 사이의 숫자를 입력하세요 : ");
            guestNumber = scanner.nextInt();
            tryCount++;

            if (guestNumber > answer) {
                System.out.println("down!");
            }else if (guestNumber < answer) {
                System.out.println("up!");
            }
        }while(guestNumber != answer);
        System.out.println("정답입니다. 축하드려요!! \n" +tryCount+"번 만에 맞추셨어요.");
    }
}
