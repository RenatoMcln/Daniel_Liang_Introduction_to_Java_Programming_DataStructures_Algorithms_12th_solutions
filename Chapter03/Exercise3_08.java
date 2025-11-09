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

        // Defining conditions
        boolean condition1 = number1 >= number2 && number1 >= number3;
        boolean condition2 = number2 >= number1 && number2 >= number3;
        boolean condition3 = number3 >= number1 && number3 >= number2;

        // Display the three numbers to the user in increasing order
        if (condition1 && number2 >= number3) {
            System.out.println(number3 + " / " + number2 + " / " + number1);
        }

        if (condition1 && number2 < number3) {
            System.out.println(number2 + " / " + number3 + " / " + number1);
        }

        if (condition2 && number1 >= number3) {
            System.out.println(number3 + " / " + number1 + " / " + number2);
        }

        if (condition2 && number1 < number3) {
            System.out.println(number1 + " / " + number3 + " / " + number2);
        }

        if (condition3 && number1 >= number2) {
            System.out.println(number2 + " / " + number1 + " / " + number3);
        }

        if (condition3 && number1 < number2) {
            System.out.println(number1 + " / " + number2 + " / " + number3);
        }

    }
}
