package Chapter04;

import java.util.Scanner;

public class Exercise4_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 0) { // Handle exceptions
            System.out.printf("%d is not a correct year value", year);
            System.exit(1);
        }

        System.out.print("Enter a month: ");
        String month = input.next();

        // Condition to be checked
        boolean isNotAMonth = !month.contains("Jan") && !month.contains("Feb") && !month.contains("Mar") && !month.contains("Apr") &&
                              !month.contains("May") && !month.contains("Jun") && !month.contains("Jul") && !month.contains("Aug") &&
                              !month.contains("Sep") && !month.contains("Oct") && !month.contains("Nov") && !month.contains("Dec");

        if (month.length() != 3 || !Character.isUpperCase(month.charAt(0)) || isNotAMonth) { // Handle exceptions
            System.out.printf("%s is not a correct month name", month);
            System.exit(1);
        }

        // Define days in a month
        byte days;

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") ||
                month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            days = 31;
        } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            days = 30;
        } else if ((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) && month.equals("Feb")) {
            days = 29;
        } else {
            days = 28;
        }

        // Display the result to the user
        System.out.printf("%s %d has %d days", month, year, days);

    }
}
