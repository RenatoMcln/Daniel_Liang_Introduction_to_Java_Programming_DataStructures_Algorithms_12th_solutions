package Chapter03;

import java.util.Scanner;

public class Exercise3_28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter rectangle1’s center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter rectangle2’s center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        // Define required variables

        // Extreme coordinates of rectangle 1
        double xMax1 = x1 + width1 / 2;
        double xMin1 = x1 - width1 / 2;
        double yMax1 = y1 + height1 / 2;
        double yMin1 = y1 - height1 / 2;

        // Extreme coordinates of rectangle 2
        double xMax2 = x2 + width2 / 2;
        double xMin2 = x2 - width2 / 2;
        double yMax2 = y2 + height2 / 2;
        double yMin2 = y2 - height2 / 2;

        // Define conditions
        boolean isInside = (xMax2 <= xMax1 && xMin2 >= xMin1) &&
                (yMax2 <= yMax1 && yMin2 >= yMin1);

        boolean overlap = (xMax2 >= xMin1 && xMin2 <= xMax1) &&
                (yMax2 >= yMin1 && yMin2 <= yMax1);

        if (isInside) {
            System.out.println("Rectangle2 is inside Rectangle1");
        } else if (overlap) {
            System.out.println("Rectangle2 overlaps Rectangle1");
        } else {
            System.out.println("Rectangle2 does not overlap Rectangle1");
        }

    }
}
