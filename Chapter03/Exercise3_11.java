package Chapter03;

import java. util.Scanner;

public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.println("1-January, 2-February, 3-March, 4-April, 5-May, 6-June, " +
                           "7-July, 8-August, 9-September, 10-October, 11-November, 12-December.\n" +
                           "Enter a number for a month and its year.");

        System.out.print("Month: ");
        byte monthNumber = input.nextByte();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month! Enter a number between 1 and 12 inclusive.");
            System.exit(1);
        }

        System.out.print("Enter its year: ");
        int year = input.nextInt();


        // Defining conditions to display the correct number of days
        boolean days31 = monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7
                         || monthNumber == 8 || monthNumber == 10 || monthNumber == 12;
        boolean days30 = monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11;

        //Defining the number of days in the month
        int monthNumberOfDays;

        if (days31) {
            monthNumberOfDays = 31;
        } else if (days30) {
            monthNumberOfDays = 30;
        } else if ( year % 400 == 0 || (year % 100 != 0 && year % 4 == 0) ) {
            monthNumberOfDays = 29;
        } else {
            monthNumberOfDays = 28;
        }

        // Defining the name of the month for each number
        String monthName = "";

        switch (monthNumber) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December"; break;
        }

        // Display the result to the user
        System.out.println(monthName + " " + year + " has " + monthNumberOfDays + " days");


    }
}