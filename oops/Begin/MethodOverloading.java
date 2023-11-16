class MethodOverloading {
    void display(int num) {
        System.out.println("Method with one parameter: " + num);
    }

    void display(int num1, int num2) {
        System.out.println("Method with two parameters: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10);
        obj.display(20, 30);
    }
}
