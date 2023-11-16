class DataTypesOverloading {
    void display(int num) {
        System.out.println("Method with int parameter: " + num);
    }

    void display(double num) {
        System.out.println("Method with double parameter: " + num);
    }

    public static void main(String[] args) {
        DataTypesOverloading obj = new DataTypesOverloading();
        obj.display(10);
        obj.display(3.14);
    }
}
