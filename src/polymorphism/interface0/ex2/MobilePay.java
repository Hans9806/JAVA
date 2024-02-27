package polymorphism.interface0.ex2;

public class MobilePay implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("모바일 결제로 "+amount+"원 결제되었습니다.");
    }
}
