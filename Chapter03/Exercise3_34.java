package Chapter03;

import java.util.Scanner;

public class Exercise3_34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter three points' coordinates: p0, p1 (line endpoints), and p2 (separate point): ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Checking p2's position
        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        // x1 and y1 are always greater than x0 and y0
        if (y0 > y1) {
            double tempY0 = y0;
            y0 = y1;
            y1 = tempY0;
        }

        if (x0 > x1) {
            double tempX0 = x0;
            x0 = x1;
            x1 = tempX0;
        }

        // Display the result to the user
        if ( position == 0 && (y2 <= y1 && y2 >= y0 && x2 >= x0 && x2 <= x1) ) {
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        } else {
            System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        }

    }
}