package JavaTest;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int guestNumer;
        int tryCount = 0;

        do {
            System.out.println("1 ~ 100 까지의 숫자 중 하나를 고르시오 :");
            guestNumer = scanner.nextInt();
            tryCount++;

            if (guestNumer > answer) {
                System.out.println("down!!");
            }else if (guestNumer < answer) {
                System.out.println("up!!");
            }
        }while(guestNumer != answer);
        System.out.println("축하합니다!! 정답이에요 \n"+tryCount+"번 만에 맞추셨어요.");
    }

}
