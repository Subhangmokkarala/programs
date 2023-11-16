public class MonthSwitch {
    public static void main(String[] args) {
        int monthNumber = 5;

        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            // Add cases for the remaining months here
            default:
                System.out.println("Invalid month number");
        }
    }
}
