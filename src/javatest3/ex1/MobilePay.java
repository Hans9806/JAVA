package javatest3.ex1;

public class MobilePay implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("모바일 결제로 "+amount+"원 결제되었습니다.");
    }
}
