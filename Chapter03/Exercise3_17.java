package Chapter03;

import java.util.Scanner;

public class Exercise3_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generating random scissor-rock-paper
        int pcRound = (int) (Math.random() * 3);

        String computerRound = "";

        switch (pcRound) {
            case 0: computerRound = "scissor"; break;
            case 1: computerRound = "rock"; break;
            case 2: computerRound = "paper"; break;
        }

        // Prompt the user for the input
        System.out.print("Enter a number to play scissor-rock-paper with the computer.\n" +
                "scissor (0), rock (1), paper (2): ");
        int userRound = input.nextInt();

        // Handling exceptions
        if (userRound < 0 || userRound > 2) {
            System.out.println("Invalid input, enter a valid number!");
            System.exit(1);
        }

        String playerRound = "";

        switch (userRound) {
            case 0: playerRound = "scissor"; break;
            case 1: playerRound = "rock"; break;
            case 2: playerRound = "paper"; break;
        }


        // Display the result to the user
        if (userRound == pcRound) {
            System.out.println("The computer is " + computerRound + ". You are " + playerRound + ". It is a draw");
        } else if (userRound == 0 && pcRound == 1) {
            System.out.println("The computer is " + computerRound + ". You are " + playerRound + ". You lost");
        } else if (userRound == 0 && pcRound == 2) {
            System.out.println("The computer is " + computerRound + ". You are " + playerRound + ". You won");
        } else if (userRound == 1 && pcRound == 0) {
            System.out.println("The computer is " + computerRound + ". You are " + playerRound + ". You won");
        } else if (userRound == 1 && pcRound == 2) {
            System.out.println("The computer is " + computerRound + ". You are " + playerRound + ". You lost");
        } else if (userRound == 2 && pcRound == 0) {
            System.out.println("The computer is " + computerRound + ". You are " + playerRound + ". You lost");
        } else {
            System.out.println("The computer is " + computerRound + ". You are " + playerRound + ". You won");
        }


    }
}