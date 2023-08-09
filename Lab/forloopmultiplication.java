public class forloopmultiplication {

    public static void main(String[] args) {
        int tableOf = 5;
        int limit = 10;

        System.out.println("Multiplication Table of " + tableOf + ":");

        for (int i = 1; i <= limit; i++) {
            int result = tableOf * i;
            System.out.println(tableOf + " x " + i + " = " + result);
        }
    }
}
