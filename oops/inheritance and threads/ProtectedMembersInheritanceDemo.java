class Parent {
    protected int protectedValue = 42;
}

class Child extends Parent {
    void displayProtectedValue() {
        System.out.println("Protected Value: " + protectedValue);
    }
}

public class ProtectedMembersInheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayProtectedValue();
    }
}
