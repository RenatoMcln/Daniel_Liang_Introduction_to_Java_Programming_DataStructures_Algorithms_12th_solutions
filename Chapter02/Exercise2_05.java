package Chapter02;

import java.util.Scanner;

public class Exercise2_05 {
    //Financial application: calculate tips
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt for the first input
        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();
        //Prompt for the second input
        System.out.print("Enter the gratuity rate as an integer percentage %: ");
        short gratuityRate = input.nextShort();

        //Define the required values and variables
        double gratuity = (gratuityRate / 100.0) * subtotal;
        double total = gratuity + subtotal;

        //Display the result to the user
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

    }
}
