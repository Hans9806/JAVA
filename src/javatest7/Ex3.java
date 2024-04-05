package javatest7;

import java.util.Random;

/*
* 스레드 경주 게임 시뮬레이션

    3대의 차량(스레드)이 경주를 합니다.
    각 차량은 출발 후 랜덤하게 0~1초 사이에 한 번씩 "차량 [번호]가 [거리m] 달렸습니다!" 메시지를 번 출력한 후, 경주를 마칩니다.

    출력 예시:
    차량 1이 출발했습니다.
    차량 2이 출발했습니다.
    차량 3이 출발했습니다.
    차량 3이 100m를 달렸습니다.
    차량 2이 100m를 달렸습니다.
    차량 1이 100m를 달렸습니다.
    차량 2이 200m를 달렸습니다.
    ...
    차량 3이 800m를 달렸습니다.
    차량 3이 900m를 달렸습니다.
    차량 3이 결승선을 통과했습니다!
    차량 2이 결승선을 통과했습니다!
    * */
public class Ex3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int car = i+1;
            new Thread(() -> {
                Random random = new Random();
                System.out.println("차량 "+car+"가 출발했습니다!~~");
                for (int j = 0; j < 9; j++) {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("차량 "+car+"가 "+j*100+"m를 달렸습니다.");
                }
                System.out.println("차량"+car+"가 결승선을 통과했습니다!!!");
            }).start();
        }
    }
}
