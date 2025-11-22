package Chapter04;

import java.util.Scanner;

public class Exercise4_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.print("Enter point 1 ((x1 and y1) latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 ((x1 and y1) latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        // Define the required variables
        final double radiusEarth = 6371.01;
        double distance = radiusEarth * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1- y2));

        // Display the result to the user
        System.out.println("The distance between the two points is " + distance + " km");

    }
}

