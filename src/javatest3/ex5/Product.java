package javatest3.ex5;

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
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass()
        != obj.getClass()) return false;
        Product product = (Product) obj;
        return Double.compare(price, product.price) == 0 && quantity == product.quantity
                && name.equals(product.name);
    }
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + Double.hashCode(price);
        result = 31 * result + Integer.hashCode(quantity);
        return result;
    }

    @Override
    public String toString() {
        return "상품: " + name + ", 가격: " + price + ", 수량: " + quantity;
    }
}

