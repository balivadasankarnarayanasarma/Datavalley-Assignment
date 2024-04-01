import java.util.HashMap;
import java.util.Map;

public class MovieRatingsStatistics {

    public static void main(String[] args) {
        String[] movieRatings = {"PG", "PG-13", "R", "PG", "R", "PG-13", "PG-13", "R"};

        Map<String, Integer> movieCounts = new HashMap<>();
        Map<String, Double> movieAverages = new HashMap<>();

        for (String rating : movieRatings) {
            movieCounts.put(rating, movieCounts.getOrDefault(rating, 0) + 1);
        }

        for (String rating : movieCounts.keySet()) {
            int count = movieCounts.get(rating);
            double totalRating = 0;

            for (String movieRating : movieRatings) {
                if (movieRating.equals(rating)) {
                    totalRating += getRatingValue(movieRating);
                }
            }

            movieAverages.put(rating, totalRating / count);
        }

        System.out.println("Movie Ratings Statistics:");
        for (String rating : movieAverages.keySet()) {
            System.out.println(rating + ": Number of Movies - " + movieCounts.get(rating) + ", Average Rating - " + movieAverages.get(rating));
        }
    }

    private static double getRatingValue(String rating) {
        switch (rating) {
            case "PG":
                return 3.5;
            case "PG-13":
                return 4.0;
            case "R":
                return 4.5;
            default:
                return 0.0;
        }
    }
}
