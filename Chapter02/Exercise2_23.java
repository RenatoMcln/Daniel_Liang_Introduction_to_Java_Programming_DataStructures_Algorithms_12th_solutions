package Chapter02;

import java.util.Scanner;

public class Exercise2_23 {
    //Cost of driving
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Instructions
        System.out.println("Enter the distance to drive, the fuel efficiency of\n" +
                           "the car in miles per gallon, and the price per gallon\n" +
                           "to calculate  the cost of the trip");

        //Prompt the user for the inputs
        System.out.print("Enter the driving distance in miles: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: $");
        double priceGallon = input.nextDouble();

        //Calculating price
        double price = (int) (distance / milesPerGallon * priceGallon * 100 + 0.5) / 100.0;

        //Display the result to the user
        System.out.println("The cost of driving is $" + price);

    }
}
