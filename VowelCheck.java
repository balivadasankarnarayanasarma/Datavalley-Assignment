
import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int count = 0;
        boolean vowelPresent = false;

        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowelPresent = true;
                count++;
            }
        }

        if (vowelPresent) {
            System.out.println("Vowels present. Total count: " + count);
        } else {
            System.out.println("No vowels present.");
        }
    }
}
