package Chapter04;

import java.util.Scanner;

public class Exercise4_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a letter: ");
        String s = input.next();
        char letter = s.charAt(0);
        char testLetter = Character.toUpperCase(s.charAt(0));

        // Handle exceptions
        if (s.length() != 1 || !Character.isLetter(letter)) {
            System.out.printf("%s is an invalid input", s);
            System.exit(1);
        }

        // Display the result to the user
        if (testLetter == 65 || testLetter == 69 || testLetter == 73 || testLetter == 79 || testLetter == 85) {
            System.out.printf("%c is a vowel", letter);
        } else {
            System.out.printf("%c is a consonant", letter);
        }

    }
}

