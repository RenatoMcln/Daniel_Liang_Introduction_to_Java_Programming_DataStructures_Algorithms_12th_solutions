package Chapter02;

import java.util.Scanner;

public class Exercise2_04 {
    //Convert pounds into kilograms
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        //Define the required values and variables
        double kilograms = pounds * 0.454;

        //Display the result to the user
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");

    }
}
