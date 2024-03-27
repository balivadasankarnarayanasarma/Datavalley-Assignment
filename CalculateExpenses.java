import java.util.Scanner;

public class CalculateExpenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = input.nextInt();

        System.out.print("Enter the price per item: ");
        double price = input.nextDouble();

        double totalExpenses;

        if (quantity > 50) {
            totalExpenses = quantity * price * 0.9;
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses = quantity * price * 0.95;
        } else {
            totalExpenses = quantity * price;
        }

        System.out.println("Total expenses after discount: $" + totalExpenses);

        input.close();
    }
}
