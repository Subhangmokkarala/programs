final class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

// Error: Cannot inherit from a final class
// class Child extends Parent {
// }

public class FinalClassMethodOverrideDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
    }
}
