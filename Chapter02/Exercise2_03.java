package Chapter02;

import java.util.Scanner;

public class Exercise2_03 {
    //Convert feet into meters
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Read the input for feet
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        //Define the required values and variables
        double meters = feet * 0.305;

        //Display the result to the user
        System.out.println(feet + " feet is " + meters + " meters");

    }
}
