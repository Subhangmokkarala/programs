public class StringBufferDeleteDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello, Java programming!");
        System.out.println("Before delete: " + buffer);
        buffer.delete(7, 10); // Deletes "Java"
        System.out.println("After delete: " + buffer);
    }
}
