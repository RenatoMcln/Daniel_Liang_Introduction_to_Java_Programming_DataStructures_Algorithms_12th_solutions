package Chapter04;

import java.util.Scanner;

public class Exercise4_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a letter: ");
        String s = input.next();
        char letter = Character.toUpperCase(s.charAt(0));

        // Handle exceptions
        if (s.length() != 1 || !Character.isLetter(letter)) {
            System.out.printf("%s is an invalid input", s);
            System.exit(1);
        }

        // Define the corresponding number
        byte number = -1;

        if (letter == 'A' || letter == 'B' || letter == 'C') {
            number = 2;
        } else if (letter == 'D' || letter == 'E' || letter == 'F') {
            number = 3;
        } else if (letter == 'G' || letter == 'H' || letter == 'I') {
            number = 4;
        } else if (letter == 'J' || letter == 'K' || letter == 'L') {
            number = 5;
        } else if (letter == 'M' || letter == 'N' || letter == 'O') {
            number = 6;
        } else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
            number = 7;
        } else if (letter == 'T' || letter == 'U' || letter == 'V') {
            number = 8;
        } else if (letter == 'W' || letter == 'X' || letter == 'Y'|| letter == 'Z') {
            number = 9;
        }

        // Display the result to the user
        System.out.printf("The corresponding number is %d", number);

    }
}


