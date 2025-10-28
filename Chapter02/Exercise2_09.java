package Chapter02;

import java.util.Scanner;

public class Exercise2_09 {
    //Physics: acceleration
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the first input
        System.out.print("Enter the starting velocity in meters/second: ");
        double v0 = input.nextDouble();
        //Prompt the user for the second input
        System.out.print("Enter the ending velocity in meters/second: ");
        double v1 = input.nextDouble();
        //Prompt the user for the third input
        System.out.print("Enter the time span in seconds: ");
        double timeSpan = input.nextDouble();

        //Calculating the average acceleration
        double average = (v1 - v0) / timeSpan;

        //Display the result to the user
        System.out.println("The average acceleration is " + average);

    }
}
