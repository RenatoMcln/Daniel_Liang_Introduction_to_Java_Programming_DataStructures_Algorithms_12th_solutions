package Chapter03;

import java.util.Scanner;

public class Exercise3_31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the first input
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();

        // Prompt the user for the second input
        System.out.print("Enter 0 to convert dollars to RMB or 1 to convert RMB to dollars: ");
        byte changeModality = input.nextByte();

        if (changeModality != 0 && changeModality != 1) {
            System.out.println("Invalid choice! Please enter 0 or 1.");
            System.exit(1);
        }

        // Prompt the user for the third input
        double dollars;
        double rmb;

        // Execute the exchange and display the result to the user
        if (changeModality == 0) {
            System.out.print("Enter the dollar amount: ");
            dollars = input.nextDouble();
            rmb = (int) (dollars * rate * 100 + 0.5) / 100.0;

            System.out.println("$" + dollars + " is " + rmb + " yuan");
        } else {
            System.out.print("Enter the RMB amount: ");
            rmb = input.nextDouble();
            dollars = (int) (rmb / rate * 100 + 0.5) / 100.0;

            System.out.println(rmb + " yuan is $" + dollars);
        }

    }
}