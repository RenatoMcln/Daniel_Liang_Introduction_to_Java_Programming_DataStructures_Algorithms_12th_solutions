package Chapter04;

import java.util.Scanner;

public class Exercise4_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a hex digit: ");
        String s = input.next();
        char hex = Character.toUpperCase(s.charAt(0));

        // Handle exceptions
        if (s.length() != 1 || (hex < '0' || hex > 'F') || (hex > '9' && hex < 'A')) {
            System.out.printf("%s is an invalid input", s);
            System.exit(1);
        }

        // Convert from hex to decimal and from decimal to binary
        int decimal = Integer.parseInt(s, 16);
        String binary = Integer.toBinaryString(decimal);

        // Display the result to the user
        System.out.printf("The binary value is %s", binary);

    }
}


