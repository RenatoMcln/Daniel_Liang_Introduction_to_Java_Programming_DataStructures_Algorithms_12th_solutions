package Chapter03;

import java.util.Scanner;

public class Exercise3_19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter the three sides of a triangle to calculate its perimeter.\n" +
                         "Enter the three sides with a space between them: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Checking if the input is valid and displaying the result to the user
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            double perimeter = side1 + side2 + side3;
            System.out.println("The perimeter is " + perimeter);
        } else {
            System.out.println("Invalid input! Enter the sides of a valid triangle.");
            System.exit(1);
        }

    }
}

