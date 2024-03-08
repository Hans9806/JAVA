package javatest3.ex1;

public class PaymentProcessor {
    void processPayments(Payment[] payments, int amount) {
        for (Payment payment : payments) {
            payment.pay(amount);
        }
    }
}
