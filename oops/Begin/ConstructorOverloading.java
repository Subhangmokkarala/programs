class ConstructorOverloading {
    int num;

    ConstructorOverloading() {
        num = 10;
    }

    ConstructorOverloading(int n) {
        num = n;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(20);
        System.out.println("Value of num in obj1: " + obj1.num);
        System.out.println("Value of num in obj2: " + obj2.num);
    }
}
