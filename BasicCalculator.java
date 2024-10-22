import java.util.*;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Prompt user to choose an operation
        System.out.println("Choose an operation: + (Addition), - (Subtraction), * (Multiplication), / (Division)");
        char operation = sc.next().charAt(0);

        double result = 0;

        // Perform the selected operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation! Please select a valid operation.");
                return;
        }

        // Display the result

        System.out.println("The result is: " + result);
    }
}
