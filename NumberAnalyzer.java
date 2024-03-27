import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, sum = 0, count = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
            sum += number;
            count++;

            System.out.print("Do you want to enter another number? (Y/N): ");
            choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        double average = (double) sum / count;

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Average of Numbers: " + average);

        input.close();
    }
}
