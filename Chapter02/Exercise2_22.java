package Chapter02;

import java.util.Scanner;

public class Exercise2_22 {
    //Financial application: monetary units
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Instructions
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
        long dollars = (input1 * 100 + input2) / 100;

        final long INITIAL_REMAINING_CENTS = (input1 * 100 + input2) % 100;
        long remainingCents = (input1 * 100 + input2) % 100;

        long quarters = remainingCents / 25;
        remainingCents = remainingCents % 25;

        long dimes = remainingCents / 10;
        remainingCents = remainingCents % 10;

        long nickels = remainingCents / 5;
        remainingCents = remainingCents % 5;

        long pennies = remainingCents;


        //Display the report to the user
        System.out.println("\nYou entered: $" + (input1 * 100 + input2) / 100.0 + " (" + dollars +
                " dollars and " + INITIAL_REMAINING_CENTS + " cents)\n");
        System.out.println("Your value converted is: ");
        System.out.println("Dollars: " + dollars + " Dollars");
        System.out.println("Quarters: " + quarters + " Quarters");
        System.out.println("Dimes: " + dimes + " Dimes");
        System.out.println("Nickels: " + nickels + " Nickels");
        System.out.println("Cents: " + pennies + " Cents");

    }

}

