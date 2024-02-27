package polymorphism.interface0.ex2;

public class PaymentProcessor2 {
    void processPayment2(Payment[] payments, double[] amounts){
        for (int i = 0; i < payments.length; i++) {
            payments[i].pay(amounts[i]);
        }
    }
}
