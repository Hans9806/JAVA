package JavaTest.ex5;

public class Order {
    public Product product;
    public int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double getOrderTotal() {
        return product.price *quantity;
    }
    public void printOrder() {
        double total = product.price * quantity;
        System.out.println("주문 상품 : " +product.name);
        System.out.println("주문 가격 : " +product.price);
        System.out.println("주문 수량 : " +quantity);
        System.out.println("총 결제 가격 : " +total);
        System.out.println();
    }
}
