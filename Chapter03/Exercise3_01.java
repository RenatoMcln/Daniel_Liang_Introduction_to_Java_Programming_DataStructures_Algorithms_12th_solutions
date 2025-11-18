
package Chapter03;

import java.util.Scanner;

public class Exercise3_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the values of a, b and c.
        System.out.println("Enter a, b, and c for the quadratic equation: ");

        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        // Calculating the discriminant and defining the number of solutions
        double discriminant = b * b - 4 * a * c;

        // Defining roots
        double root1 = (int) ((-b + Math.pow(discriminant, 0.5)) / (2 * a) * 100000) / 100000.0;
        double root2 = (int) ((-b - Math.pow(discriminant, 0.5)) / (2 * a) * 100000) / 100000.0;

        // Calculating roots and displaying the result to the user
        if (discriminant > 0) {
            System.out.println("The equation has two roots " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + root1);
        } else {
            System.out.println("The equation has no real roots");
        }

    }
}
