public class StringSwitch {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("It's the first day of the week.");
                break;
            case "Tuesday":
                System.out.println("It's the second day of the week.");
                break;
            // Add cases for the other days of the week here
            default:
                System.out.println("Invalid day");
        }
    }
}
