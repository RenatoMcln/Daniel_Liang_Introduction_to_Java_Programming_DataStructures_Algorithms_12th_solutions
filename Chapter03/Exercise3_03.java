
package Chapter03;

import java.util.Scanner;

public class Exercise3_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.println("Given a 2×2 linear system, enter the coefficients a, b, c, d and the constants e and f to solve it.");

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        System.out.print("Enter d: ");
        double d = input.nextDouble();
        System.out.print("Enter e: ");
        double e = input.nextDouble();
        System.out.print("Enter f: ");
        double f = input.nextDouble();

        // Defining the variables
        double solutionX = (e * d - b * f) / (a * d - b * c);
        double solutionY = (a * f - e * c) / (a * d - b * c);

        //Display the result to the user
        System.out.println( ((a * d - b * c) != 0) ? "x is " + solutionX + " and y is " + solutionY : "The equation has no solution" );

    }
}
