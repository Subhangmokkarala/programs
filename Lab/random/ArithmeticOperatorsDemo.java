import java.util.Scanner;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading data from the user
        System.out.print("Enter an integer number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another integer number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter a floating-point number: ");
        double num3 = scanner.nextDouble();

        System.out.print("Enter another floating-point number: ");
        double num4 = scanner.nextDouble();

        // Demonstrating arithmetic operators
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        double sumFloat = num3 + num4;
        double differenceFloat = num3 - num4;
        double productFloat = num3 * num4;
        double quotientFloat = num3 / num4;

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("Floating-point Sum: " + sumFloat);
        System.out.println("Floating-point Difference: " + differenceFloat);
        System.out.println("Floating-point Product: " + productFloat);
        System.out.println("Floating-point Quotient: " + quotientFloat);

        scanner.close();
    }
}
