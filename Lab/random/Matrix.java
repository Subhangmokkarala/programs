import java.util.Scanner; // Import the Scanner class

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Use 'System.in' instead of 'system in'
        
        System.out.println("Enter the value for 'a':");
        double a = scanner.nextDouble();
        
        System.out.println("Enter the value for 'b':");
        double b = scanner.nextDouble();
        
        System.out.println("Enter the value for 'c':"); // Fix the syntax of this line
        double c = scanner.nextDouble();
        
        System.out.println("Enter the value for 'd':"); // Add missing 'System.out.'
        double d = scanner.nextDouble();
        
        double determinant = calculateDeterminant(a, b, c, d); // Call the calculateDeterminant method
        
        System.out.println("The determinant is: " + determinant); // Fix the syntax of this line
        
        scanner.close(); // Close the Scanner
    }
    
    private static double calculateDeterminant(double a, double b, double c, double d) {
        return (a * d) - (b * c);
    }
}
