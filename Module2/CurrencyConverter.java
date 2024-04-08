import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input amount in INR
        System.out.print("Enter the amount in Indian Rupees (INR): ");
        double inrAmount = scanner.nextDouble();
        
        // Assuming the exchange rate (1 USD = 75 INR)
        double exchangeRate = 75; // Change this according to the current exchange rate
        
        // Convert INR to USD
        double usdAmount = inrAmount / exchangeRate;
        
        // Display the converted amount
        System.out.println("Equivalent amount in US Dollars (USD): $" + usdAmount);

    }
}
