package Chapter03;

import java.util.Scanner;

public class Exercise3_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display instructions
        System.out.println("Enter a coordinate (x, y) to check whether it is\n" +
                           "inside or outside a circle of radius 10 centered at (0, 0).");
        
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
        double distance = Math.pow(Math.pow(x - 0, 2) + Math.pow(y - 0, 2), 0.5);

        // Display the result to the user
        if (distance > 10) {
            System.out.println("\nPoint (" + x + ", " + y + ") is not in the circle.");
        } else {
            System.out.println("\nPoint (" + x + ", " + y + ") is in the circle.");
        }

    }
}

