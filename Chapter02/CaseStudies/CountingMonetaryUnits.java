package Chapter02.CaseStudies;

import java.util.Scanner;
//In this version of the converter, I changed the input to two values to solve the precision problem.
public class CountingMonetaryUnits {

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
        long initialRemainingCents = (input1 * 100 + input2) % 100;
        long remainingCents = (input1 * 100 + input2) % 100;
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
        System.out.println("Dollars: " + dollars + " Dollars");
        System.out.println("Quarters: " + quarters + " Quarters");
        System.out.println("Dimes: " + dimes + " Dimes");
        System.out.println("Nickels: " + nickels + " Nickels");
        System.out.println("Cents: " + pennies + " Cents");

    }

}