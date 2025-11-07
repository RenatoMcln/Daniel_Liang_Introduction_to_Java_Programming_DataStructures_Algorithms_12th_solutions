
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user the instructions
        System.out.println("Enter a two-digit number to guess the lottery number.\n");
        // Input
        System.out.print("Enter your guess from 00 to 99: ");
        int numberGuess = input.nextInt();

        //Defining the required variables
        int lotteryNumber = (int) (Math.random() * 100);

        // Get digits from guess
        int numberGuess1 = numberGuess / 10;
        int numberGuess2 = numberGuess % 10;

        // Get digits from lottery
        int lotteryNumber1 = lotteryNumber / 10;
        int lotteryNumber2 = lotteryNumber % 10;

        // Display the result to the user
        if (numberGuess < 0 || numberGuess > 99) {
            System.out.println("Invalid number! Enter a number from 00 to 99.");

        } else if (numberGuess == lotteryNumber) {
            System.out.println("The lottery number is " + lotteryNumber + "\nExact match: you win $10,000");

        } else if (numberGuess == (lotteryNumber % 10 * 10) + (lotteryNumber / 10)) {
            System.out.println("The lottery number is " + lotteryNumber + "\nMatch all digits: you win $3,000");

        } else if ( (numberGuess1 == lotteryNumber1 || numberGuess1 == lotteryNumber2)
                 || (numberGuess2 == lotteryNumber1 || numberGuess2 == lotteryNumber2) ) {
            System.out.println("The lottery number is " + lotteryNumber + "\nMatch one digit: you win $1,000");

        } else {
            System.out.println("The lottery number is " + lotteryNumber + "\nSorry: no match");
        }

    }
}
