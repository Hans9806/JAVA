package thread.ex;

public class Ex5 {
    public static void main(String[] args) {
        Thread wizardA = new Thread(new Wizard("마법사A", 1000, "불"));
        Thread wizardB = new Thread(new Wizard("마법사B", 1500, "얼음"));

        wizardA.start();
        wizardB.start();

        // 10초가 지나면 듀얼이 종료된다.
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 인터럽트를 통해 스레드를 종료
        wizardA.interrupt();
        wizardB.interrupt();

        System.out.println("듀얼이 종료되었습니다.");
    }
}
class Wizard implements Runnable {
    String name;    // 마법사 이름
    int interval;   // 시간간격
    String type;    // 불 또는 얼음

    public Wizard(String name, int interval, String type) {
        this.name = name;
        this.interval = interval;
        this.type = type;
    }

    @Override
    public void run() {
        try {
        long startTime = System.currentTimeMillis();
        while (true) {
            long currentTime = System.currentTimeMillis();
            long timeInteger = currentTime - startTime;
            double time = timeInteger / 1000.0;
            // 메시지 포맷
            String formattedMessage = String.format("%.1f초 %s가 %s 마법을 사용했습니다.", time, name, type);
            System.out.println(formattedMessage);

                Thread.sleep(interval);
            }
        }catch (InterruptedException e) {
            System.out.println(name+"의 마법 사용이 중단되었습니다.");
        }
    }
}
