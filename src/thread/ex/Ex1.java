package thread.ex;

import java.util.Random;

/*
요구사항:

3대의 차량(스레드)이 경주를 합니다.
각 차량은 출발 후 랜덤하게 0~1초 사이에 한 번씩 "차량 [번호]가 질주중!" 메시지를 5번 출력한 후, 경주를 마칩니다.
출력 예시:

python
Copy code
차량 1이 질주중!
차량 2이 질주중!
차량 3이 질주중!
차량 1이 질주중!
차량 3이 질주중!
        ...
차량 3이 경주 마침!
차량 1이 경주 마침!
차량 2이 경주 마침!
*/
public class Ex1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int car = i+1;
            new Thread(() ->{
                Random random = new Random();
                System.out.println("차량 "+car+"가 출발했습니다!!");
                for (int j = 0; j < 9; j++) {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException();
                    }
                    System.out.println("차량 "+car+"가 "+j*100+"m를 달렸습니다" );
                }
                System.out.println("차량"+car+"가 결승선을 통과했습니다!!");
            }).start();
        }
    }
}
