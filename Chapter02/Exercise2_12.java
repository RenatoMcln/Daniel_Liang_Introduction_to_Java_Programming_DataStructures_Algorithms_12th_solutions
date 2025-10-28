package Chapter02;

import java.util.Scanner;

public class Exercise2_12 {
    //Physics: finding runway length
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the first input
        System.out.println("To compute the minimum runway length in meters needed for an airplane to take off\n");
        System.out.print("Enter speed in meters/second: ");
        double speed = input.nextDouble();
        //Prompt the user for the second input
        System.out.print("Enter acceleration in meters/second squared: ");
        double acceleration = input.nextDouble();

        //Calculating the required variables
        double length = (int)(1000 * (speed * speed) / (2 * acceleration) + 0.5) / 1000.0;

        //Display the result to the user
        System.out.println("The minimum runway length for this airplane is " + length + " meters");

    }
}
