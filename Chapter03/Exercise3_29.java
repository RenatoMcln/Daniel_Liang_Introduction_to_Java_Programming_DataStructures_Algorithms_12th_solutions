package Chapter03;

import java.util.Scanner;

public class Exercise3_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter circle1’s center x-, y-coordinates, and radius in this order: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();

        System.out.print("Enter circle2’s center x-, y-coordinates, and radius in this order: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();

        // Checking the distance between the points
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        // Define conditions for better readability
        boolean isInside = distance <= radius1 - radius2;
        boolean overlap = distance <= radius1 + radius2;

        if (isInside) {
            System.out.println("Circle2 is inside circle1.");
        } else if (overlap) {
            System.out.println("Circle2 overlaps circle1.");
        } else {
            System.out.println("Circle2 does not overlap circle1.");
        }

    }
}