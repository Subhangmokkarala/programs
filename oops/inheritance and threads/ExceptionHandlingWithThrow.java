class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingWithThrow {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new CustomException("Age must be at least 18.");
            }
        } catch (CustomException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
