package Chapter04.CaseStudies;

import java.util.Scanner;

public class ComputeAngles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Display the instructions to the user.
        System.out.println("Enter the three coordinates of the three\n" +
                "points that form a triangle to calculate its angles.");

        // 2. Prompt the user for the three points.
        System.out.print("Enter (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter (x3, y3): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // 3. Calculate the lengths of the three sides.
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double c = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        // 4. Calculate the three angles
        double angleA = Math.toDegrees(Math.acos((b * b - c * c - a * a) / (-2 * c * a)));
        double angleB = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * b * a)));
        double angleC = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));

        // 5. Round the angles
        angleA = Math.round(angleA * 100) / 100.0;
        angleB = Math.round(angleB * 100) / 100.0;
        angleC = Math.round(angleC * 100) / 100.0;

        
        // 6. Display the result to the user
        System.out.println("The three angles are: A = " + angleA + ", B = " + angleB + ", and C = " + angleC + ".");

    }

}
