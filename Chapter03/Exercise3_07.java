package Chapter03;

import java.util.Scanner;

public class Exercise3_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for input
        System.out.println("This converter will ask you to enter two values:\n" +
                "An integer value for dollars and another for cents.\n" +
                "The converter will then return the equivalent amount\n" +
                "in dollars, quarters, dimes, nickels and cents, in a way that\n" +
                "minimizes the total number of coins.\n");

        //Prompt for the first input
        System.out.print("Enter an integer number of dollars to convert: $");
        long input1 = input.nextLong();

        //Prompt for the second input
        System.out.print("Enter an integer number of cents to convert: ¢");
        long input2 = input.nextLong();

        //Define the variables to display to the user

        //Dollars
        long dollars = (input1 * 100 + input2) / 100;
        long initialRemainingCents = (input1 * 100 + input2) % 100; // To display
        long remainingCents = (input1 * 100 + input2) % 100; // To change at each coin

        //Quarters
        long quarters = remainingCents / 25;
        remainingCents = remainingCents % 25;

        //Dimes
        long dimes = remainingCents / 10;
        remainingCents = remainingCents % 10;

        //Nickels
        long nickels = remainingCents / 5;
        remainingCents = remainingCents % 5;

        //Pennies
        long pennies = remainingCents;


        //Display the report to the user
        System.out.println("\nYou entered: $" + (input1 * 100 + input2) / 100.0 + " (" + dollars +
                " dollars and " + initialRemainingCents + " cents)\n");

        System.out.println("Your value converted is: ");

        if (dollars > 1) {
            System.out.println("Dollars: " + dollars + " Dollars");
        } else if (dollars == 1) {
            System.out.println("Dollars: " + dollars + " Dollar");
        }

        if (quarters > 1) {
            System.out.println("Quarters: " + quarters + " Quarters");
        } else if (quarters == 1) {
            System.out.println("Quarters: " + quarters + " Quarter");
        }

        if (dimes > 1) {
            System.out.println("Dimes: " + dimes + " Dimes");
        } else if (dimes == 1) {
            System.out.println("Dimes: " + dimes + " Dime");
        }

        // Nickels are never greater than 1
        if (nickels == 1) {
            System.out.println("Nickels: " + nickels + " Nickel");
        }

        if (pennies > 1) {
            System.out.println("Cents: " + pennies + " Cents");
        } else if (pennies == 1) {
            System.out.println("Cents: " + pennies + " Cent");
        }


    }
}