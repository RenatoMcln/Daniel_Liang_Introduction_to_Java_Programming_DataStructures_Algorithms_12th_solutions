package Chapter03;

import java.util.Scanner;

public class Exercise3_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display instructions
        System.out.println("Enter a coordinate (x, y) to check whether it is inside or outside a\n" +
                           "rectangle of width 10 and height 5, centered at (0, 0).");


        // Prompt the user for the input
        System.out.print("Enter x: ");
        String tempX = input.nextLine();
        tempX = tempX.trim();
        double x = Double.parseDouble(tempX);

        System.out.print("Enter y: ");
        String tempY = input.nextLine();
        tempY = tempY.trim();
        double y = Double.parseDouble(tempY);

        // Checking the distance between the points
        double distanceWidth = Math.pow(x * x, 0.5);
        double distanceHeight = Math.pow(y * y, 0.5);

        // Display the result to the user
        if (distanceWidth > 5 || distanceHeight > 2.5) {
            System.out.println("\nPoint (" + x + ", " + y + ") is not in the rectangle.");
        } else {
            System.out.println("\nPoint (" + x + ", " + y + ") is in the circle.");
        }

    }
}
