package Chapter03;

import java.util.Scanner;

public class Exercise3_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generating the random number
        int headsOrTailsNumber = (int) (Math.random() * 2);
        String coinSide;
        if (headsOrTailsNumber == 0) {
            coinSide = "head!";
        } else {
            coinSide = "tail!";
        }

        // Prompt the user for the guess
        System.out.println("0 - Head, 1 - Tail.\nTry to guess the coin side by entering 0 or 1.");
        System.out.print("Enter your guess: ");
        byte userGuess = input.nextByte();

        // Display the result to the user
        if (userGuess != 1 && userGuess != 0) {
            System.out.println("Invalid guess! Please enter o or 1.");
            System.exit(1);
        } else if (userGuess == headsOrTailsNumber) {
            System.out.println("The coin side is " + coinSide + " You're with lucky!");
        } else {
            System.out.println("The coin side is " + coinSide + " Try again.");
        }

    }
}