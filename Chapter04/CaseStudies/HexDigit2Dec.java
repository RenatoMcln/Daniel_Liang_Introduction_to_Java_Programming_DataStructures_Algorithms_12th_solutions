package Chapter04.CaseStudies;

import java.util.Scanner;

public class HexDigit2Dec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter hex number: ");
        String hexInput = input.next();

        // Handle exceptions
        if (hexInput.length() != 1) {
            System.out.println("Invalid input! Enter exactly one character.");
            System.exit(1);
        }

        char hexChar = Character.toUpperCase(hexInput.charAt(0));

        // Handle exceptions
        if ((hexChar < 49 || hexChar > 70) || (hexChar > 57 && hexChar < 65)) {
            System.out.println("Invalid character!");
            System.exit(1);
        }

        // Display yhe result to the user
        if (hexChar >= 'A') {
            System.out.println("The decimal value for hex digit " + hexInput.toUpperCase() + " is " + (hexChar - 'A' + 10));
        } else {
            System.out.println("The decimal value for hex digit " + hexInput.toUpperCase() + " is " + hexInput);
        }

    }

}


