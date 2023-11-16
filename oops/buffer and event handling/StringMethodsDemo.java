public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        System.out.println("Length: " + str.length());
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));
        System.out.println("EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!"));
        System.out.println("Compare 'Hello' with 'Hello, World!': " + str.compareTo("Hello"));
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("Trim: " + "  Hello, World!  ".trim());
    }
}
