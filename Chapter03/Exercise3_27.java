package Chapter03;

import java.util.Scanner;

public class Exercise3_27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the input
        System.out.println("Enter a point’s x- and y-coordinates (x, y)");

        System.out.print("Enter x: ");
        String tempX = input.nextLine();
        double x = Double.parseDouble(tempX);

        System.out.print("Enter y: ");
        String tempY = input.nextLine();
        double y = Double.parseDouble(tempY);

        // Display the result to the user

        // Simplify a condition
        boolean isOutside = (x < 0) || (y < 0) || (x > 200) || (y > 100);

        if (isOutside) {
            System.out.println("The point (" + x + ", " + y + ") is not in the triangle");
        } else if (y > (100 - x / 2)) { // (100 - x / 2) This is the max value for y
            System.out.println("The point (" + x + ", " + y + ") is not in the triangle");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is in the triangle");
        }


    }
}

