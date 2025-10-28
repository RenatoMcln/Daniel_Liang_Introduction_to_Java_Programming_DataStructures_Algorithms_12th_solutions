package Chapter02;

import java.util.Scanner;

public class Exercise2_14 {

    //Health application: computing BMI
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the first input
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        //Prompt the user for the second input
        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        //Calculating the required variables
        double kilograms = pounds * 0.45359237;
        double heightMeters = inches * 0.0254;
        double bmi = (long) (kilograms / (heightMeters * heightMeters) * 1000) / 1000.0;

        //Display the result to the user
        System.out.println("BMI is " + bmi);

    }
}