public class StringSwitchExample {
    public static void main(String[] args) {
        String dayOfWeek = "Monday";
        switch (dayOfWeek) {
            case "Monday":
                System.out.println("It's the start of the week!");
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                System.out.println("It's a workday.");
                break;
            case "Friday":
                System.out.println("TGIF! It's Friday!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend. Time to relax!");
                break;
            default:
                System.out.println("Invalid day of the week.");
        }
    }
}