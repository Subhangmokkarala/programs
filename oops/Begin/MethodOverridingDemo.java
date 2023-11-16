class Parent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("This is the Child class.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.display();
        child.display();
    }
}
