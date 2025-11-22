package Chapter04.CaseStudies;

import java.util.Scanner;

public class LotteryUsingStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user the instructions
        System.out.println("Enter a two-digit number to guess the lottery number.\n");
        // Input
        System.out.print("Enter your guess from 00 to 99: ");
        String numberGuess = input.next();

        //Defining the required variables
        String lotteryNumber = "" + (int) (Math.random() * 10) + (int) ((Math.random() * 10));

        // Get digits from guess
        String numberGuess1 = numberGuess.substring(0, 1);
        String numberGuess2 = numberGuess.substring(1, 2);

        // Get digits from lottery
        String lotteryNumber1 = lotteryNumber.substring(0, 1);
        String lotteryNumber2 = lotteryNumber.substring(1, 2);

        // Handle exceptions
        // Display the result to the user
        if (numberGuess.length() != 2) {
            System.out.println("Invalid input! Enter a number from 00 to 99.");
        } else if (!Character.isDigit(numberGuess1.charAt(0)) || !Character.isDigit(numberGuess2.charAt(0))) {
            System.out.println("Invalid input! Enter a number from 00 to 99.");
        } else if (numberGuess.equals(lotteryNumber)) {
            System.out.println("The lottery number is " + lotteryNumber + "\nExact match: you win $10,000");
        } else if (numberGuess1.equals(lotteryNumber2) && numberGuess2.equals(lotteryNumber1)) {
            System.out.println("The lottery number is " + lotteryNumber + "\nMatch all digits: you win $3,000");
        } else if ( lotteryNumber.contains(numberGuess1) || lotteryNumber.contains(numberGuess2) ) {
            System.out.println("The lottery number is " + lotteryNumber + "\nMatch one digit: you win $1,000");
        } else {
            System.out.println("The lottery number is " + lotteryNumber + "\nSorry: no match");
        }

    }
}
