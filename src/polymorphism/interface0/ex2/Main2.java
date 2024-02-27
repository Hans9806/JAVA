package polymorphism.interface0.ex2;

public class Main2 {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCard(), new BankTransfer(), new MobilePay()};

        double[] amounts = {10000, 20000, 15000};

        new PaymentProcessor2().processPayment2(payments, amounts);
    }
}
