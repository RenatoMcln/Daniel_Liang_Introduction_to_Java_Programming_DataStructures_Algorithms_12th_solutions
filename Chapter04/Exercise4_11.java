package Chapter04;

import java.util.Scanner;

public class Exercise4_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        // Handle exceptions
        if (decimal < 0 || decimal > 15) {
            System.out.printf("%d is an invalid input", decimal);
            System.exit(1);
        }

        // Display the result to the user
        char hexDecimal;

        if (decimal < 10) {
            hexDecimal = (char) ('0' + decimal);
            System.out.printf("The hex value is %d", decimal);
        } else {
            hexDecimal = (char) ('A' - 10 + decimal);
            System.out.printf("The hex value is %c", hexDecimal);
        }

    }
}
