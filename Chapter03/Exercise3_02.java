
package Chapter03;

import java.util.Scanner;

public class Exercise3_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Defining the required variables
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        // Display the question
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? Enter your answer: ");
        double userAnswer = input.nextInt();
        int correctAnswer = number1 + number2 + number3;

        // Display the result to the user
        if (userAnswer == correctAnswer) {
            System.out.println("The answer is " + correctAnswer + " You're right!");
        } else {
            System.out.println("Wrong! The correct answer is " + correctAnswer);
        }

    }
}