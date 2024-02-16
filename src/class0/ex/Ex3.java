package class0.ex;

public class Ex3 {
    public static void main(String[] args) {
        // 상품 주문 객체를 3개 생성
        ProductOrder order1 = new ProductOrder();
        order1.productName = "노트북";
        order1.price = 1000000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "마우스";
        order2.price = 15000;
        order2.quantity = 3;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "키보드";
        order3.price = 50000;
        order3.quantity = 1;

        // 생성한 객체를 배열에 저장
        ProductOrder[] orders = {order1, order2, order3};

        int totalPayment = 0;       // 총 결제금액을 저장할 변수

        // 객체 정보 출력
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + "," +
                    " 가격 :" + order.price + ", 수량 : " + order.quantity);
            int payment = order.price * order.quantity;
            totalPayment += payment;
        }

        // 최종 결제 금액 출력
        System.out.println("총 결제금액 : " + totalPayment + "원");
    }
}
