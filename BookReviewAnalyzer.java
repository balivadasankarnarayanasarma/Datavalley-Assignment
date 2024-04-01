import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookReviewAnalyzer {

    public static void analyzeBookReviews(List<Integer> reviews) {
        Map<String, Integer> ratingRanges = new HashMap<>();
        ratingRanges.put("1-5 stars", 0);
        ratingRanges.put("6-10 stars", 0);

        int positiveReviews = 0;
        int neutralReviews = 0;
        int negativeReviews = 0;

        for (int review : reviews) {
            if (review >= 1 && review <= 5) {
                ratingRanges.put("1-5 stars", ratingRanges.get("1-5 stars") + 1);
            } else if (review >= 6 && review <= 10) {
                ratingRanges.put("6-10 stars", ratingRanges.get("6-10 stars") + 1);
            }

            if (review > 5) {
                positiveReviews++;
            } else if (review == 5) {
                neutralReviews++;
            } else {
                negativeReviews++;
            }
        }

        System.out.println("Books reviewed in rating ranges:");
        for (Map.Entry<String, Integer> entry : ratingRanges.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Positive Reviews: " + positiveReviews);
        System.out.println("Neutral Reviews: " + neutralReviews);
        System.out.println("Negative Reviews: " + negativeReviews);
    }

    public static void main(String[] args) {
        List<Integer> bookReviews = List.of(8, 3, 6, 10, 4, 2, 7, 9, 1, 5);
        analyzeBookReviews(bookReviews);
    }
}
