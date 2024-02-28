package polymorphism.interface0.ex4;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 통한 메시지 발송");
        System.out.println(message);
    }
}
