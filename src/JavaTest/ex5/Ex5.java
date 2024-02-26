package JavaTest.ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Product apple = new Product("사과",2000);
        Product banana = new Product("바나나", 1000);

        Order order1 = new Order(apple, 5);
        Order order2 = new Order(banana, 3);

        Order[] orders = {order1, order2};
        OrderList orderList = new OrderList(orders);

        orderList.processOrders();
    }
}
