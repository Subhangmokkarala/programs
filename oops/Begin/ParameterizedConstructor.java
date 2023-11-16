class ParameterizedConstructor {
    int value;

    ParameterizedConstructor(int num) {
        value = num;
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(42);
        System.out.println("Value: " + obj.value);
    }
}
