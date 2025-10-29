package Chapter02;

import java.util.Scanner;

public class Exercise2_19 {
    //Geometry: area of a triangle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter three points
        System.out.println("Enter the coordinates of three points of a triangle to calculate its area\n");

        System.out.print("Enter x1 and y1 e.g. x1 enter, y1 enter. Enter the numbers: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2 e.g. x2 enter, y2 enter. Enter the numbers: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3 and y3 e.g. x3 enter, y3 enter. Enter the numbers: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();


        //Defining the required variables
        double side1 = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);
        double side2 = Math.pow((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1), 0.5);
        double side3 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);

        double semiPerimeter = (side1 + side2 + side3) / 2.0;
        double area = Math.pow(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3), 0.5);
        double areaRounded = (int) (area * 100) / 100.0;


        //Display the result to the user
        System.out.println("The area of the triangle is " + areaRounded);

    }

}
