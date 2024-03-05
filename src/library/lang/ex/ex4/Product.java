package library.lang.ex.ex4;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && quantity == product.quantity && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "상품: '" + name + '\'' +
                ", 가격: " + price +
                ", 수량: " + quantity +
                '}';
    }

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 5000, 2);
        Product product2 = new Product("Apple", 5000, 2);

        product1.equals(product2);

        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());

        System.out.println(product1.toString());
        System.out.println(product2.toString());

    }
}
