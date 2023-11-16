class Grandparent {
    void display() {
        System.out.println("This is the Grandparent class.");
    }
}

class Parent extends Grandparent {
    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the Child class.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
