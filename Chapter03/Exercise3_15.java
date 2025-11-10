package Chapter03;

import java.util.Scanner;

public class Exercise3_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Defining the required variables
        int lotteryNumber = (int) (Math.random() * 1000);

        // Prompt the user the instructions
        System.out.println("Enter a three-digit number to guess the lottery number.\n");
        // Input
        System.out.print("Enter your guess from 000 to 999: ");
        String numberGuessString = input.nextLine();

        int numberGuess = Integer.parseInt(numberGuessString);

        if (numberGuessString.length() != 3) {
            System.out.println("Invalid number! Enter a number from 000 to 999.");
            System.exit(1);
        }


        // Get digits from guess
        int numberGuess1 = numberGuess / 100;
        int numberGuess2 = numberGuess / 10 % 10;
        int numberGuess3 = numberGuess % 10;

        // Get digits from lottery number
        int lotteryNumber1 = lotteryNumber / 100;
        int lotteryNumber2 = lotteryNumber /10 % 10;
        int lotteryNumber3 = lotteryNumber % 10;

        // Sorting userGuess to simplify comparison.
        if (numberGuess1 > numberGuess2) {
            int temp = numberGuess1;
            numberGuess1 = numberGuess2;
            numberGuess2 = temp;
        }

        if (numberGuess2 > numberGuess3) {
            int temp = numberGuess2;
            numberGuess2 = numberGuess3;
            numberGuess3 = temp;
        }

        if (numberGuess1 > numberGuess2) {
            int temp = numberGuess1;
            numberGuess1 = numberGuess2;
            numberGuess2 = temp;
        }

        // Sorting lotteryNumber to simplify comparison.
        if (lotteryNumber1 > lotteryNumber2) {
            int temp = lotteryNumber1;
            lotteryNumber1 = lotteryNumber2;
            lotteryNumber2 = temp;
        }

        if (lotteryNumber2 > lotteryNumber3) {
            int temp = lotteryNumber2;
            lotteryNumber2 = lotteryNumber3;
            lotteryNumber3 = temp;
        }

        if (lotteryNumber1 > lotteryNumber2) {
            int temp = lotteryNumber1;
            lotteryNumber1 = lotteryNumber2;
            lotteryNumber2 = temp;
        }

        // Display the result to the user
        if (numberGuess == lotteryNumber) {
            System.out.println("The lottery number is " + lotteryNumber + "\nExact match: you win $10,000");

        } else if (numberGuess1 == lotteryNumber1 && numberGuess2 == lotteryNumber2 && numberGuess3 == lotteryNumber3) {
            System.out.println("The lottery number is " + lotteryNumber + "\nMatch all digits in random order: you win $3,000");

        } else if ( (numberGuess1 == lotteryNumber1 || numberGuess1 == lotteryNumber2 || numberGuess1 == lotteryNumber3)
                 || (numberGuess2 == lotteryNumber1 || numberGuess2 == lotteryNumber2 || numberGuess2 == lotteryNumber3)
                 || (numberGuess3 == lotteryNumber1 || numberGuess3 == lotteryNumber2 || numberGuess3 == lotteryNumber3) ) {
            System.out.println("The lottery number is " + lotteryNumber + "\nMatch at least one digit: you win $1,000");

        } else {
            System.out.println("The lottery number is " + lotteryNumber + "\nSorry: no match");
        }

    }
}