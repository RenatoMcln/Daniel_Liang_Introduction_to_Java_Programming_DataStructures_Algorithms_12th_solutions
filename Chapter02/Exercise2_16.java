package Chapter02;

import java.util.Scanner;

public class Exercise2_16 {
    //Geometry: area of a hexagon
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Instructions
        System.out.println("Enter the side length of the hexagon for the computer to display its area.\n");

        //Prompt the user to enter the side of a hexagon
        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();

        //Calculating area
        double area = (int) (3 * Math.pow(3, 0.5) / 2 * side * side * 10000 + 0.5) / 10000.0;

        //Display the result to the user
        System.out.println("The area of the hexagon is " + area);

    }
}
