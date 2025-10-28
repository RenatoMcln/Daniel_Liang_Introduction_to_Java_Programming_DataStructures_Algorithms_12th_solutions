package Chapter02;

import java.util.Scanner;

public class Exercise2_07  {
    //Find the number of years and days from a given number of minutes
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the input
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();

        //Define the required values and variables
        final int MINUTES_IN_A_YEAR = 60 * 24 * 365;
        final int MINUTES_IN_A_DAY = 60 * 24;
        long years =  minutes / MINUTES_IN_A_YEAR;
        long days = (minutes % MINUTES_IN_A_YEAR) / MINUTES_IN_A_DAY;

        //Display the result to the user
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}


