package polymorphism.interface0.ex4;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일을 통한 메시지 발송");
        System.out.println(message);
    }
}
