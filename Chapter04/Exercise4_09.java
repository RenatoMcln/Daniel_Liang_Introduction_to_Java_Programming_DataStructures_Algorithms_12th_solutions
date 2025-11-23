package Chapter04;

import java.util.Scanner;

public class Exercise4_09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a character: ");
        String s = input.next();

        // Handle exceptions
        if (s.length() != 1) {
            System.out.println("Invalid input! Please enter exactly one character.");
            System.exit(1);
        }

        // Display the Unicode to the user
        char character = s.charAt(0);
        System.out.printf("The Unicode for the character %c is %d", character, (int) character);

    }
}
