import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Input operator
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        double result = 0;
        
        // Perform the calculation based on the operator
        switch (operator) {
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
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }
        
        // Display the result
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
