package class0.ex;

public class Ex1 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview movie1 = new MovieReview();
        movie1.title = "기생충";
        movie1.review = "너무너무 재밌어요";

        MovieReview movie2 = new MovieReview();
        movie2.title = "부산행";
        movie2.review = "너무너무 무서워요";

        movieReviews[0] = movie1;
        movieReviews[1] = movie2;

        for (MovieReview movieReview : movieReviews) {
            System.out.println(movieReview.title + "은 " + movieReview.review);
        }

    }
}
