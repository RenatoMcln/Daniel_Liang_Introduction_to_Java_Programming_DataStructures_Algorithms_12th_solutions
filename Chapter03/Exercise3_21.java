package Chapter03;

import java.util.Scanner;

public class Exercise3_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Instructions
        System.out.println("\nEnter a year, month, and day of the month; the program displays the corresponding day of the week.");

        // Prompt the user for the three inputs and handle exceptions

        // Defining year
        System.out.print("Enter the year (year > 0): ");
        int year = input.nextInt();

        // Handling exceptions
        if (year < 1) {
            System.out.println("Invalid year! Please enter a year greater than 0.");
            System.exit(1);
        }

        // Checking if the year is a leap year
        boolean leapYear = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);


        // Defining month
        System.out.print("Enter the month (1−12): ");
        int month = input.nextInt();

        // Handling exceptions
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value from 1 to 12.");
            System.exit(1);
        }


        // Defining month day
        boolean month31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        int monthDay;

        // Display the correct message for the given month and year
        if (!leapYear && month == 2) {
            System.out.print("Enter the day of the month (1−28): ");
            monthDay = input.nextInt();
        } else if (leapYear && month == 2) {
            System.out.print("Enter the day of the month (1−29): ");
            monthDay = input.nextInt();
        } else if (month31Days) {
            System.out.print("Enter the day of the month (1−31): ");
            monthDay = input.nextInt();
        } else {
            System.out.print("Enter the day of the month (1−30): ");
            monthDay = input.nextInt();
        }

        // Handling exceptions
        if ((!leapYear && month == 2) && (monthDay < 1 || monthDay > 28)) {
            System.out.println("Invalid day! Please enter a February day from 1 to 28.");
            System.exit(1);
        } else if ((leapYear && month == 2) && (monthDay < 1 || monthDay > 29)) {
            System.out.println("Invalid day! Please enter a February day from 1 to 29.");
            System.exit(1);
        } else if (month31Days && (monthDay < 1 || monthDay > 31)) {
            System.out.println("Invalid day! For this month, please enter a day from 1 to 31.");
            System.exit(1);
        } else if (monthDay < 1 || monthDay > 30) {
            System.out.println("Invalid day! For this month, please enter a day from 1 to 30.");
            System.exit(1);
        }


        // Convert months 1 or 2 to 13 or 14 and go back one year
        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }


        // Defining the required variables
        int j = year / 100;
        int centuryYear = year % 100;
        int weekDay = (monthDay + (26 * (month + 1) / 10) + centuryYear + (centuryYear / 4) + (j / 4) + (5 * j)) % 7;

        // Define corresponding names for "weekDay" values
        String weekDayName = "";

        switch (weekDay) {
            case 0:
                weekDayName = "Saturday";
                break;
            case 1:
                weekDayName = "Sunday";
                break;
            case 2:
                weekDayName = "Monday";
                break;
            case 3:
                weekDayName = "Tuesday";
                break;
            case 4:
                weekDayName = "Wednesday";
                break;
            case 5:
                weekDayName = "Thursday";
                break;
            case 6:
                weekDayName = "Friday";
                break;
        }


        // Display the result to the user
        System.out.println("Day of the week is " + weekDayName);
        
    }
}
