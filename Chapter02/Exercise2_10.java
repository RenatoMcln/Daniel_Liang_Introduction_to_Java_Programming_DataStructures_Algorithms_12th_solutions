package Chapter02;

import java.util.Scanner;

public class Exercise2_10 {
    //Science: calculating energy
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the first input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterKilos = input.nextDouble();
        //Prompt the user for the second input
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        //prompt the user for the third input
        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        //Define the required variables
        double energy = waterKilos * (finalTemperature - initialTemperature) * 4184;

        //Display the result to the user
        System.out.println("The energy needed is " + energy + " joules");
        
    }
}
