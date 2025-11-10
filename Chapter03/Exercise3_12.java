package Chapter03;

import java.util.Scanner;

public class Exercise3_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        // Handling exceptions
        if (number > 999 || number < 100 && number >= 0) {
            System.out.println("Invalid number! Please enter a 3-digit number.");
            System.exit(1);
        } else if (number < -999 || (number > -100 && number < 0)) {
            System.out.println("Invalid number! Please enter a 3-digit number.");
            System.exit(1);
        }

        // Display the result to the user
        if (number % 10 == number / 100) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

    }
}
