package javatest6.ex5;

public class ProductReview {
    String productId;
    int score;

    public ProductReview(String productId, int score) {
        this.productId = productId;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
