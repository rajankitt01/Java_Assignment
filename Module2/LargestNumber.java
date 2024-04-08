import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Find the largest number
        double largest = (num1 > num2) ? num1 : num2;
        
        // Display the largest number
        System.out.println("The largest number is: " + largest);
        
       
    }
}
