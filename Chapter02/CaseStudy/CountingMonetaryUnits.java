package Chapter02.CaseStudy

import java.util.Scanner;

public class CountingMonetaryUnits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the inputs to the user
        System.out.println("This converter will ask you to enter two values:\n" +
                           "An integer value for dollars and another for cents.\n" +
                           "The converter will then return the equivalent amount in dollars, quarters, dimes, nickels and cents.\n");
        //Prompt for the input1
        System.out.print("Enter an integer number of dollars to convert: $");
        long input1 = input.nextLong();
        //Prompt for the input2
        System.out.print("Enter an integer number of cents to convert: ¢");
        long input2 = input.nextLong();

        //Defining the variables to display for the user
        //dollars
        long dollars = (input1 * 100 + input2) / 100;
        long remainingCents = (input1 * 100 + input2) % 100;
        //quarters
        long quarters = (input1 * 100 + input2) / 25;
        //dimes
        long dimes = (input1 * 100 + input2) / 10;
        //nickels
        long nickels = (input1 * 100 + input2) / 5;
        //pennies
        long pennies = (input1 * 100 + input2);


        //Display to the user the report
        System.out.println("\nYou entered: $" + (input1 * 100 + input2) / 100.0 + " (" + dollars +
                           " dollars and " + remainingCents + " cemts)\n");
        System.out.println("Your value converted is: ");
        System.out.println("In dollars: " + dollars + " Dollars");
        System.out.println("In quarters: " + quarters + " Quarters");
        System.out.println("In dimes: " + dimes + " Dimes");
        System.out.println("In nickels: " + nickels + " Nickels");
        System.out.println("In cents: " + pennies + " Cents");

    }
}
