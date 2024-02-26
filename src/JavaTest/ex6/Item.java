package JavaTest.ex6;

public class Item {
    private String name;
    private long price;
    private int quantity;

    public Item(String name, long price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String gerName() {
        return name;
    }
    public long getTotal() {
        return price * quantity;
    }
}
