package polymorphism.interface0.ex2;

public class CreditCard implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("신용카드로 "+amount+ "원 결제되었습니다.");
    }
}
