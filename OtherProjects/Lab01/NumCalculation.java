import java.util.Scanner;

public class NumCalculation {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String strNum1 = scanner.nextLine();
        String strNum2 = scanner.nextLine();

        // Convert input strings to doubles
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Perform arithmetic operations
        double addi = num1 + num2;
        double diff = num1 - num2;
        double mult = num1 * num2;

        // Check for division by zero before performing division
        if (num2 != 0) {
            double quoti = num1 / num2;
            System.out.println("Quotient: " + quoti);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Print results
        System.out.println("Sum: " + addi);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + mult);
    }
}
