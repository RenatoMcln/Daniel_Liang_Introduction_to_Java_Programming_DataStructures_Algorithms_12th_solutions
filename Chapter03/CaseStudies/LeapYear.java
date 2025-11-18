package Chapter03.CaseStudies;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the input
        System.out.println("Enter a year to check if it is a leap year.\n");
        System.out.print("Year: ");
        long year = input.nextLong();

        //Checking
        boolean checkLeapYear = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);

        //Display the result to the user
        if (checkLeapYear) {
            System.out.println("The year " + year + " is a leap year!");
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }

    }


}
