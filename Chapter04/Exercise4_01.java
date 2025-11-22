package Chapter04;

import java.util.Scanner;

public class Exercise4_01{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        // Compute side S
        double s = 2 * r * Math.sin(Math.PI / 5);

        // Compute area
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        // Display the result to the user
        System.out.printf("The area of the pentagon is %.2f", area);

    }
}

