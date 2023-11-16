class Student {
    private String name;
    private int age;
    private String course;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "None";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "None";
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice", 20);
        Student student3 = new Student("Bob", 22, "Computer Science");

        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();
    }
}
