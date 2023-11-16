public class FahrenheitToCelsius {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + celsius);

        // Display messages based on the temperature
        if (celsius < 0) {
            System.out.println("It's freezing cold!");
        } else if (celsius >= 0 && celsius < 20) {
            System.out.println("It's cool.");
        } else if (celsius >= 20 && celsius < 30) {
            System.out.println("It's warm.");
        } else {
            System.out.println("It's hot!");
        }

        scanner.close();
    }
}
