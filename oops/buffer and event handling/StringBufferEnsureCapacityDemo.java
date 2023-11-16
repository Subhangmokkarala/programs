public class StringBufferEnsureCapacityDemo {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Capacity before: " + buffer.capacity());
        buffer.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + buffer.capacity());
    }
}
