package thread.ex;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex7_1 {
    public static void main(String[] args) {
        List<CoffeeOrder1> coffeOrderList = Arrays.asList(
                new CoffeeOrder1("에스프레소", 2),
                new CoffeeOrder1("아메리카노", 3),
                new CoffeeOrder1("카푸치노", 5),
                new CoffeeOrder1("라떼", 4),
                new CoffeeOrder1("유자차", 6),
                new CoffeeOrder1("프라푸치노", 7),
                new CoffeeOrder1("딸기슬러시", 8));

        // 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // 스레드 풀 실행
        coffeOrderList.forEach(executorService::execute);

        // 스레드 풀 종료
        executorService.shutdown();

    }
}

class CoffeeOrder1 implements Runnable {
    String name;
    int second;

    public CoffeeOrder1(String name, int second) {
        this.name = name;
        this.second = second;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String readyMsg = String.format("%s> %s 준비 시작.", threadName, name);
        String completeMsg = String.format("%s> %s 준비 완료!", threadName, name);
        try {
            System.out.println(readyMsg);
            Thread.sleep(second * 1000);
            System.out.println(completeMsg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}