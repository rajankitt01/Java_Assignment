import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the radius of the circle from the user.
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle.
        double area = Math.PI * radius * radius;

        // Print the area of the circle to the console.
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}