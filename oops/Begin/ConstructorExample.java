class ConstructorExample {
    int number;

    ConstructorExample() {
        number = 5;
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
        System.out.println("Value of number: " + obj.number);
    }
}
