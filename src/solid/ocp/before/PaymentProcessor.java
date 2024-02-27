package solid.ocp.before;

public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if ( paymentType.equals("creditCard")) {
            System.out.println("신용카드 켤제를 진행합니다.");
        } else if (paymentType.equals("kakawaPay")) {
            System.out.println("카카와페이 결제를 진행합니다.");
        }        // 새로운 결제 방법이 추가되었을 때
        else if (paymentType.equals("navePay")) {
            System.out.println("네이브페이 결제를 진행합니다.");
        } else {
            System.out.println("기본 결제");
        }
    }
    }
