package Chapter02;

import java.util.Scanner;

public class Exercise2_15 {
    //Geometry: distance of two points
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the inputs
        System.out.println("Enter the coordinates of two points to calculate their distance\n");

        //Variables input
        System.out.print("Enter x1 and y1 e.g. x1 enter, y1 enter. Enter the numbers: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2 e.g. x2 enter, y2 enter. Enter the numbers: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //Calculating the distance
        double distance = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);

        //Display the result to the user
        System.out.println("The distance between the two points is " + distance);

    }
}