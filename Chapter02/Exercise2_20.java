package Chapter02;

import java.util.Scanner;

public class Exercise2_20 {
    //Financial application: calculate interest
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user for the input
        System.out.println("Compute the interest on the next monthly payment using the balance and annual interest rate\n");

        System.out.print("Enter balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter the annual interest rate percentage: ");
        double annualInterestRatePercentage = input.nextDouble();

        //calculating the required variables
        double interest = balance * (annualInterestRatePercentage / 100.0 / 12.0);
        double interestRounded = (int) (interest * 100000 + 0.5) / 100000.0;

        //Display the result to the user
        System.out.println("The interest is " + interestRounded);

    }

}
