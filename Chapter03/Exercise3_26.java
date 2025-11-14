package Chapter03;

import java.util.Scanner;

public class Exercise3_26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Instructions
        System.out.println("Enter an integer and determines whether it is divisible\n" +
                "by 5 and 6, by 5 or 6, and by 5 or 6 but not both.\n");

        // Prompt the user for the input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Define conditions
        boolean cond1 = number % 5 == 0 && number % 6 == 0;
        boolean cond2 = number % 5 == 0 || number % 6 == 0;
        boolean cond3 = number % 5 == 0 ^ number % 6 == 0;

        // Display the result to the user
        System.out.println("Is " + number + " divisible by 5 and 6? " + cond1);
        System.out.println("Is " + number + " divisible by 5 or 6? " + cond2);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + cond3);


    }
}
