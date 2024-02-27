package polymorphism.interface0.ex2;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCard(), new BankTransfer(), new MobilePay()};

        new PaymentProcessor().processPayments(payments, 10000);
    }
}
