 
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();
        System.out.print("Enter the year of joining: ");
        int joinYear = input.nextInt();

        int yearsOfService = currentYear - joinYear;

        if (yearsOfService > 5) {
            System.out.println("Bonus: Rs. 5000");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Bonus: Rs. 3000");
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}

