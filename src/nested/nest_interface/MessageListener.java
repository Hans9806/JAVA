package nested.nest_interface;

public class MessageListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("메시지를 전송합니다.");
    }
}
