import java.util.Scanner;

public class ReadDataFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading data for different data types
        System.out.print("Enter an integer: ");
        int numInt = scanner.nextInt();

        System.out.print("Enter a long integer: ");
        long numLong = scanner.nextLong();

        System.out.print("Enter a floating-point number: ");
        float numFloat = scanner.nextFloat();

        System.out.print("Enter a double-precision number: ");
        double numDouble = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline left by previous nextXxx() methods

        System.out.print("Enter a character: ");
        char charValue = scanner.nextLine().charAt(0); // Read a single character

        System.out.print("Enter a string: ");
        String strValue = scanner.nextLine();

        // Displaying the user input
        System.out.println("Integer: " + numInt);
        System.out.println("Long: " + numLong);
        System.out.println("Floating-point: " + numFloat);
        System.out.println("Double: " + numDouble);
        System.out.println("Character: " + charValue);
        System.out.println("String: " + strValue);

        scanner.close();
    }
}
