package Chapter03;

import java.util.Scanner;

public class Exercise3_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Instructions
        System.out.println("Enter four coordinates that form two different lines.\n" +
                           "If they intersect, this program will calculate the intersection point.\n");

        // Prompt the user for the first point
        System.out.print(" Enter (8 numbers) x1, y1, x2, y2 (first line), x3, y3, x4, y4 (second line): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Compute the intersection point using Cramer's rule

        //Required variables
        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        // Solution 2x2
        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        // Display the result to the user
        if (a * d - b * c == 0) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
        
    }
}
