package Chapter03.CaseStudies;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Prompt the user for the input
        System.out.print("Enter your weight in pounds: ");
        double pounds = scan.nextDouble();
        System.out.print("Enter your height in inches: ");
        double inches = scan.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        //Converting
        double kilograms = (int) (pounds * KILOGRAMS_PER_POUND * 1000) / 1000.0;
        double meters = (int) (inches * METERS_PER_INCH * 1000) / 1000.0;

        //Calculating BMI
        double bmi = kilograms / (meters * meters);
        double bmiRounded = (int) (bmi * 100) / 100.0;

        //Display the condition
        if (bmi < 18.5) {
            System.out.println("BMI is: " + bmiRounded + "\nCondition: Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("BMI is: " + bmiRounded + "\nCondition: Normal");
        } else if (bmi >= 25.0 && bmi < 30) {
            System.out.println("BMI is: " + bmiRounded + "\nCondition: Overweight");
        } else {
            System.out.println("BMI is: " + bmiRounded + "\nCondition: Obese");
        }


    }
}

