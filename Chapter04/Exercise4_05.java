package Chapter04;

import java.util.Scanner;

public class Exercise4_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the side length: ");
        double length = input.nextDouble();

        // Compute area
        double area = (sides * length * length) / (4 * Math.tan(Math.PI / sides));

        // Display the result to the user
        System.out.println("The area of the polygon is " + area);

    }
}


