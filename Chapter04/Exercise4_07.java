package Chapter04;

import java.util.Scanner;

public class Exercise4_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        // Generate random angles
        double randomAngle1 = Math.toRadians((int) (Math.random() * 361));
        double randomAngle2 = Math.toRadians((int) (Math.random() * 361));
        double randomAngle3 = Math.toRadians((int) (Math.random() * 361));
        double randomAngle4 = Math.toRadians((int) (Math.random() * 361));

        // Define coordinates of the five points
        double x1 = radius * Math.cos(randomAngle1); // P1
        double y1 = radius * Math.sin(randomAngle1);

        double x2 = 0; // P2
        double y2 = radius;

        double x3 = radius * Math.cos(randomAngle2); // P3
        double y3 = radius * Math.sin(randomAngle2);

        double x4 = radius * Math.cos(randomAngle3); // P4
        double y4 = radius * Math.sin(randomAngle3);

        double x5 = radius * Math.cos(randomAngle4); // P5
        double y5 = radius * Math.sin(randomAngle4);

        // Display the coordinates of the five points
        System.out.printf("The coordinates of five points on the pentagon are" +
                          "%n(%.2f, %.2f)%n(%.2f, %.2f)%n(%.2f, %.2f)%n(%.2f, %.2f)%n(%.2f, %.2f)%n",
                          x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);


    }
}

