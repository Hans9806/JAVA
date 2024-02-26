package JavaTest.ex6;

public class Ex7 {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("당근", 1500, 3);
        Item item2 = new Item("양파", 1000, 5);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.displayItems();
    }
}
