public class StringBufferCapacityDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Capacity before: " + buffer.capacity());
        buffer.append("Java is a programming language.");
        System.out.println("Capacity after: " + buffer.capacity());
    }
}
