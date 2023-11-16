class StudentData {
    private int stuID;
    private String stuName;
    private int stuAge;

    // No-argument constructor
    public StudentData() {
        stuID = 0;
        stuName = "No Name";
        stuAge = 0;
    }

    // Three-argument constructor
    public StudentData(int id, String name, int age) {
        this.stuID = id;
        this.stuName = name;
        this.stuAge = age;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + stuID);
        System.out.println("Student Name: " + stuName);
        System.out.println("Student Age: " + stuAge);
    }

    public static void main(String[] args) {
        StudentData student1 = new StudentData();
        StudentData student2 = new StudentData(1, "Alice", 20);

        System.out.println("Student 1 Details:");
        student1.displayStudent();

        System.out.println("\nStudent 2 Details:");
        student2.displayStudent();
    }
}
