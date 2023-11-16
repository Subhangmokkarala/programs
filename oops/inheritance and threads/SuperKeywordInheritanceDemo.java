class Parent {
    String message = "Hello from the Parent class";

    void display() {
        System.out.println(message);
    }
}

class Child extends Parent {
    String message = "Hello from the Child class";

    void display() {
        System.out.println(super.message);
        super.display();
        System.out.println(message);
    }
}

public class SuperKeywordInheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
