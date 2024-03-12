
// Main class to demonstrate the usage
public class Main {
    public static void main(String[] args) {
        try {
            int numberToValidate = -5;
            CustomValidationUtil.validateNumber(numberToValidate);
            System.out.println("Number is valid: " + numberToValidate);
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
