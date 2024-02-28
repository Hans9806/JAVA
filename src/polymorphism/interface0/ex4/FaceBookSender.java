package polymorphism.interface0.ex4;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북을 통한 메시지 발송");
        System.out.println(message);
    }
}
