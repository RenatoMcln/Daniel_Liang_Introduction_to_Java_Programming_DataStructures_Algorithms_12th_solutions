package Chapter04;

import java.util.Scanner;

public class Exercise4_04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        // Compute area
        double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));

        // Display the result to the user
        System.out.printf("The area of the hexagon is %.2f", area);

    }
}
