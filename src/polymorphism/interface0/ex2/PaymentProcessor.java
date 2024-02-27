package polymorphism.interface0.ex2;

public class PaymentProcessor {
    void processPayments(Payment[] payments, double amount) {
        for (Payment payment : payments) {
            payment.pay(amount);
        }
    }
}
