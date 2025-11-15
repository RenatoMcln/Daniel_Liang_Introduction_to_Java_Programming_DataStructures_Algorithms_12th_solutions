package Chapter03;

import java.util.Scanner;

public class Exercise3_32 {

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
        double position = (x1- x0) * (y2- y0) - (x2- x0) * (y1- y0);

        // Display the result to the user
        if (position > 0) {
            System.out.println("p2 is on the left side of the line");
        } else if (position == 0) {
            System.out.println("p2 is on the same line");
        } else {
            System.out.println("p2 is on the right side of the line");
        }

    }
}
