package JavaTest.ex5;

public class OrderList {
    public Order[] orders;

    public OrderList(Order[] orders) {
        this.orders = orders;
    }

    public double getTotalPrice() {
        double total = 0.0;

        for (Order order : orders) {
            total += order.getOrderTotal();
        }
        return total;
    }
    public void processOrders() {
        for (Order order : orders) {
            order.printOrder();
        }
        System.out.println("모든 주문의 총 결제 가격 : "+getTotalPrice());
    }
}
