package library.lang.ex.ex5;

public class Ex5 {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int count = 0;

        for (int i = 0; i < 1000000; i++) {
            count++;
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;


        System.out.println("반복문 실행 시간: "+elapsedTime + "milliseconds");
    }
}
