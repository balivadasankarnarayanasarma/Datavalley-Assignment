import java.util.HashMap;
import java.util.Map;

public class RestaurantRatingsAnalyzer {
    public static void main(String[] args) {
        int[] ratings = {2, 8, 4, 7, 9, 3, 6, 5, 10, 1};
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Double> avgMap = new HashMap<>();

        for (int rating : ratings) {
            String range = getRange(rating);
            countMap.put(range, countMap.getOrDefault(range, 0) + 1);
            avgMap.put(range, avgMap.getOrDefault(range, 0.0) + rating);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            String range = entry.getKey();
            int count = entry.getValue();
            double avg = avgMap.get(range) / count;
            System.out.println("Range: " + range + ", Count: " + count + ", Average Rating: " + avg);
        }
    }

    private static String getRange(int rating) {
        if (rating >= 1 && rating <= 5) {
            return "1-5";
        } else if (rating >= 6 && rating <= 10) {
            return "6-10";
        } else {
            return "Invalid Range";
        }
    }
}
