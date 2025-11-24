package Chapter04;

import java.util.Scanner;

public class Exercise4_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt for the input
        System.out.print("Enter an amount of dollars to convert: $");
        String amount = input.next();


        // Separate dollars and cents in strings
        String initialDollars;
        String initialCents;

        if (amount.contains(".")) {
            initialDollars = amount.substring(0, amount.indexOf('.'));
            initialCents = amount.substring(amount.indexOf('.') + 1);
        } else {
            initialDollars = amount;
            initialCents = "0";
        }

        // Handle exceptions
        if (Integer.parseInt(initialDollars) < 0) {
            System.out.println("Invalid value! Enter a positive amount.");
            System.exit(1);
        }


        // Convert the two strings to primitive values
        int dollars = Integer.parseInt(initialDollars) + Integer.parseInt(initialCents) / 100;
        int cents = Integer.parseInt(initialCents) % 100;

        String finalAmount = dollars + "." + cents;
        double finalAmountInDouble = Double.parseDouble(finalAmount);


        // Define the amount of each currency
        int remainingCents = cents;

        int quarters = remainingCents / 25;
        remainingCents %= 25;

        int dimes = remainingCents / 10;
        remainingCents %= 10;

        int nickels = remainingCents / 5;
        remainingCents %= 5;

        int pennies = remainingCents;


        // Display the result to the user
        if (initialCents.length() < 3) {
            System.out.printf("You entered: $%.2f (%d dollars and %d cents)", finalAmountInDouble, dollars,
                    (int) (100 * (finalAmountInDouble - (int) finalAmountInDouble)));
        } else {
            System.out.printf("You entered: $%d.%02d (%d dollars and %d cents)", dollars, cents, dollars, cents);
        }


        System.out.println("\nYour value converted is: ");


        // Display only significant values
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
