package Chapter03;

import java.util.Scanner;

public class Exercise3_08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.println("Enter three integers: \n");

        // First input
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Second input
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Third input\
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();


        // Sorting the numbers in increasing order
        if (number1 > number2) {
            int tempNumber1 = number1;
            number1 = number2;
            number2 = tempNumber1;
        }

        if (number2 > number3) {
            int tempNumber2 = number2;
            number2 = number3;
            number3 = tempNumber2;
        }

        if (number1 > number2) {
            int tempNumber1 = number1;
            number1 = number2;
            number2 = tempNumber1;
        }

        // Display the numbers sorted
        System.out.println(number1 + " " + number2 + " " + number3);

    }
}
