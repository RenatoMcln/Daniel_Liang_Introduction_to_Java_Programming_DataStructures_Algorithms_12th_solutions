package Chapter03;

import java.util.Scanner;

public class Exercise3_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the random numbers
        int number1 = (int) (Math.random() * 99);
        int number2 = (int) (Math.random() * 99);

        int answer = number1 + number2;

        // Prompt the user for the answer
        System.out.println("What is " + number1 + " + " + number2 + "? Enter your answer: ");
        double userAnswer = input.nextDouble();

        // Display the result to the user
        if (userAnswer == answer) {
            System.out.println("The answer is " + answer + ". Right!");
        } else {
            System.out.println("The answer is " + answer + ". Wrong!");
        }

    }
}
