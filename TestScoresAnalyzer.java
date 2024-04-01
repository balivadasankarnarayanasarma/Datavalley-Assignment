import java.util.Arrays;

public class TestScoresAnalyzer {
    public static void analyzeScores(int[] scores) {
        Arrays.sort(scores);
        double average = Arrays.stream(scores).average().orElse(0);
        double median;
        if (scores.length % 2 == 0) {
            median = (scores[scores.length / 2 - 1] + scores[scores.length / 2]) / 2.0;
        } else {
            median = scores[scores.length / 2];
        }

        int aboveAverage = (int) Arrays.stream(scores).filter(score -> score > average).count();
        int atAverage = (int) Arrays.stream(scores).filter(score -> score == average).count();
        int belowAverage = (int) Arrays.stream(scores).filter(score -> score < average).count();

        System.out.println("Number of students above average: " + aboveAverage);
        System.out.println("Number of students at average: " + atAverage);
        System.out.println("Number of students below average: " + belowAverage);
        System.out.println("Median score: " + median);
    }

    public static void main(String[] args) {
        int[] testScores = {85, 90, 75, 60, 95, 80};
        analyzeScores(testScores);
    }
}
