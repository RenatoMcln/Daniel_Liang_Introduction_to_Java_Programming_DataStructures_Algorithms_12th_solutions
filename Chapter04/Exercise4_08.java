package Chapter04;

import java.util.Scanner;

public class Exercise4_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter an ASCII code: ");
        int ascii = input.nextInt();

        // Handle exceptions
        if (ascii < 0 || ascii > 127) {
            System.out.println("Invalid ASCII code! Please enter a code from 0 to 127.");
            System.exit(1);
        }

        // Display the result to the user
        System.out.printf("The character for ASCII code %d is %c", ascii, ascii);

    }
}

