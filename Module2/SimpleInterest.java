import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();
        
        // Input time
        System.out.print("Enter the time period in years (T): ");
        double time = scanner.nextDouble();
        
        // Input rate of interest
        System.out.print("Enter the rate of interest (R) in percentage: ");
        double rate = scanner.nextDouble();
        
        // Convert rate to decimal
        rate /= 100;
        
        // Calculate simple interest
        double simpleInterest = (principal * time * rate);
        
        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);

    }
}
